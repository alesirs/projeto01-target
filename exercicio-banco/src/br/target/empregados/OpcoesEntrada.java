package br.target.empregados;

public enum OpcoesEntrada {
	GERENTE(3),
	INSTRUTOR(2),
	VENDEDOR(1),
	SAIR(0);

	public int opcao;
	
	OpcoesEntrada(int opcao) {
		this.opcao = opcao;
	}
	
	public int getOpcao() {
		return opcao;
	}

}
