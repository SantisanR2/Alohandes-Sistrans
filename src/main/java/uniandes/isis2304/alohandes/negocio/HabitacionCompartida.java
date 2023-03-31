package uniandes.isis2304.alohandes.negocio;

public class HabitacionCompartida extends Hotel{
	
	private String horarioApertura;
	
	private String horarioCierre;

	public HabitacionCompartida(long id, String nombre, String ubicacion, String tipo, long idEmpresahotelera, int precio, int tamanhio, String horarioApertura, String horarioCierre) {
		super(id, nombre, ubicacion, tipo, precio, tamanhio, idEmpresahotelera);
		this.horarioApertura = horarioApertura;
		this.horarioCierre = horarioCierre;
	}

	public String getHorarioApertura() {
		return horarioApertura;
	}

	public void setHorarioApertura(String horarioApertura) {
		this.horarioApertura = horarioApertura;
	}

	public String getHorarioCierre() {
		return horarioCierre;
	}

	public void setHorarioCierre(String horarioCierre) {
		this.horarioCierre = horarioCierre;
	}
	
}
