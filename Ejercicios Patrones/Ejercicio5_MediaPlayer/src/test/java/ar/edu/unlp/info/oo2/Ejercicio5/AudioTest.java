package ar.edu.unlp.info.oo2.Ejercicio5;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AudioTest {

	private Audio audio;
	
	@BeforeEach
	void setUp() throws Exception {
		audio = new Audio("Gustavo Cerati - Lo que sangra(La Cúpula)");
	}
	
	@Test
	void playTest() {
		assertEquals("Gustavo Cerati - Lo que sangra(La Cúpula)", audio.play());
	}
}
