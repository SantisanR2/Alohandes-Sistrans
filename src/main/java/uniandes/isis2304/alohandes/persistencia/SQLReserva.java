package uniandes.isis2304.alohandes.persistencia;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;

public class SQLReserva {

    private final static String SQL = PersistenciaAlohandes.SQL;
	private PersistenciaAlohandes pp;

    public SQLReserva (PersistenciaAlohandes pp)
	{
		this.pp = pp;
	}
	
    public long adicionarReserva (PersistenceManager pm, long idReserva, String fecha, int precio, 
                                long idAlohamiento, long idUsuario) 
	{
        Query q = pm.newQuery(SQL, "INSERT INTO " + pp.darTablaReserva  () + "(id, fecha, precio, idAlohamiento, idUsuario) values (?, ?, ?, ?, ?)");
        q.setParameters(idReserva, fecha, precio, idAlohamiento, idUsuario);
        return (long) q.executeUnique();            
	}

	/**
	 * Crea y ejecuta la sentencia SQL para eliminar RESERVA de la base de datos por su fecha
	 */
	public long eliminarReservaPorFecha (PersistenceManager pm, String fechaReserva)
	{
        Query q = pm.newQuery(SQL, "DELETE FROM " + pp.darTablaReserva  () + " WHERE fecha = ?");
        q.setParameters(fechaReserva);
        return (long) q.executeUnique();            
	}

}
