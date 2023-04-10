package uniandes.isis2304.alohandes.persistencia;

import java.util.List;

import javax.jdo.PersistenceManagerFactory;

import org.apache.log4j.Logger;


public class PersistenciaAlohandes {

	private static Logger log = Logger.getLogger(PersistenciaAlohandes.class.getName());
	
	public final static String SQL = "javax.jdo.query.SQL";
	
	private static PersistenciaAlohandes instance;
	
	private PersistenceManagerFactory pmf;
	
	private List <String> tablas;
	
	private SQLUtil sqlUtil;
	
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
}
