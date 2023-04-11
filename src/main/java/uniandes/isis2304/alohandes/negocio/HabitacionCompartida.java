package uniandes.isis2304.alohandes.negocio;

public class HabitacionCompartida{
	
	private long id;
	
	private String nombre;
	
	private String ubicacion;
	
	private String tipoHabitacion;
	
	private int precio;
	
	private int tamanhio;
	
	private long idEmpresaHotelera;
	
	private String horarioApertura;
	
	private String horarioCierre;

	public HabitacionCompartida(long id, String nombre, String ubicacion, String tipoHabitacion, int precio,
			int tamanhio, long idEmpresaHotelera, String horarioApertura, String horarioCierre) {
		this.id = id;
		this.nombre = nombre;
		this.ubicacion = ubicacion;
		this.tipoHabitacion = tipoHabitacion;
		this.precio = precio;
		this.tamanhio = tamanhio;
		this.idEmpresaHotelera = idEmpresaHotelera;
		this.horarioApertura = horarioApertura;
		this.horarioCierre = horarioCierre;
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

	public String getHorarioApertura() {
		return horarioApertura;
	}

	public void setHorarioApertura(String horarioApertura) {
		this.horarioApertura = horarioApertura;
	}

	public String getHorarioCierre() {
		return horarioCierre;
	}

	public void setHorarioCierre(String horarioCierre) {
		this.horarioCierre = horarioCierre;
	}	
}
