package factory_method.base;

import java.util.HashMap;
import java.util.Map;

public class Diretoria {

	private String nome;
	private Map<Integer,Departamento> departamentos;

	public Diretoria(String nome) {
		this.nome = nome;
		this.departamentos = new HashMap<Integer, Departamento>();
	}

	public void adicionarDepartamento(int idDepto, Departamento d) {
		departamentos.put(idDepto, d);
	}

	public Departamento getDepartamento(int idDepto) {
		return departamentos.get(idDepto);
	}
}
