package testes;

public class Partida {
	
	public String calculaDuracao(int hInicio, int mInicio, int hFim, int mFim) throws ParametrosNegativosException, ParametrosForaLimiteException, DuracaoNegativaException, DuracaoZeroException {
		
		int duracao = 0;
		
		if ((hInicio | mInicio | hFim | mFim) < 0) {
			throw new ParametrosNegativosException("Os parâmetros são negativos");
		} else if (((hInicio | hFim) > 23) | ((mInicio | mFim) > 59)) {
			throw new ParametrosForaLimiteException("Os parâmetros estão fora do limite");
		} else if (hFim < hInicio) {
			throw new DuracaoNegativaException("Hora fim menor que hora inicio");
		} else if (hFim == hInicio) {
			if (mFim < mInicio) {
				throw new DuracaoNegativaException("Duracao dos minutos negativa");
			} else if (mFim == mInicio) {
				throw new DuracaoZeroException("Horário inicio igual a horário fim");
			}
			duracao = mFim - mInicio;
		} else {
			duracao = ((hFim * 60) + mFim) - ((hInicio * 60) + mInicio);
		}
		int horaDuracao = (int) duracao / 60;
		int minDuracao = (duracao % 60);
		
		return horaDuracao + ":" + minDuracao;
	}

}
