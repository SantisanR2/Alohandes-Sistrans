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
	
	//Agregar las clases SQL
}
