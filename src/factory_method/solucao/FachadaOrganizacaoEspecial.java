package factory_method.solucao;

import factory_method.base.Departamento;
import factory_method.base.Diretoria;
import factory_method.especial.Coordenacao;
import factory_method.especial.DepartamentoEspecial;

public class FachadaOrganizacaoEspecial extends FachadaOrganizacao {

	private int maxIdCoordenacao = 0;

	@Override
	protected Departamento criaDepartamento(String nome) {
		return new DepartamentoEspecial(nome);
	}

	public int cadastrarCoord(int idDiretoria, int idDepto, String nomeCoordenacao) {

		Diretoria diretoria = diretorias.get(idDiretoria);
		DepartamentoEspecial departamento = (DepartamentoEspecial) diretoria.getDepartamento(idDepto);

		Coordenacao coordenacao = new Coordenacao(nomeCoordenacao);
		departamento.adicionarCoordenacao(++maxIdCoordenacao, coordenacao);

		return maxIdCoordenacao;

	}
}
