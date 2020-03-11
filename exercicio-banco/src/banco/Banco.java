package banco;

import java.util.ArrayList;
import java.util.List;

public class Banco {

	private List<Conta> contas = new ArrayList<Conta>();

	public void depositar(Conta contaParaDeposito, Double valor) {
		for (Conta conta : contas) {
			if (conta.getNumero().equals(contaParaDeposito.getNumero())) {
				conta.getMovimentos().add(gerarMovimentacao("Deposito em conta corrente.", valor, 0));
				break;
			}
		}
	}

	private Movimento gerarMovimentacao(String descricao, Double valor, Integer tipo) {
		Movimento movimentoDeDeposito = new Movimento();
		movimentoDeDeposito.setTipo(tipo);
		movimentoDeDeposito.setDescricao(descricao);
		movimentoDeDeposito.setValor(valor);

		System.out.println("Gerando movimentacao...");

		return movimentoDeDeposito;
	}

	public void sacar(Conta contaDeSaque, Double valor) {
		for(Conta conta : contas) {
			if(conta.getNumero().equals(contaDeSaque.getNumero())) {
				conta.getMovimentos().add(gerarMovimentacao("Saque em conta corrente.", valor, 1));
				break;
			}
		}
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}

	public void listarMovimentacao(Conta c) {

		for(Conta conta : contas) {
			if (conta.getNumero().equals(c.getNumero())) {
				for(Movimento movimento : conta.getMovimentos()) {
					if(movimento.getTipo() == 0) {
						System.out.println("Movimento de deposito de: "+ movimento.getValor());
					} else if (movimento.getTipo() == 1){
						System.out.println("Movimento de saque de: "+ movimento.getValor());
					}
				}
			}
		}
	}

	public void imprimirSaldo(Conta contaCorrentista) {
		//  VERSAO 3
		for (Conta conta : contas) {
			if (conta.getNumero().equals(contaCorrentista.getNumero())) {
				Double saldo = 0.0;	
				for (Movimento movimento : conta.getMovimentos()) {
					if (movimento.getTipo() == 0) {
						saldo += movimento.getValor().doubleValue();
					} else {
						saldo -= movimento.getValor().doubleValue();
					}
				}
				System.out.printf("Saldo em conta corrente: %.2f", saldo);
			}
		}

		/*
		//  VERSAO 2
		Conta cc = (Conta) contas.stream().filter(c->c.getNumero().equals(contaCorrentista.getNumero()));
	    Double saldo = 0.0;	
		for (int j=0 ; j<cc.getMovimentos().size() ; j++) {
			if (cc.getMovimentos().get(j).getTipo() == 0) {
			   saldo += cc.getMovimentos().get(j).getValor().doubleValue();
			} else {
			   saldo -= cc.getMovimentos().get(j).getValor().doubleValue();
			}
		}
		 */

		/*  VERSAO 1
		for (int i=0 ; i<contas.size();i++) {
			Conta conta = contas.get(i);

			if (conta.getNumero().equals(contaCorrentista.getNumero())) {
			    Double saldo = 0.0;	
				for (int j=0 ; j<conta.getMovimentos().size() ; j++) {
					if (conta.getMovimentos().get(j).getTipo() == 0) {
					   saldo += conta.getMovimentos().get(j).getValor().doubleValue();
					} else {
  				       saldo -= conta.getMovimentos().get(j).getValor().doubleValue();
					}
				}
				System.out.printf("Saldo em conta corrente: %.2f", saldo);
				break;

			}
		}
		 */
	}

	public void listaMovimentos(Correntista correntista) {

		//movimentos.forEach(mov -> System.out.println(mov.getDescricao() + " - " + mov.getTipo() + " - " + mov.getValor() ));
	}

}
