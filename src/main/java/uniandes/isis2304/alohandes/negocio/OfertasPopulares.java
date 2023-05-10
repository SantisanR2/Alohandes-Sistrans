package uniandes.isis2304.alohandes.negocio;

public class OfertasPopulares {

	@Override
	public String toString() {
		return "idAlohamiento=" + idAlohamiento + "\n";
	}

	private long idAlohamiento;

	public OfertasPopulares(long idAlohamiento) {
		super();
		this.idAlohamiento = idAlohamiento;
	}

	public OfertasPopulares() {
		this.idAlohamiento = 0;
	}

	public long getIdAlohamiento() {
		return idAlohamiento;
	}

	public void setIdAlohamiento(long idAlohamiento) {
		this.idAlohamiento = idAlohamiento;
	}



}
