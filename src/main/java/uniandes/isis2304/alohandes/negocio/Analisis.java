package uniandes.isis2304.alohandes.negocio;

public class Analisis {
	
	private String fecha;
	
	private int catidad_reservas;
	
	private int ingresos;

	public Analisis(String fecha, int catidad_reservas, int ingresos) {
		super();
		this.fecha = fecha;
		this.catidad_reservas = catidad_reservas;
		this.ingresos = ingresos;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public int getCatidad_reservas() {
		return catidad_reservas;
	}

	public void setCatidad_reservas(int catidad_reservas) {
		this.catidad_reservas = catidad_reservas;
	}

	public int getIngresos() {
		return ingresos;
	}

	public void setIngresos(int ingresos) {
		this.ingresos = ingresos;
	}

	@Override
	public String toString() {
		return "fecha=" + fecha + ", catidad_reservas=" + catidad_reservas + ", ingresos=" + ingresos;
	}
	
	

}
