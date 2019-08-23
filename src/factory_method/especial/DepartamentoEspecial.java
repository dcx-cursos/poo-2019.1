package factory_method.especial;

import java.util.ArrayList;
import java.util.List;

import factory_method.base.Departamento;

public class DepartamentoEspecial extends Departamento {

	private List<Coordenacao> coordenacoes;

	public DepartamentoEspecial(String nome) {
		super(nome);
		coordenacoes = new ArrayList<Coordenacao>();
	}

	public void adicionarCoordenacao(int idCoordenacao, Coordenacao c) {
		coordenacoes.add(c);
	}	
}
