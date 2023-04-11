package uniandes.isis2304.alohandes.persistencia;

import java.util.List;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;

public class SQLUtil {
	
	private final static String SQL = PersistenciaAlohandes.SQL;
	
	private PersistenciaAlohandes pa;
	
	public SQLUtil (PersistenciaAlohandes pa) {
		this.pa = pa;
	}
	
	public List darDineroPorAnhio(PersistenceManager pm, int anhio) {
		Query q = pm.newQuery(SQL, "SELECT * FROM " + pa.darTablaDineroRecibido() + " WHERE anhio=" + anhio);
		return q.executeResultList();
	}
	
	public List darOfertasMasPopulares(PersistenceManager pm) {
		Query q = pm.newQuery(SQL, "SELECT idalohamiento, COUNT(*) FROM " + pa.darTablaDineroRecibido() + " GROUP BY idalohamiento ORDER BY COUNT(*) DESC");
		return q.executeResultList();
	}
	
	public List darIndiceOcupacion(PersistenceManager pm) {
		Query q = pm.newQuery(SQL, "SELECT * FROM " + pa.darTablaIndiceOcupacion());
		return q.executeResultList();
	}
}
