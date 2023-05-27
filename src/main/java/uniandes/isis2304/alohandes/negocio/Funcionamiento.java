package uniandes.isis2304.alohandes.negocio;

public class Funcionamiento {
	
	String semana;
	
	Long idAlohamientoMax;
	
	Long idAlohamientoMin;

	public Funcionamiento(String semana, Long idAlohamientoMax, Long idAlohamientoMin) {
		super();
		this.semana = semana;
		this.idAlohamientoMax = idAlohamientoMax;
		this.idAlohamientoMin = idAlohamientoMin;
	}

	public String getSemana() {
		return semana;
	}

	public void setSemana(String semana) {
		this.semana = semana;
	}

	public Long getIdAlohamientoMax() {
		return idAlohamientoMax;
	}

	public void setIdAlohamientoMax(Long idAlohamientoMax) {
		this.idAlohamientoMax = idAlohamientoMax;
	}

	public Long getIdAlohamientoMin() {
		return idAlohamientoMin;
	}

	public void setIdAlohamientoMin(Long idAlohamientoMin) {
		this.idAlohamientoMin = idAlohamientoMin;
	}

	@Override
	public String toString() {
		return "semana=" + semana + ", idAlohamientoMax=" + idAlohamientoMax + ", idAlohamientoMin="
				+ idAlohamientoMin ;
	}
}
