package uniandes.isis2304.alohandes.negocio;

public class ListaIndiceOcupacion {
	
	private int indiceOcupacion;
	
	private long idAlohamiento;
	
	public ListaIndiceOcupacion(int indiceOcupacion, long idAlohamiento) {
		super();
		this.indiceOcupacion = indiceOcupacion;
		this.idAlohamiento = idAlohamiento;
	}
	
	public ListaIndiceOcupacion() {
		this.indiceOcupacion = 0;
		this.idAlohamiento = 0;
	}

	public int getIndiceOcupacion() {
		return indiceOcupacion;
	}

	public void setIndiceOcupacion(int indiceOcupacion) {
		this.indiceOcupacion = indiceOcupacion;
	}

	public long getIdAlohamiento() {
		return idAlohamiento;
	}

	public void setIdAlohamiento(long idAlohamiento) {
		this.idAlohamiento = idAlohamiento;
	}

	@Override
	public String toString() {
		return "[indiceOcupacion=" + indiceOcupacion + ", idAlohamiento=" + idAlohamiento + "]\n";
	}
	
	

}
