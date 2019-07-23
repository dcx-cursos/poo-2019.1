package excecoes;

public class Loja {

	private ContaCorrente conta;
	
	public Loja() {
		this.conta = new ContaCorrente();
	}
	
	public void defineLimite(int i) {
		this.conta.setLimite(i);
	}

	public void compra(int i) {
		try {
			this.conta.saca(i);
			System.out.println("Compra efetuada com sucesso");
		} catch (ValorInvalidoException e) {
			System.err.println(e.getMessage());
		} catch (SaldoIndisponivelException e) {
			System.err.println(e.getMessage() + ": saldo = " + this.getSaldo());
		}
	}

	private int getSaldo() {
		return this.conta.getLimite();
	}

}
