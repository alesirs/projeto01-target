package banco;
import java.util.List;

public class Conta {
	Integer agencia;
	Integer numero;
	Double saldo;
	List<Movimento> Movimentos;
	
	public Integer getAgencia() {
		return agencia;
	}

	public void setAgencia(Integer agencia) {
		this.agencia = agencia;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public List<Movimento> getMovimentos() {
		return Movimentos;
	}

	public void setMovimentos(List<Movimento> movimentos) {
		Movimentos = movimentos;
	}
}
