package zoo;

public class Zoologico {
	
	private Animal[] animais;

	public Zoologico() {
		this.animais = new Animal[5];
	}
	
	public void adicionaAnimal(int index, Animal animal) {
		animais[index] = animal;
	}
	
	public void percorrerJaulas() {
		
		for (int i = 0; i < animais.length; i++) {
			animais[i].emitirSom();
		}
	}
	
	public static void main(String[] args) {
		
		Zoologico z = new Zoologico();
		
		z.adicionaAnimal(0, new Cachorro());
		z.adicionaAnimal(1, new Preguica());
		z.adicionaAnimal(2, new Cavalo());
		z.adicionaAnimal(3, new Cavalo());
		z.adicionaAnimal(4, new Cachorro());
		
		z.percorrerJaulas();

	}

}
