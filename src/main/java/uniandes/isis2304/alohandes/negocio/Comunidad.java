package uniandes.isis2304.alohandes.negocio;

public class Comunidad {

	private long id;
	
	private String nombre;
	
	private int edad;
	
	private int dineroRecogido;
	
	public Comunidad(long id, String nombre, int edad, int dineroRecogido) {
		this.id = id;
		this.nombre = nombre;
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
