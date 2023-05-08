package uniandes.isis2304.alohandes.negocio;

public class ListaDinero {

	private int dinero;

	private int anhio;

	private long idProveedor;

	public ListaDinero(int dinero, int anhio, long idProveedor) {
		super();
		this.dinero = dinero;
		this.anhio = anhio;
		this.idProveedor = idProveedor;
	}

	public ListaDinero() {
		this.dinero = 0;
		this.anhio = 0;
		this.idProveedor = 0;
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

	@Override
	public String toString() {
		return "[dinero=" + dinero + ", anhio=" + anhio + ", idProveedor=" + idProveedor + "]\n";
	}



}
