package factory_method.solucao;

import java.util.HashMap;
import java.util.Map;

import factory_method.base.Departamento;
import factory_method.base.Diretoria;

public class FachadaOrganizacao {

	protected Map<Integer,Diretoria> diretorias = new HashMap<Integer, Diretoria>();
	private int maxIdDiretoria = 0;
	private int maxIdDepartamento = 0;

	protected Diretoria criarDiretoria(String nome) {
		return new Diretoria(nome);
	}

	protected Departamento criaDepartamento(String nomeDepto) {
		return new Departamento(nomeDepto);
	}
	
	public int cadastrarDiretoria(String nome) {

		Diretoria diretoria = criarDiretoria(nome);
		diretorias.put(++maxIdDiretoria, diretoria);

		return maxIdDiretoria;
	}

	public int cadastrarDepto(int idDiretoria, String nomeDepto) {

		Departamento departamento = criaDepartamento(nomeDepto);
		Diretoria diretoria = diretorias.get(idDiretoria);
		diretoria.adicionarDepartamento(++maxIdDepartamento, departamento);

		return maxIdDepartamento;
	}
}
