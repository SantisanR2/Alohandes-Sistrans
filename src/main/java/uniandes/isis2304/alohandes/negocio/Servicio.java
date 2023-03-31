package uniandes.isis2304.alohandes.negocio;

public class Servicio {
	
	private long id;
	
	private String nombre;
	
	private String descripcion;
	
	private int precio;
	
	private long idHotel;
	
	private long idHabitacionVivienda;
	
	private long idViviendaPorDia;
	
	private long idViviendaPorSemestre;

	public Servicio(long id, String nombre, String descripcion, int precio, long idHotel, long idHabitacionVivienda,
			long idViviendaPorDia, long idViviendaPorSemestre) {
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio = precio;
		this.idHotel = idHotel;
		this.idHabitacionVivienda = idHabitacionVivienda;
		this.idViviendaPorDia = idViviendaPorDia;
		this.idViviendaPorSemestre = idViviendaPorSemestre;
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

	public long getIdHotel() {
		return idHotel;
	}

	public void setIdHotel(long idHotel) {
		this.idHotel = idHotel;
	}

	public long getIdHabitacionVivienda() {
		return idHabitacionVivienda;
	}

	public void setIdHabitacionVivienda(long idHabitacionVivienda) {
		this.idHabitacionVivienda = idHabitacionVivienda;
	}

	public long getIdViviendaPorDia() {
		return idViviendaPorDia;
	}

	public void setIdViviendaPorDia(long idViviendaPorDia) {
		this.idViviendaPorDia = idViviendaPorDia;
	}

	public long getIdViviendaPorSemestre() {
		return idViviendaPorSemestre;
	}

	public void setIdViviendaPorSemestre(long idViviendaPorSemestre) {
		this.idViviendaPorSemestre = idViviendaPorSemestre;
	}

}
