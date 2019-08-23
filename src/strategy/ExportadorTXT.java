package strategy;

import java.util.List;

public class ExportadorTXT implements Exportador {

	@Override
	public String exportar(List<String> paragrafos) {
		String res = "";

		for (String parag : paragrafos) {
			res += parag + "\n";
		}
		return res;
	}
}
