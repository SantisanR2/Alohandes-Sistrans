package uniandes.isis2304.alohandes.negocio;

public class Apartamento{

	private long id;

	private String ubicacion;

	private int precio;

	private int precioEspecial;

	private int tamanhio;

	private long idPersonaNatural;

	private boolean amoblado;

	public Apartamento(long id, String ubicacion, int precio, int precioEspecial, int tamanhio, long idPersonaNatural,
			boolean amoblado) {
		this.id = id;
		this.ubicacion = ubicacion;
		this.precio = precio;
		this.precioEspecial = precioEspecial;
		this.tamanhio = tamanhio;
		this.idPersonaNatural = idPersonaNatural;
		this.amoblado = amoblado;
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

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getPrecioEspecial() {
		return precioEspecial;
	}

	public void setPrecioEspecial(int precioEspecial) {
		this.precioEspecial = precioEspecial;
	}

	public int getTamanhio() {
		return tamanhio;
	}

	public void setTamanhio(int tamanhio) {
		this.tamanhio = tamanhio;
	}

	public long getIdPersonaNatural() {
		return idPersonaNatural;
	}

	public void setIdPersonaNatural(long idPersonaNatural) {
		this.idPersonaNatural = idPersonaNatural;
	}

	public boolean isAmoblado() {
		return amoblado;
	}

	public void setAmoblado(boolean amoblado) {
		this.amoblado = amoblado;
	}
}
