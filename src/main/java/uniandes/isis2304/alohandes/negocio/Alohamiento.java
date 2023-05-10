package uniandes.isis2304.alohandes.negocio;

public class Alohamiento {

	private long id;

	private long idApartamento;

	private long idHabitacionCompartida;

	private long idHabitacionVivienda;

	private long idHotel;

	private long idViviendaPorDia;

	private long idViviendaPorSemestre;

	private String estado;

	public Alohamiento(long id, long idApartamento, long idHabitacionCompartida, long idHabitacionVivienda,
			long idHotel, long idViviendaPorDia, long idViviendaPorSemestre, String estado) {
		this.id = id;
		this.idApartamento = idApartamento;
		this.idHabitacionCompartida = idHabitacionCompartida;
		this.idHabitacionVivienda = idHabitacionVivienda;
		this.idHotel = idHotel;
		this.idViviendaPorDia = idViviendaPorDia;
		this.idViviendaPorSemestre = idViviendaPorSemestre;
		this.estado = estado;
	}

	public String getEstado(){
		return estado;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getIdApartamento() {
		return idApartamento;
	}

	public void setIdApartamento(long idApartamento) {
		this.idApartamento = idApartamento;
	}

	public long getIdHabitacionCompartida() {
		return idHabitacionCompartida;
	}

	public void setIdHabitacionCompartida(long idHabitacionCompartida) {
		this.idHabitacionCompartida = idHabitacionCompartida;
	}

	public long getIdHabitacionVivienda() {
		return idHabitacionVivienda;
	}

	public void setIdHabitacionVivienda(long idHabitacionVivienda) {
		this.idHabitacionVivienda = idHabitacionVivienda;
	}

	public long getIdHotel() {
		return idHotel;
	}

	public void setIdHotel(long idHotel) {
		this.idHotel = idHotel;
	}

	public long getIdViviendaPorDia() {
		return idViviendaPorDia;
	}

	public void setIdViviendaPorDia(long idViviendaPorDia) {
		this.idViviendaPorDia = idViviendaPorDia;
	}

	public long getIdViviendaPorSemestre() {
		return idViviendaPorSemestre;
	}

	public void setIdViviendaPorSemestre(long idViviendaPorSemestre) {
		this.idViviendaPorSemestre = idViviendaPorSemestre;
	}
}
