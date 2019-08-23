package strategy;

import java.util.ArrayList;
import java.util.List;

public class FachadaEditor {

	private List<String> paragrafos = new ArrayList<String>();
	private Exportador exportador;

	public List<String> getParagrafos() {
		return paragrafos;
	}

	public void adicionarParagrafo(String texto) {
		paragrafos.add(texto);
	}

	public String exportar() {
		return exportador.exportar(paragrafos);
	}

	public void setExportadorHTML() {
		exportador = new ExportadorHTML();
	}

	public void setExportadorTXT() {
		exportador = new ExportadorTXT();
	}

	public void setExportadorXML() {
		exportador = new ExportadorXML();
	}
}