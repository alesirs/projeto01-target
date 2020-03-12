package br.target.empregados;

public class Gerente extends Empregado {

	double gratificacao;
	
	public Gerente() {
	}
	
	public Gerente(Double salario, Double gratificacao) {
		setSalario(salario);
		setGratificacao(gratificacao);
	}
	
	@Override
	public double calcularRendimentos() {
		// TODO Auto-generated method stub
		return getSalario() + getGratificacao();
	}

	public double getGratificacao() {
		return gratificacao;
	}

	public void setGratificacao(double gratificacao) {
		this.gratificacao = gratificacao;
	}
	
}
