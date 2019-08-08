package threads;

public class TesteTarefa {

	public static void main(String[] args) throws InterruptedException {

		Thread t1 = new Thread(new Tarefa("A"));
		Thread t2 = new Thread(new Tarefa("B"));
		
		t1.start();
		t2.start();
	}
}
