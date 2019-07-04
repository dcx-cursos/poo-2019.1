package heranca;

public class Main {

	public static void main(String[] args) {

		Funcionario f = new Funcionario();
		Gerente g = new Gerente();

		System.out.println(f.getBonificacao());
		System.out.println(g.getBonificacao());
		System.out.println(g.getBonificacaoNatal());
	}

}
