package factory_method.especial;

import factory_method.base.Departamento;
import factory_method.base.Diretoria;
import factory_method.base.FachadaOrganizacao;

public class FachadaOrganizacaoEspecial extends FachadaOrganizacao {

	private int maxIdDepartamento = 0; //Campo duplicado
	private int maxIdCoordenacao = 0;

	//Precisou repetir o método para criar o nome tipo de objeto
	@Override
	public int cadastrarDepto(int idDiretoria, String nomeDepto) {

		Diretoria diretoria = diretorias.get(idDiretoria);
		Departamento departamento = new DepartamentoEspecial(nomeDepto);
		diretoria.adicionarDepartamento(++maxIdDepartamento, departamento);

		return maxIdDepartamento;
	}

	public int cadastrarCoord(int idDiretoria, int idDepto, String nomeCoordenacao) {

		Diretoria diretoria = diretorias.get(idDiretoria);
		DepartamentoEspecial departamento = (DepartamentoEspecial) diretoria.getDepartamento(idDepto);

		Coordenacao coordenacao = new Coordenacao(nomeCoordenacao);
		departamento.adicionarCoordenacao(++maxIdCoordenacao, coordenacao);

		return maxIdCoordenacao;

	}
}
