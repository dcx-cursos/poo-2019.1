package factory_method.base;

import org.junit.Test;

public class TesteEstruturaOrganizacional {

	@Test
	public void testeSimples() {

		FachadaOrganizacao fachada = new FachadaOrganizacao();
		
		int idFinancas = fachada.cadastrarDiretoria("Finanças");
		int idRh = fachada.cadastrarDiretoria("RH");
		
		int idContabilidade = fachada.cadastrarDepto(idFinancas, "Contabilidade");
		int idTributacao = fachada.cadastrarDepto(idFinancas, "Tributação");
		int idTreinamento = fachada.cadastrarDepto(idRh, "Treinamento");
	}
}
