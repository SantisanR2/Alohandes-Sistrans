package uniandes.isis2304.alohandes.negocio;

public class Servicio {

	private long id;

	private String nombre;

	private String descripcion;

	private int precio;

	private long idAlohamiento;

	public Servicio(long id, String nombre, String descripcion, int precio, long idAlohamiento) {
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio = precio;
		this.idAlohamiento = idAlohamiento;
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

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public long getIdAlohamiento() {
		return idAlohamiento;
	}

	public void setIdAlohamiento(long idAlohamiento) {
		this.idAlohamiento = idAlohamiento;
	}
}
