package test.java.br.jogo;

import static org.junit.Assert.assertThrows;

import org.junit.jupiter.api.Test;

import main.java.br.jogo.Jogo;
import main.java.br.jogo.MainJogo;
import main.java.br.jogo.Time;

public class TestMainJogo {

	@Test
	public void timeTest() {
		Time expected = new Time (null, null, null, null, null);
		MainJogo mainJogo = new MainJogo();
		assertThrows(NullPointerException.class, () -> mainJogo.time(null, null, null, null, null));
	}
}
