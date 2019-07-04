package interfaces;

import java.util.List;

public class ComponenteDeSelecao {
	
	private Selecionavel colecao;
	private String padrao;
	
	public ComponenteDeSelecao(Selecionavel s, String string) {
		this.colecao = s;
		this.padrao = string;
	}
	
	public void geraListBox() {
		
		List<Nomeavel> lista  = this.colecao.getList();
		for (Nomeavel n: lista) {
			n.getNome();
		}
	}

	public static void main(String[] args) {
		
		ColecaoAlunos cA = new ColecaoAlunos();
		ColecaoDisc cD = new ColecaoDisc();
		
		ComponenteDeSelecao cds;
		cds = new ComponenteDeSelecao(cA, "joão"); 
	
		cds = new ComponenteDeSelecao(cD, "poo");
	}
}


