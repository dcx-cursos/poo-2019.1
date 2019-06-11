package encapsulamento;

public class Cliente {
	
	private ContaCorrente conta;
	
	public Cliente(double saldo, double cheque) {
		this.conta = new ContaCorrente(saldo, cheque);
	}
	
	public void comprar(double valorProduto) throws Exception {
		this.conta.debitar(valorProduto);
	}

}
