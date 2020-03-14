package br.target.empregados;

public class Vendedor extends Empregado {

	double comissao;
	double valorDasVendas;

	public Vendedor() {		
	}

	public Vendedor(Double comissao, Double valorVendas) {
	   this.comissao = comissao;
	   this.valorDasVendas = valorVendas;
	}
	
	@Override
	public double calcularRendimentos() {
		return this.valorDasVendas + (this.valorDasVendas * this.comissao / 100);
	}

}
