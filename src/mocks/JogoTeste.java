package mocks;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

public class JogoTeste {

	@Mock
	Moeda moeda = null;

	@Before
	public void inicializa() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void testProcessaDados() {

		Mockito.when(moeda.joga()).thenReturn("cara"); 

		Jogo jogo = new Jogo();
		assertEquals("Deu cara", jogo.jogada(moeda));
		
		Mockito.verify(moeda, Mockito.times(1)).joga();
	}
}
