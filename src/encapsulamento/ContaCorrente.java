package encapsulamento;

import org.omg.PortableServer.ThreadPolicyOperations;

public class ContaCorrente {

	private double saldo;
	private double chequeEspecial;
	
	public ContaCorrente(double saldo, double chequeEsp) {
		this.saldo = saldo;
		this.chequeEspecial = chequeEsp;
	}
	
	public void creditar(double valor) throws Exception {
		if(valor <= 0) {
			throw new Exception("Valor a ser creditado é menor ou igual que zero");
		}
		this.saldo += valor;
	}
	
	public void debitar(double valor) throws Exception {
		if(valor <= 0) {
			throw new Exception("O valor a ser debitado não pode ser menor ou igual a zero");
		} else if(valor > (this.saldo + this.chequeEspecial)) {
			throw new Exception("O valor a ser debitado é maior que o limite");
		}
		this.saldo -= valor;
	}

	public double getSaldo() {
		return this.saldo;
	}
	
	public double getCheque() {
		return this.chequeEspecial;
	}
}
