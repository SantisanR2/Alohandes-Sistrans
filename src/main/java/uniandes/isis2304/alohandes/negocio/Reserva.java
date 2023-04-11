package uniandes.isis2304.alohandes.negocio;

public class Reserva {
	
	private long id;
	
	private String fecha;
	
	private int precio;
	
	private long idAlohamiento;
	
	private long idUsuario;

	public Reserva(long id, String fecha, int precio, long idAlohamiento, long idUsuario) {
		this.id = id;
		this.fecha = fecha;
		this.precio = precio;
		this.idAlohamiento = idAlohamiento;
		this.idUsuario = idUsuario;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
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

	public long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(long idUsuario) {
		this.idUsuario = idUsuario;
	}
}
