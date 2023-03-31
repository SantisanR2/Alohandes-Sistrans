package uniandes.isis2304.alohandes.negocio;

public class ViviendaUniversitaria {
	
	private long id;
	
	private String nombre;
	
	private String registroCamara;
	
	private String registroSuperintendencia;
	
	private int dineroRecogido;

	public ViviendaUniversitaria(long id, String nombre, String registroCamara, String registroSuperintendencia, int dineroRecogido){
		this.id = id;
		this.nombre = nombre;
		this.registroCamara = registroCamara;
		this.registroSuperintendencia = registroSuperintendencia;
		this.dineroRecogido = dineroRecogido;
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

	public int getDineroRecogido() {
		return dineroRecogido;
	}

	public void setDineroRecogido(int dineroRecogido) {
		this.dineroRecogido = dineroRecogido;
	}

}
