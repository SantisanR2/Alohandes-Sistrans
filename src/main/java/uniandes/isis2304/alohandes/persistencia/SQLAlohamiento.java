package uniandes.isis2304.alohandes.persistencia;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;

public class SQLAlohamiento {

    private final static String SQL = PersistenciaAlohandes.SQL;
	private PersistenciaAlohandes pp;

    public SQLAlohamiento (PersistenciaAlohandes pp)
	{
		this.pp = pp;
	}

	/**
	 * Crea y ejecuta la sentencia SQL para eliminar RESERVA de la base de datos por su fecha
	 */
	public long eliminarAlohamientoPorId (PersistenceManager pm, long idAlohamiento)
	{
        Query q = pm.newQuery(SQL, "DELETE FROM " + pp.darTablaAlohamiento  () + " WHERE id = ?");
        q.setParameters(idAlohamiento);
        return (long) q.executeUnique();
	}

}
