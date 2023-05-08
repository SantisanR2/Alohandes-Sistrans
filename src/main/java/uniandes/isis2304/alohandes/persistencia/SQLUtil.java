package uniandes.isis2304.alohandes.persistencia;

import java.util.List;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;

import uniandes.isis2304.alohandes.negocio.ListaDinero;
import uniandes.isis2304.alohandes.negocio.ListaIndiceOcupacion;
import uniandes.isis2304.alohandes.negocio.OfertasPopulares;
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
		return (List<ListaDinero>) q.executeList();
	}
	
	public List<OfertasPopulares> darOfertasMasPopulares(PersistenceManager pm) {
		Query q = pm.newQuery(SQL, "SELECT idalohamiento FROM " + pa.darTablaReserva() + " GROUP BY idalohamiento ORDER BY COUNT(*) DESC");
		q.setResultClass(OfertasPopulares.class);
		return (List<OfertasPopulares>) q.executeList();
	}
	
	public List<ListaIndiceOcupacion> darIndiceOcupacion(PersistenceManager pm) {
		Query q = pm.newQuery(SQL, "SELECT * FROM " + pa.darTablaIndiceOcupacion());
		q.setResultClass(ListaIndiceOcupacion.class);
		return (List<ListaIndiceOcupacion>) q.executeList();
	}
	
	public List<Integer> analizarInformacion(PersistenceManager pm) {
		Query q = pm.newQuery(SQL, "SELECT fecha, COUNT(*) AS cantidad_reservas, SUM(dinero_costo) AS ingresos FROM reservas GROUP BY fecha ORDER BY cantidad_reservas DESC, ingresos DESC");
		q.setResultClass(ListaIndiceOcupacion.class);
		return (List<Integer>) q.executeList();
	}
	
	public List<Usuario> darClientesFrecuentes(PersistenceManager pm, String tipo, Long id) {
		Query q = pm.newQuery(SQL, "SELECT usuarios.* FROM usuarios INNER JOIN reservas r ON u.id = r.id_usuario INNER JOIN alojamientos a ON r.id_alojamiento = a.id WHERE a." + tipo + "= " + id + "GROUP BY u.id HAVING COUNT(*) >= 3");
		q.setResultClass(ListaIndiceOcupacion.class);
		return (List<Usuario>) q.executeList();
	}
	
	public List<OfertasPopulares> darOfertasSinDemanda(PersistenceManager pm) {
		Query q = pm.newQuery(SQL, "SELECT * FROM alojamientos a LEFT JOIN reservas r ON a.id = r.id_alojamiento WHERE r.fecha_reserva IS NULL OR r.fecha_reserva < DATE_SUB(CURDATE(), INTERVAL 1 MONTH)");
		q.setResultClass(OfertasPopulares.class);
		return (List<OfertasPopulares>) q.executeList();
	}
	
	public List<Integer> darUsoAlohandes(PersistenceManager pm, Long id) {
		Query q = pm.newQuery(SQL, "SELECT COUNT(*) AS cantidad_reservas, SUM(dinero_costo) AS total_gastado FROM reservas WHERE id_usuario = " + id);
		q.setResultClass(ListaIndiceOcupacion.class);
		return (List<Integer>) q.executeList();
	}

    public long nextval(PersistenceManager persistenceManager) {
        return 0;
    }
    
}
