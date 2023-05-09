package uniandes.isis2304.alohandes.persistencia;

import java.util.LinkedList;
import java.util.List;

import javax.jdo.JDODataStoreException;
import javax.jdo.JDOHelper;
import javax.jdo.PersistenceManager;
import javax.jdo.PersistenceManagerFactory;
import javax.jdo.Transaction;

import org.apache.log4j.Logger;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import uniandes.isis2304.alohandes.negocio.ListaDinero;
import uniandes.isis2304.alohandes.negocio.ListaIndiceOcupacion;
import uniandes.isis2304.alohandes.negocio.OfertasPopulares;
import uniandes.isis2304.alohandes.negocio.Reserva;
import uniandes.isis2304.alohandes.negocio.UsoAlohandes;


public class PersistenciaAlohandes {

	private static Logger log = Logger.getLogger(PersistenciaAlohandes.class.getName());

	public final static String SQL = "javax.jdo.query.SQL";

	private static PersistenciaAlohandes instance;

	private PersistenceManagerFactory pmf;

	private List <String> tablas;

	private SQLUtil sqlUtil;

	private SQLAlohamiento sqlAlohamiento;

	private SQLApartamento sqlApartamento;

	private SQLComunidad sqlComunidad;

	private SQLEmpresaHotelera sqlEmpresaHotelera;

	private SQLHabitacionCompartida sqlHabitacionCompartida;

	private SQLHabitacionVivienda sqlHabitacionVivienda;

	private SQLHotel sqlHotel;

	private SQLPersonaNatural sqlPersonaNatural;

	private SQLReserva sqlReserva;

	private SQLServicio sqlServicio;

	private SQLUsuario sqlUsuario;

	private SQLViviendaPorDia sqlViviendaPorDia;

	private SQLViviendaPorSemestre sqlViviendaPorSemestre;

	private SQLViviendaUniversitaria sqlViviendaUniversitaria;

	//Agregar las clases SQL


	private List <String> leerNombresTablas (JsonObject tableConfig)
	{
		JsonArray nombres = tableConfig.getAsJsonArray("tablas") ;

		List <String> resp = new LinkedList <> ();
		for (JsonElement nom : nombres)
		{
			resp.add (nom.getAsString ());
		}

		return resp;
	}

	private String darDetalleException(Exception e)
	{
		String resp = "";
		if (e.getClass().getName().equals("javax.jdo.JDODataStoreException"))
		{
			JDODataStoreException je = (javax.jdo.JDODataStoreException) e;
			return je.getNestedExceptions() [0].getMessage();
		}
		return resp;
	}

	public String darTablaAlohamiento ()
	{
		return tablas.get (0);
	}

	public String darTablaReserva ()
	{
		return "RESERVA";
	}

	public PersistenciaAlohandes ()
	{
		pmf = JDOHelper.getPersistenceManagerFactory("Alohandes");
		crearClasesSQL ();

		// Define los nombres por defecto de las tablas de la base de datos
		tablas = new LinkedList<> ();
		tablas.add ("alohandes_sequence");
		tablas.add ("RESERVA");
		tablas.add ("ALOHAMIENTO");
}

	private void crearClasesSQL ()
		{
			sqlReserva = new SQLReserva(this);
			sqlAlohamiento = new SQLAlohamiento(this);
			sqlUtil = new SQLUtil(this);
		}

	private long nextval ()
	{
        long resp = sqlUtil.nextval (pmf.getPersistenceManager());
        log.trace ("Generando secuencia: " + resp);
        return resp;
    }
		/**
	 * Método que inserta, de manera transaccional, una tupla en la tabla Reserva
	 */
	public Reserva adicionarReserva(String fecha, int precio, long idAlohamiento, long idUsuario)
	{
		PersistenceManager pm = pmf.getPersistenceManager();
        Transaction tx=pm.currentTransaction();
        try
        {
            tx.begin();
            long idReserva = nextval ();
            long tuplasInsertadas = sqlReserva.adicionarReserva(pm, idReserva, fecha, precio, idAlohamiento, idUsuario);
            tx.commit();

            log.trace ("Inserción de reserva: " + fecha + ": " + tuplasInsertadas + " tuplas insertadas");

            return new Reserva (idReserva, fecha, precio, idAlohamiento, idUsuario);
        }
        catch (Exception e)
        {
//        	e.printStackTrace();
        	log.error ("Exception : " + e.getMessage() + "\n" + darDetalleException(e));
        	return null;
        }
        finally
        {
            if (tx.isActive())
            {
                tx.rollback();
            }
            pm.close();
        }
	}

