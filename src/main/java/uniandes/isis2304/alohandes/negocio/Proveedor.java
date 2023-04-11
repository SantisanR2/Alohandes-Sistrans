package uniandes.isis2304.alohandes.negocio;

public class Proveedor {
	
	private long id;
	
	private long idComunidad;
	
	private long idEmpresaHotelera;
	
	private long idPersonaNatural;
	
	private long idViviendaUniversitaria;

	public Proveedor(long id, long idComunidad, long idEmpresaHotelera, long idPersonaNatural,
			long idViviendaUniversitaria) {
		this.id = id;
		this.idComunidad = idComunidad;
		this.idEmpresaHotelera = idEmpresaHotelera;
		this.idPersonaNatural = idPersonaNatural;
		this.idViviendaUniversitaria = idViviendaUniversitaria;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getIdComunidad() {
		return idComunidad;
	}

	public void setIdComunidad(long idComunidad) {
		this.idComunidad = idComunidad;
	}

	public long getIdEmpresaHotelera() {
		return idEmpresaHotelera;
	}

	public void setIdEmpresaHotelera(long idEmpresaHotelera) {
		this.idEmpresaHotelera = idEmpresaHotelera;
	}

	public long getIdPersonaNatural() {
		return idPersonaNatural;
	}

	public void setIdPersonaNatural(long idPersonaNatural) {
		this.idPersonaNatural = idPersonaNatural;
	}

	public long getIdViviendaUniversitaria() {
		return idViviendaUniversitaria;
	}

	public void setIdViviendaUniversitaria(long idViviendaUniversitaria) {
		this.idViviendaUniversitaria = idViviendaUniversitaria;
	}
}
