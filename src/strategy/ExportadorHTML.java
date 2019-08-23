package strategy;

import java.util.List;

public class ExportadorHTML implements Exportador {

	@Override
	public String exportar(List<String> paragrafos) {

		String res = "<html><body>\n";
		for (String parag : paragrafos) {
			res += "<p>" + parag + "</p>\n";
		}
		return res + "</body></html>";
	}
}
