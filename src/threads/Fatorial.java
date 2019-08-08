package threads;

import java.util.ArrayList;
import java.util.List;

public class Fatorial {

	public List<Integer> value = new ArrayList<Integer>();

	public class TarefaFat implements Runnable {

		private int inicio;
		private int fim;
		
		public TarefaFat(int i, int meio) {
			this.inicio = i;
			this.fim = meio;
		}

		@Override
		public void run() {
			int valor = calculaFatSeq(this.inicio);
			value.add(valor);
		}

		private int calculaFatSeq(int i) {
			if(i <= this.fim) return 1;
			return i * calculaFatSeq(i-1);
		}
	}

	
	public static void main(String[] args) throws InterruptedException {
		
		Fatorial f = new Fatorial();
		
		System.out.println(f.calculaFatSeq(6));
		System.out.println(f.calculaFatPar(6));
		
	}

	private int calculaFatPar(int i) throws InterruptedException {
	
		int meio = (int) i / 2;
		
		Thread t1 = new Thread(new TarefaFat(i, meio));
		Thread t2 = new Thread(new TarefaFat(meio, 1));
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		int valor = 1;
		 for (Integer el : value) {
			 valor = valor * el;
		}
		return valor;
	}

	private int calculaFatSeq(int i) {
		if(i == 0) return 1;
		return i * calculaFatSeq(i-1);
	}

}
