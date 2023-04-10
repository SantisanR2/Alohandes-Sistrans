package uniandes.isis2304.alohandes.negocio;

public class ViviendaUniversitaria {
	
	private long id;
	
	private String nombre;
	
	private String registroCamara;
	
	private String registroSuperintendencia;

	public ViviendaUniversitaria(long id, String nombre, String registroCamara, String registroSuperintendencia){
		this.id = id;
		this.nombre = nombre;
		this.registroCamara = registroCamara;
		this.registroSuperintendencia = registroSuperintendencia;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRegistroCamara() {
		return registroCamara;
	}

	public void setRegistroCamara(String registroCamara) {
		this.registroCamara = registroCamara;
	}

	public String getRegistroSuperintendencia() {
		return registroSuperintendencia;
	}

	public void setRegistroSuperintendencia(String registroSuperintendencia) {
		this.registroSuperintendencia = registroSuperintendencia;
	}
}
