package threads;

public class Tarefa implements Runnable {
	
	private final String nome;
	
	public Tarefa(String nome) {
		this.nome = nome;
	}

	@Override
	public void run() {
		for (int i = 0; i <= 100; i = i + 20) {
			System.out.println("Tarefa " + nome + ": " + i + "%");
		}
		
	}

}
