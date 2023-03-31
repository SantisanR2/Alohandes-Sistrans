package uniandes.isis2304.alohandes.negocio;

public class Apartamento extends HabitacionVivienda{
	
	private boolean amoblado;
	
	public Apartamento(long id, String ubicacion, int precio, int precioEspecial, int tamanhio, long idPersonaNtural, boolean amoblado) {
		super(id, ubicacion, precio, precioEspecial, tamanhio, idPersonaNtural);
		this.amoblado = amoblado;
	}

	public boolean isAmoblado() {
		return amoblado;
	}

	public void setAmoblado(boolean amoblado) {
		this.amoblado = amoblado;
	}
	
}
