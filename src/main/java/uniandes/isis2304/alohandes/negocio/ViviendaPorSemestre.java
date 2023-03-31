package uniandes.isis2304.alohandes.negocio;

public class ViviendaPorSemestre {
	
	private long id;
	
	private String ubicacion;
	
	private int capacidadHabitacion;
	
	private String menaje;
	
	private int precio;
	
	private int tamanhio;

	private long idViviendaUniversitaria;

	public ViviendaPorSemestre(long id, String ubicacion, int capacidadHabitacion, String menaje, int precio,
			int tamanhio, long idViviendaUniversitaria) {
		this.id = id;
		this.ubicacion = ubicacion;
		this.capacidadHabitacion = capacidadHabitacion;
		this.menaje = menaje;
		this.precio = precio;
		this.tamanhio = tamanhio;
		this.idViviendaUniversitaria = idViviendaUniversitaria;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public int getCapacidadHabitacion() {
		return capacidadHabitacion;
	}

	public void setCapacidadHabitacion(int capacidadHabitacion) {
		this.capacidadHabitacion = capacidadHabitacion;
	}

	public String getMenaje() {
		return menaje;
	}

	public void setMenaje(String menaje) {
		this.menaje = menaje;
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

	public long getIdViviendaUniversitaria() {
		return idViviendaUniversitaria;
	}

	public void setIdViviendaUniversitaria(long idViviendaUniversitaria) {
		this.idViviendaUniversitaria = idViviendaUniversitaria;
	}

}
