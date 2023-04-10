package uniandes.isis2304.alohandes.negocio;

public class DineroRecibido {
	
	private int dinero;
	
	private int anhio;
	
	private long idComunidad;
	
	private long idEmpresaHotelera;
	
	private long idPersonaNatural;
	
	private long idViviendaUniversitaria;

	public DineroRecibido(int dinero, int anhio, long idComunidad, long idEmpresaHotelera, long idPersonaNatural, long idViviendaUniversitaria) {
		this.dinero = dinero;
		this.anhio = anhio;
		this.idComunidad = idComunidad;
		this.idEmpresaHotelera = idEmpresaHotelera;
		this.idPersonaNatural = idPersonaNatural;
		this.idViviendaUniversitaria = idViviendaUniversitaria;
	}

	public int getDinero() {
		return dinero;
	}

	public void setDinero(int dinero) {
		this.dinero = dinero;
	}

	public int getAnhio() {
		return anhio;
	}

	public void setAnhio(int anhio) {
		this.anhio = anhio;
	}
}
