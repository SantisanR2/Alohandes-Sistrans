package uniandes.isis2304.alohandes.negocio;

public class DineroRecibido {
	
	private int dinero;
	
	private int anhio;
	
	private long idProveedor;

	public DineroRecibido(int dinero, int anhio, long idProveedor) {
		this.dinero = dinero;
		this.anhio = anhio;
		this.idProveedor = idProveedor;
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

	public long getIdProveedor() {
		return idProveedor;
	}

	public void setIdProveedor(long idProveedor) {
		this.idProveedor = idProveedor;
	}
}
