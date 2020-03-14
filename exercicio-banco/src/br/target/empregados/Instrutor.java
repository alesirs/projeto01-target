package br.target.empregados;

public class Instrutor  extends Empregado {

	private Integer horasTrabalhadas;
	private Double  valorHora;

	public Instrutor() {
	}
	
	public Instrutor(Integer horasTrabalhadas, Double valorHora) {
		setValorHora(valorHora);
		setHorasTrabalhadas(horasTrabalhadas);
	}
	
	public Integer getHorasTrabalhadas() {
		return horasTrabalhadas;
	}
	
	public void setHorasTrabalhadas(Integer horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}

	public Double getValorHora() {
		return valorHora;
	}

	public void setValorHora(Double valorHora) {
		this.valorHora = valorHora;
	}
	
	@Override
	public double calcularRendimentos() {
		return getValorHora() * getHorasTrabalhadas();
	}

}
