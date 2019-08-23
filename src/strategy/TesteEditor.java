package strategy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TesteEditor {

	private FachadaEditor fachada;

	@Before
	public void setUp() {
		this.fachada = new FachadaEditor();
	}
	
	@Test
	public void testeExportador() {

		fachada.adicionarParagrafo("Alo mundo!");

		fachada.setExportadorHTML();
		Assert.assertEquals("<html><body>\n<p>Alo mundo!</p>\n</body></html>", fachada.exportar());

		fachada.setExportadorTXT();
		Assert.assertEquals("Alo mundo!\n", fachada.exportar());

		fachada.setExportadorXML();
		Assert.assertEquals("<doc>\n<parag>Alo mundo!</parag>\n</doc>", fachada.exportar());
	}
}
