package uniandes.isis2304.alohandes.negocio;

public class ViviendaPorDia {
	
	private long id;
	
	private String ubicacion;
	
	private String caracteristicasVivienda;
	
	private String caracteristicasSeguro;
	
	private int precio;
	
	private int tamanhio;

	private long idComunidad;

	public ViviendaPorDia(long id, String ubicacion, String caracteristicasVivienda, String caracteristicasSeguro,
			int precio, int tamanhio, long idComunidad) {
		this.id = id;
		this.ubicacion = ubicacion;
		this.caracteristicasVivienda = caracteristicasVivienda;
		this.caracteristicasSeguro = caracteristicasSeguro;
		this.precio = precio;
		this.tamanhio = tamanhio;
		this.idComunidad = idComunidad;
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

	public String getCaracteristicasVivienda() {
		return caracteristicasVivienda;
	}

	public void setCaracteristicasVivienda(String caracteristicasVivienda) {
		this.caracteristicasVivienda = caracteristicasVivienda;
	}

	public String getCaracteristicasSeguro() {
		return caracteristicasSeguro;
	}

	public void setCaracteristicasSeguro(String caracteristicasSeguro) {
		this.caracteristicasSeguro = caracteristicasSeguro;
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

	public long getIdComunidad() {
		return idComunidad;
	}

	public void setIdComunidad(long idComunidad) {
		this.idComunidad = idComunidad;
	}
	
}
