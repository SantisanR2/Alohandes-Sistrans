package uniandes.isis2304.alohandes.persistencia;

import java.util.List;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;

import uniandes.isis2304.alohandes.negocio.ListaDinero;
import uniandes.isis2304.alohandes.negocio.ListaIndiceOcupacion;
import uniandes.isis2304.alohandes.negocio.OfertasPopulares;

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

    public long nextval(PersistenceManager persistenceManager) {
        return 0;
    }
    
}
