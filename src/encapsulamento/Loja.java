package encapsulamento;

public class Loja {
	
	private ContaCorrente conta;
	
	public Loja(double saldo, double cheque) {
		this.conta = new ContaCorrente(saldo, cheque);
	}
	
	public void vender(double valorProduto, Cliente cliente) {
		try {
			cliente.comprar(valorProduto);
			this.conta.creditar(valorProduto);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		} 
	}
	
	public String status() {
		return "Saldo: " + this.conta.getSaldo() + " e cheque especial: " + this.conta.getCheque(); 
	}

}
