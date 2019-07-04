package heranca;

public class Funcionario {
	
	protected double salario;
	
	public Funcionario() {
		this.salario = 100;
	}

	public double getBonificacao() {
		return this.salario*0.1;
	}
}
