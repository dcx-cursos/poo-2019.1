package factory_method.especial;

import java.util.HashMap;
import java.util.Map;

import factory_method.base.Departamento;
import factory_method.base.Diretoria;

public class FachadaOrganizacao {

	private Map<Integer,Diretoria> diretorias = new HashMap<Integer, Diretoria>();
	private int maxIdDiretoria = 0;
	private int maxIdDepartamento = 0;

	public int cadastrarDiretoria(String nome) {

		Diretoria diretoria = new Diretoria(nome);
		diretorias.put(++maxIdDiretoria, diretoria);
		
		return maxIdDiretoria;
	}

	public int cadastrarDepto(int idDiretoria, String nomeDepto) {

		Departamento departamento = new Departamento(nomeDepto);
		Diretoria diretoria = diretorias.get(idDiretoria);
		diretoria.adicionarDepartamento(++maxIdDepartamento, departamento);
		
		return maxIdDepartamento;
	}
}
