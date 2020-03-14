package banco;

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

	
	static OpcoesEntrada obtemEntrada(int tipo) {
		for(int i = 0; i < OpcoesEntrada.values().length; i++) {
			OpcoesEntrada opcoesEntrada = OpcoesEntrada.values()[i];
			
			if (tipo == opcoesEntrada.getOpcao()) {
				return opcoesEntrada;
			}
		}
		
		
		return null;
	}
}
