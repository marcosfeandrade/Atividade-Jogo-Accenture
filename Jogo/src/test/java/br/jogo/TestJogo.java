package test.java.br.jogo;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import main.java.br.jogo.Jogo;

public class TestJogo {

	@Test
	public void toStringTest() {
		String expected = "Jogo no estadio " + null + " (" + null + "), ocorrerah " + null + "\nResultados:" +
                "\n- Mandante:" + null + " - " + null +
                "\n- Visitante: " + null + " - " + null;
		Jogo jogo = new Jogo(null, null, null, null, null, null, null);

		assertEquals(expected, jogo.toString());
	}

	@Test
	public void toStringAllNullTest() {
		String expected = "Jogo no estadio " + null + " (" + null + "), ocorrerah " + null + "\nResultados:" +
                "\n- Mandante:" + null + " - " + null +
                "\n- Visitante: " + null + " - " + null;
		Jogo jogo = new Jogo(null, null, null, null, null, null, null);

		assertEquals(expected, jogo.toString());
	}

}
