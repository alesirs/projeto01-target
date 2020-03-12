package br.target.empregados;

public class Vendedor extends Empregado {

	double comissao;
	double valorDasVendas;

	public Vendedor() {		
	}

	public Vendedor(Double comissao, Double valorVendas) {
	   setComissao(comissao);	
	   setValorDasVendas(valorVendas);
	}
	
	@Override
	public double calcularRendimentos() {
		return getValorDasVendas() + (getValorDasVendas() * getComissao());
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}

	public double getValorDasVendas() {
		return valorDasVendas;
	}

	public void setValorDasVendas(double valorDasVendas) {
		this.valorDasVendas = valorDasVendas;
	}

}
