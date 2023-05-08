package uniandes.isis2304.alohandes.negocio;

public class Hotel {

	private long id;

	private String nombre;

	private String ubicacion;

	private String tipoHabitacion;

	private int precio;

	private int tamanhio;

	private long idEmpresaHotelera;

	public Hotel(long id, String nombre, String ubicacion, String tipoHabitacion, int precio, int tamanhio, long idEmpresaHotelera) {
		this.id = id;
		this.nombre = nombre;
		this.ubicacion = ubicacion;
		this.tipoHabitacion = tipoHabitacion;
		this.precio = precio;
		this.tamanhio = tamanhio;
		this.idEmpresaHotelera = idEmpresaHotelera;
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

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public String getTipoHabitacion() {
		return tipoHabitacion;
	}

	public void setTipoHabitacion(String tipoHabitacion) {
		this.tipoHabitacion = tipoHabitacion;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getTamanhio() {
		return tamanhio;
	}

	public void setTamanhio(int tamanhio) {
		this.tamanhio = tamanhio;
	}

	public long getIdEmpresaHotelera() {
		return idEmpresaHotelera;
	}

	public void setIdEmpresaHotelera(long idEmpresaHotelera) {
		this.idEmpresaHotelera = idEmpresaHotelera;
	}

}
