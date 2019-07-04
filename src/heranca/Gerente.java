package heranca;

public class Gerente extends Funcionario {
	
	public double getBonificacao() {
		return super.salario*0.2;
	}
	
	public double getBonificacaoNatal() {
		return super.getBonificacao() + 100;
	}
}
