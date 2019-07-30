package testes;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PartidaTest {

	private Partida partida;
	
	@Before
	public void setUp() {
		this.partida = new Partida();
	}
	
	// caso 1
	@Test(expected=ParametrosNegativosException.class)
	public void testParametrosNegativos() throws ParametrosNegativosException, ParametrosForaLimiteException, DuracaoNegativaException, DuracaoZeroException {
		this.partida.calculaDuracao(-10, 0, 1, 0);
	}
	// caso 3 e 4 
	@Test(expected=ParametrosForaLimiteException.class)
	public void testParametrosMaioresQueLimite() throws ParametrosNegativosException, ParametrosForaLimiteException, DuracaoNegativaException, DuracaoZeroException {
		this.partida.calculaDuracao(25, 0, 1, 0);
		this.partida.calculaDuracao(24, 70, 1, 0);
	}
	
	// caso 2 final menor que inicio
	@Test(expected=DuracaoNegativaException.class)
	public void testDuracaoNegativa() throws ParametrosNegativosException, ParametrosForaLimiteException, DuracaoNegativaException, DuracaoZeroException {
		this.partida.calculaDuracao(7, 0, 6, 30);
	}
	

	// caso 5 final igual a inicio
	@Test(expected=DuracaoZeroException.class)
	public void testDuracaoZero() throws ParametrosNegativosException, ParametrosForaLimiteException, DuracaoNegativaException, DuracaoZeroException {
		this.partida.calculaDuracao(8, 10, 8, 10);
	}
	

	// caso 6 final maior que inicio
	@Test
	public void testDuracaoPositiva() throws ParametrosNegativosException, ParametrosForaLimiteException, DuracaoNegativaException, DuracaoZeroException {
		assertEquals("0:5", this.partida.calculaDuracao(8, 35, 8, 40));
		assertEquals("2:5", this.partida.calculaDuracao(8, 35, 10, 40));
	}



}
