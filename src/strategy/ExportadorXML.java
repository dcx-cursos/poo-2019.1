package strategy;

import java.util.List;

public class ExportadorXML implements Exportador {

	@Override
	public String exportar(List<String> paragrafos) {
		String res = "<doc>\n";

		for (String parag : paragrafos) {
			res += "<parag>" + parag + "</parag>\n";
		}
		return res + "</doc>";
	}
}
