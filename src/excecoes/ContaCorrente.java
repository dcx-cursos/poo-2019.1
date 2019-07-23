package excecoes;

public class ContaCorrente {

	private int saldo = 0;
	private int limite = 0 ;
	
	public void setLimite(int i) {
		this.limite = i;
	}

	public void saca(int i) throws ValorInvalidoException, SaldoIndisponivelException {
		if (i <= 0) {
			throw new ValorInvalidoException("O valor a ser sacado não pode ser menor ou igual a zero");
		} else if (i > (saldo + limite)) {
			throw new SaldoIndisponivelException("A conta não possui saldo suficiente");
		}
		this.saldo = this.saldo - i;
	}

	public int getLimite() {
		return this.saldo + this.limite;
	}
	
	

}
