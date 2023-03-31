package uniandes.isis2304.alohandes.negocio;

public class Reserva {
	
	private long id;
	
	private String fecha;
	
	private int precio;
	
	private long idHotel;
	
	private long idhabitacionCompartida;
	
	private long idHabitacionVivienda;
	
	private long idApartamento;
	
	private long idViviendaPorDia;
	
	private long idViviendaPorSemestre;
	
	private long idUsuario;

	public Reserva(long id, String fecha, int precio, long idHotel, long idhabitacionCompartida,
			long idHabitacionVivienda, long idApartamento, long idViviendaPorDia, long idViviendaPorSemestre, long idUsuario) {
		this.id = id;
		this.fecha = fecha;
		this.precio = precio;
		this.idHotel = idHotel;
		this.idhabitacionCompartida = idhabitacionCompartida;
		this.idHabitacionVivienda = idHabitacionVivienda;
		this.idApartamento = idApartamento;
		this.idViviendaPorDia = idViviendaPorDia;
		this.idViviendaPorSemestre = idViviendaPorSemestre;
		this.idUsuario = idUsuario;
	}

	public long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public long getIdHotel() {
		return idHotel;
	}

	public void setIdHotel(long idHotel) {
		this.idHotel = idHotel;
	}

	public long getIdhabitacionCompartida() {
		return idhabitacionCompartida;
	}

	public void setIdhabitacionCompartida(long idhabitacionCompartida) {
		this.idhabitacionCompartida = idhabitacionCompartida;
	}

	public long getIdHabitacionVivienda() {
		return idHabitacionVivienda;
	}

	public void setIdHabitacionVivienda(long idHabitacionVivienda) {
		this.idHabitacionVivienda = idHabitacionVivienda;
	}

	public long getIdApartamento() {
		return idApartamento;
	}

	public void setIdApartamento(long idApartamento) {
		this.idApartamento = idApartamento;
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
