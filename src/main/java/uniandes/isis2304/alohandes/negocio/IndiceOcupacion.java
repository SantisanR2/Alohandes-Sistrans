package uniandes.isis2304.alohandes.negocio;

public class IndiceOcupacion {
	
	private int indiceOcupacion;
	
	private long idAlohamiento;

	public IndiceOcupacion(int indiceOcupacion, long idAlohamiento) {
		this.indiceOcupacion = indiceOcupacion;
		this.idAlohamiento = idAlohamiento;
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
}
