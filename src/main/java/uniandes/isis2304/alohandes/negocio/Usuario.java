package uniandes.isis2304.alohandes.negocio;

public class Usuario {
	
	private long id;
	
	private String nombre;
	
	private String cedula;
	
	private int edad;
	
	private String celular;
	
	private String vinculacion;

	public Usuario(long id, String nombre, String cedula, int edad, String celular, String vinculacion) {
		this.id = id;
		this.nombre = nombre;
		this.cedula = cedula;
		this.edad = edad;
		this.celular = celular;
		this.vinculacion = vinculacion;
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

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getVinculacion() {
		return vinculacion;
	}

	public void setVinculacion(String vinculacion) {
		this.vinculacion = vinculacion;
	}

}
