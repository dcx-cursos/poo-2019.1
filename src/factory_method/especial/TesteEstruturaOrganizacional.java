package factory_method.especial;

import org.junit.Test;

public class TesteEstruturaOrganizacional {

	@Test
	public void testeDepartamentoEspecial() {

		FachadaOrganizacaoEspecial fachada = new FachadaOrganizacaoEspecial();

		int idFinancas = fachada.cadastrarDiretoria("Finanças");
		int idTributacao = fachada.cadastrarDepto(idFinancas, "Tributação");
		int idTributacaoExterior = fachada.cadastrarCoord(idFinancas, idTributacao, "Tributação Exterior");
	}
}
