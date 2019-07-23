package excecoes;

public class MainTeste {
	
	public static void main(String[] args) {
		
		Loja loja = new Loja();
		loja.defineLimite(50);
		
		loja.compra(100);
		loja.compra(0);
		loja.compra(50);
		
	}

}
