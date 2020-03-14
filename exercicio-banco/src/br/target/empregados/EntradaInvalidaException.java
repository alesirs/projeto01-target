package br.target.empregados;

public class EntradaInvalidaException extends Exception {
	@Override
	public String getMessage(){
		return "Entrada invalida...";
	}
}

