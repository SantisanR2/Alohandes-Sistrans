package uniandes.isis2304.alohandes.persistencia;

import java.util.ArrayList;
import java.util.List;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;


import uniandes.isis2304.alohandes.negocio.Alohamiento;
import uniandes.isis2304.alohandes.negocio.Analisis;
import uniandes.isis2304.alohandes.negocio.Funcionamiento;
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
	
	public List<Usuario> darConsumoAlohandes(PersistenceManager pm, String date1, String date2, int or) {
		Query q;
		if (or == 0) {
			q = pm.newQuery(SQL, "SELECT u.* FROM USUARIO u INNER JOIN RESERVA r ON u.id = r.idusuario INNER JOIN ALOHAMIENTO a ON r.idalohamiento = a.id WHERE r.fecha BETWEEN '" + date1 + "' AND '" + date2 + "' ORDER BY u.nombre");
		}
		else {
			q = pm.newQuery(SQL, "SELECT u.* FROM USUARIO u INNER JOIN RESERVA r ON u.id = r.idusuario INNER JOIN ALOHAMIENTO a ON r.idalohamiento = a.id WHERE r.fecha BETWEEN '" + date1 + "' AND '" + date2 + "' ORDER BY a.id");
		}
		q.setResultClass(Object[].class);
	    List<Object[]> results = (List<Object[]>) q.executeList();

	    List<Usuario> consumoAlohandesList = new ArrayList<>();

	    for (Object[] result : results) {
	    	Long id = ((Number) result[0]).longValue();
	        String nombre = (String) result[1];
	        String cedula = (String) result[2];
	        int edad = ((Number) result[3]).intValue();
	        String celular = (String) result[4];
	        String vinculacion = (String) result[5];
	        consumoAlohandesList.add(new Usuario(id, nombre, cedula, edad, celular, vinculacion));
	    }

	    return consumoAlohandesList;
	}
	
	public List<Usuario> darConsumoAlohandesV2(PersistenceManager pm, String date1, String date2, int or) {
		Query q;
		if (or == 0) {
			q = pm.newQuery(SQL, "SELECT u.* FROM USUARIO u WHERE NOT EXISTS (SELECT 1 FROM RESERVA r INNER JOIN ALOHAMIENTO a ON r.idalohamiento = a.id WHERE r.idusuario = u.id AND r.fecha BETWEEN '" + date1 + "' AND '" + date2 + "') ORDER BY u.nombre");
		}
		else {
			q = pm.newQuery(SQL, "SELECT u.* FROM USUARIO u WHERE NOT EXISTS (SELECT 1 FROM RESERVA r INNER JOIN ALOHAMIENTO a ON r.idalohamiento = a.id WHERE r.idusuario = u.id AND r.fecha BETWEEN '" + date1 + "' AND '" + date2 + "') ORDER BY a.id");
		}
		q.setResultClass(Object[].class);
	    List<Object[]> results = (List<Object[]>) q.executeList();

	    List<Usuario> consumoAlohandesList = new ArrayList<>();

	    for (Object[] result : results) {
	    	Long id = ((Number) result[0]).longValue();
	        String nombre = (String) result[1];
	        String cedula = (String) result[2];
	        int edad = ((Number) result[3]).intValue();
	        String celular = (String) result[4];
	        String vinculacion = (String) result[5];
	        consumoAlohandesList.add(new Usuario(id, nombre, cedula, edad, celular, vinculacion));
	    }

	    return consumoAlohandesList;
	}
	
	public List<Funcionamiento> darFuncionamiento(PersistenceManager pm) {
		Query q = pm.newQuery(SQL, "SELECT semana, MAX(alojamiento_reservas) AS alojamiento_max_reservas, MIN(alojamiento_reservas) AS alojamiento_min_reservas FROM (SELECT semana, idalohamiento AS alojamiento_reservas, ROW_NUMBER() OVER (PARTITION BY semana ORDER BY contador_reservas DESC) AS rn_max, ROW_NUMBER() OVER (PARTITION BY semana ORDER BY contador_reservas ASC) AS rn_min FROM (SELECT TO_CHAR(r.fecha, 'IW') AS semana, r.idalohamiento, COUNT(*) AS contador_reservas FROM RESERVA r GROUP BY TO_CHAR(r.fecha, 'IW'), r.idalohamiento) r) WHERE rn_max = 1 OR rn_min = 1 GROUP BY semana");
		q.setResultClass(Object[].class);
	    List<Object[]> results = (List<Object[]>) q.executeList();

	    List<Funcionamiento> funcionamiento = new ArrayList<>();

	    for (Object[] result : results) {
	    	String semana = (String) result[0];
	    	Long idMax = ((Number) result[1]).longValue();
	    	Long idMin = ((Number) result[2]).longValue();
	        funcionamiento.add(new Funcionamiento(semana, idMax, idMin));
	    }

	    return funcionamiento;
	}
	
	public List<Usuario> darBuenosClientes(PersistenceManager pm) {
	    Query q = pm.newQuery(SQL, "WITH meses AS (SELECT ADD_MONTHS(TO_DATE('01/01/2023', 'DD/MM/YYYY'), LEVEL - 1) AS fecha FROM DUAL CONNECT BY LEVEL <= MONTHS_BETWEEN(TRUNC(SYSDATE, 'MM'), TO_DATE('01/01/2023', 'DD/MM/YYYY')) + 1) SELECT u.id, u.nombre, u.cedula, u.edad, u.celular, u.vinculacion FROM USUARIO u WHERE (SELECT COUNT(DISTINCT EXTRACT(MONTH FROM r.fecha)) FROM meses m LEFT JOIN RESERVA r ON u.id = r.idusuario AND TRUNC(r.fecha, 'MM') = TRUNC(m.fecha, 'MM') WHERE r.idusuario IS NOT NULL) = (SELECT COUNT(*) FROM meses)");
	    q.setResultClass(Object.class);

	    List<Object> results = (List<Object>) q.executeList();
	    List<Usuario> buenosClientesList = new ArrayList<>();

	    for (Object result : results) {
	        Object[] objArray = (Object[]) result;
	        Long id = ((Number) objArray[0]).longValue();
	        String nombre = (String) objArray[1];
	        String cedula = (String) objArray[2];
	        int edad = ((Number) objArray[3]).intValue();
	        String celular = (String) objArray[4];
	        String vinculacion = (String) objArray[5];
	        buenosClientesList.add(new Usuario(id, nombre, cedula, edad, celular, vinculacion));
	    }

	    return buenosClientesList;
	}





    public long nextval(PersistenceManager persistenceManager) {
        return 0;
    }

}
