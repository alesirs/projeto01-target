package br.target.empregados;

public class Instrutor  extends Empregado {

	private Integer horasTrabalhadas;

	public Instrutor() {
	}
	
	public Instrutor(Double salario, Integer horasTrabalhadas) {
		setSalario(salario);
		setHorasTrabalhadas(horasTrabalhadas);
	}
	
	public Integer getHorasTrabalhadas() {
		return horasTrabalhadas;
	}
	
	public void setHorasTrabalhadas(Integer horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}
	
	@Override
	public double calcularRendimentos() {
		return getSalario() / 220 * getHorasTrabalhadas();
	}

}
