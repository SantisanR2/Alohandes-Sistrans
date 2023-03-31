package uniandes.isis2304.alohandes.negocio;

public class PersonaNatural {
	
	private long id;
	
	private String nombre;
	
	private String cedula;
	
	private int edad;
	
	private int dineroRecogido;

	public PersonaNatural(long id, String nombre, String cedula, int edad, int dineroRecogido) {
		this.id = id;
		this.nombre = nombre;
		this.cedula = cedula;
		this.edad = edad;
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

	public int getDineroRecogido() {
		return dineroRecogido;
	}

	public void setDineroRecogido(int dineroRecogido) {
		this.dineroRecogido = dineroRecogido;
	}

}
