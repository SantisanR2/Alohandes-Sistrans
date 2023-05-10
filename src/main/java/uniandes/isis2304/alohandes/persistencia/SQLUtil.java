package uniandes.isis2304.alohandes.persistencia;

import java.util.ArrayList;
import java.util.List;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;

import uniandes.isis2304.alohandes.negocio.Alohamiento;
import uniandes.isis2304.alohandes.negocio.Analisis;
import uniandes.isis2304.alohandes.negocio.ListaDinero;
import uniandes.isis2304.alohandes.negocio.ListaIndiceOcupacion;
import uniandes.isis2304.alohandes.negocio.OfertasPopulares;
import uniandes.isis2304.alohandes.negocio.UsoAlohandes;
import uniandes.isis2304.alohandes.negocio.Usuario;

public class SQLUtil {

	private final static String SQL = PersistenciaAlohandes.SQL;

	private PersistenciaAlohandes pa;

	public SQLUtil (PersistenciaAlohandes pa) {
		this.pa = pa;
	}

	public List<ListaDinero> darDineroPorAnhio(PersistenceManager pm, int anhio) {
		Query q = pm.newQuery(SQL, "SELECT * FROM " + pa.darTablaDineroRecibido() + " WHERE anhio=" + anhio);
		q.setResultClass(ListaDinero.class);
		return q.executeList();
	}

	public List<OfertasPopulares> darOfertasMasPopulares(PersistenceManager pm) {
		Query q = pm.newQuery(SQL, "SELECT idalohamiento FROM " + pa.darTablaReserva() + " GROUP BY idalohamiento ORDER BY COUNT(*) DESC");
		q.setResultClass(OfertasPopulares.class);
		return q.executeList();
	}

	public List<ListaIndiceOcupacion> darIndiceOcupacion(PersistenceManager pm) {
		Query q = pm.newQuery(SQL, "SELECT * FROM " + pa.darTablaIndiceOcupacion());
		q.setResultClass(ListaIndiceOcupacion.class);
		return q.executeList();
	}

	public List<Analisis> analizarInformacion(PersistenceManager pm, int i) {
		Query q;
		if(i == 0) {
			q = pm.newQuery(SQL, "SELECT fecha, COUNT(*), SUM(precio) FROM reserva WHERE TO_DATE(fecha, 'yyyy-mm-dd') >= ADD_MONTHS(SYSDATE, -1) GROUP BY fecha ORDER BY COUNT(*) DESC, SUM(precio) DESC");
		}
		else {
			q = pm.newQuery(SQL, "SELECT fecha, COUNT(*), SUM(precio) FROM reserva WHERE TRUNC(TO_DATE(fecha, 'yyyy-mm-dd'), 'IW') = TRUNC(SYSDATE, 'IW') GROUP BY fecha ORDER BY COUNT(*) DESC, SUM(precio) DESC");
		}
		q.setResultClass(Object[].class);
	    List<Object[]> results = (List<Object[]>) q.executeList();

	    List<Analisis> analisisList = new ArrayList<>();

	    for (Object[] result : results) {
	    	String fecha = (String) result[0];
	        int count = ((Number) result[1]).intValue();
	        int sum = ((Number) result[2]).intValue();
	        analisisList.add(new Analisis(fecha, count, sum));
	    }

	    return analisisList;
	}

	public List<Usuario> darClientesFrecuentes(PersistenceManager pm, String tipo, Long pid) {
		Query q = pm.newQuery(SQL, "SELECT usuario.* FROM usuario INNER JOIN reserva r ON usuario.id = r.idusuario INNER JOIN alohamiento a ON r.idalohamiento = a.id WHERE a."+ tipo +" = "+ pid +" GROUP BY usuario.id, usuario.nombre, usuario.cedula, usuario.edad, usuario.celular, usuario.vinculacion HAVING COUNT(*) >= 3");
		q.setResultClass(Object[].class);
	    List<Object[]> results = (List<Object[]>) q.executeList();

	    List<Usuario> usuarioList = new ArrayList<>();

	    for (Object[] result : results) {
	    	Long id = ((Number) result[0]).longValue();
	        String nombre = (String) result[1];
	        String cedula = (String) result[2];
	        int edad = ((Number) result[3]).intValue();
	        String celular = (String) result[4];
	        String vinculacion = (String) result[5];
	        usuarioList.add(new Usuario(id, nombre, cedula, edad, celular, vinculacion));
	    }

	    return usuarioList;
	}

	public List<OfertasPopulares> darOfertasSinDemanda(PersistenceManager pm) {
		Query q = pm.newQuery(SQL, "SELECT alohamiento.id FROM alohamiento LEFT JOIN reserva ON alohamiento.id = reserva.id WHERE reserva.fecha IS NULL OR TO_DATE(fecha, 'yyyy-mm-dd') >= ADD_MONTHS(SYSDATE, -1)");
		q.setResultClass(Object[].class);
	    List<Object[]> results = (List<Object[]>) q.executeList();

	    List<OfertasPopulares> ofertasList = new ArrayList<>();

	    for (Object[] result : results) {
	    	Long id = ((Number) result[0]).longValue();
	        ofertasList.add(new OfertasPopulares(id));
	    }

	    return ofertasList;
	}

	public List<UsoAlohandes> darUsoAlohandes(PersistenceManager pm, Long id) {
		Query q = pm.newQuery(SQL, "SELECT COUNT(*), SUM(precio) FROM RESERVA WHERE idusuario = " + id);
		q.setResultClass(Object[].class);
	    List<Object[]> results = (List<Object[]>) q.executeList();

	    List<UsoAlohandes> usoAlohandesList = new ArrayList<>();

	    for (Object[] result : results) {
	        int count = ((Number) result[0]).intValue();
	        int sum = ((Number) result[1]).intValue();
	        usoAlohandesList.add(new UsoAlohandes(count, sum));
	    }

	    return usoAlohandesList;
	}

    public long nextval(PersistenceManager persistenceManager) {
        return 0;
    }

}
