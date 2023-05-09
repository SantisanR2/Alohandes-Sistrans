package uniandes.isis2304.alohandes.negocio;

public class UsoAlohandes {
	
	private int cantidad_reservas;
	
	private int total_gastado;

	public UsoAlohandes(int cantidad_reservas, int total_gastado) {
		super();
		this.cantidad_reservas = cantidad_reservas;
		this.total_gastado = total_gastado;
	}

	public int getCantidad_reservas() {
		return cantidad_reservas;
	}

	public void setCantidad_reservas(int cantidad_reservas) {
		this.cantidad_reservas = cantidad_reservas;
	}

	public int getTotal_gastado() {
		return total_gastado;
	}

	public void setTotal_gastado(int total_gastado) {
		this.total_gastado = total_gastado;
	}

	@Override
	public String toString() {
		return "cantidad_reservas: " + cantidad_reservas + ", total_gastado: " + total_gastado;
	}

	

}
