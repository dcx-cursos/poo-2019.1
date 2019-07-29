package mocks;

public class Jogo {
	
	public String jogada(Moeda moeda) {
		if (moeda.joga() == "cara") {
			return "Deu cara"; 
		}
		return "Deu coroa";
	}

}