	/**
	 * Método que elimina, de manera transaccional, una tupla en la tabla Reserva, dado la fecha
	 */
	public long eliminarReservaPorFecha (String fecha)
	{
		PersistenceManager pm = pmf.getPersistenceManager();
        Transaction tx=pm.currentTransaction();
        try
        {
            tx.begin();
            long resp = sqlReserva.eliminarReservaPorFecha(pm, fecha);
            tx.commit();
            return resp;
        }
        catch (Exception e)
        {
//        	e.printStackTrace();
        	log.error ("Exception : " + e.getMessage() + "\n" + darDetalleException(e));
            return -1;
        }
        finally
        {
            if (tx.isActive())
            {
                tx.rollback();
            }
            pm.close();
        }
	}

	public long eliminarAlohamientoPorId (long idAlohamiento)
	{
		PersistenceManager pm = pmf.getPersistenceManager();
        Transaction tx=pm.currentTransaction();
        try
        {
            tx.begin();
            long resp = sqlAlohamiento.eliminarAlohamientoPorId(pm, idAlohamiento);
            tx.commit();
            return resp;
        }
        catch (Exception e)
        {
//        	e.printStackTrace();
        	log.error ("Exception : " + e.getMessage() + "\n" + darDetalleException(e));
            return -1;
        }
        finally
        {
            if (tx.isActive())
            {
                tx.rollback();
            }
            pm.close();
        }
	}

	public String darDineroRecibido(int anhio) {
		PersistenceManager pm = pmf.getPersistenceManager();
        Transaction tx=pm.currentTransaction();
        try
        {
            tx.begin();
            List<ListaDinero> resp = sqlUtil.darDineroPorAnhio(pm, anhio);
            tx.commit();
            String str = "";
            for (ListaDinero element : resp) {
				str += element.toString();
			}
            return str;
        }
        catch (Exception e)
        {
//        	e.printStackTrace();
        	log.error ("Exception : " + e.getMessage() + "\n" + darDetalleException(e));
            return e.getMessage();
        }
        finally
        {
            if (tx.isActive())
            {
                tx.rollback();
            }
            pm.close();
        }
	}

	public String dar20MasPopulares() {
		PersistenceManager pm = pmf.getPersistenceManager();
        Transaction tx=pm.currentTransaction();
        try
        {
            tx.begin();
            List<OfertasPopulares> resp = sqlUtil.darOfertasMasPopulares(pm);
            tx.commit();
            String str = "En orden los alojamientos más populares son: \n";
            for (OfertasPopulares element : resp) {
				str += element.toString();
			}
            return str;
        }
        catch (Exception e)
        {
//        	e.printStackTrace();
        	log.error ("Exception : " + e.getMessage() + "\n" + darDetalleException(e));
            return "-1";
        }
        finally
        {
            if (tx.isActive())
            {
                tx.rollback();
            }
            pm.close();
        }
	}

	public String darIndiceOcupacion() {
		PersistenceManager pm = pmf.getPersistenceManager();
        Transaction tx=pm.currentTransaction();
        try
        {
            tx.begin();
            List<ListaIndiceOcupacion> resp = sqlUtil.darIndiceOcupacion(pm);
            tx.commit();
            String str = "";
            for (ListaIndiceOcupacion element : resp) {
				str += element.toString();
			}
            return str;
        }
        catch (Exception e)
        {
//        	e.printStackTrace();
        	log.error ("Exception : " + e.getMessage() + "\n" + darDetalleException(e));
            return "-1";
        }
        finally
        {
            if (tx.isActive())
            {
                tx.rollback();
            }
            pm.close();
        }
	}
	
	public String darUsoAlohandes(Long id) {
		PersistenceManager pm = pmf.getPersistenceManager();
        Transaction tx=pm.currentTransaction();
        try
        {
            tx.begin();
            List<UsoAlohandes> resp = sqlUtil.darUsoAlohandes(pm, id);
            tx.commit();
            String str = "";
            for (UsoAlohandes element : resp) {
				str += element.toString();
			}
            return str;
        }
        catch (Exception e)
        {
//        	e.printStackTrace();
        	log.error ("Exception : " + e.getMessage() + "\n" + darDetalleException(e));
            return "-1";
        }
        finally
        {
            if (tx.isActive())
            {
                tx.rollback();
            }
            pm.close();
        }
	}

	public String darTablaDineroRecibido() {
		return "DINERORECIBIDO";
	}

	public String darTablaIndiceOcupacion() {
		return "INDICEOCUPACION";
	}
}
