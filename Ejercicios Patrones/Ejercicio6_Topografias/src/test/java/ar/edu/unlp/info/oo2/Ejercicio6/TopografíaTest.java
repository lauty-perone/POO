package ar.edu.unlp.info.oo2.Ejercicio6;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TopografíaTest {
	
	private TopografíaMixta mixta1;
	private TopografíaMixta mixta2;
	private Tierra tierra;
	private Agua agua;

	@BeforeEach
	void setUp() throws Exception {
		
		tierra = new Tierra();
		agua = new Agua();
		
		this.mixta1 = new TopografíaMixta();
		mixta1.agregarTopografia(new Agua());
		mixta1.agregarTopografia(new Tierra());
		mixta1.agregarTopografia(new Tierra());
		mixta1.agregarTopografia(new Agua());
		
		this.mixta2 = new TopografíaMixta();
		mixta2.agregarTopografia(new Agua());
		mixta2.agregarTopografia(new Tierra());
		mixta2.agregarTopografia(new Tierra());
		mixta2.agregarTopografia(mixta1);		
	}
	
	@Test
	void testProporcionTierra() {
		assertEquals(1, tierra.proporcionTierra());
		assertEquals(0, agua.proporcionTierra());
		assertEquals(0.5, mixta1.proporcionTierra());
		assertEquals(0.625, mixta2.proporcionTierra());
	}
	
	@Test
	void testProporcionAgua() {
		assertEquals(0, tierra.proporcionAgua());
		assertEquals(1, agua.proporcionAgua());
		assertEquals(0.5, mixta1.proporcionAgua());
		assertEquals(0.375, mixta2.proporcionAgua());
	}
	
	@Test
	void testIsEquals() {
		Agua objetoAgua = new Agua();
		Tierra objetoTierra = new Tierra();
		
		TopografíaMixta ejMixta = new TopografíaMixta();
		mixta1.agregarTopografia(new Agua());
		mixta1.agregarTopografia(new Tierra());
		mixta1.agregarTopografia(new Tierra());
		mixta1.agregarTopografia(new Agua());
		
		TopografíaMixta ejMixta2 = new TopografíaMixta();
		mixta2.agregarTopografia(new Agua());
		mixta2.agregarTopografia(new Tierra());
		mixta2.agregarTopografia(new Tierra());
		mixta2.agregarTopografia(ejMixta);	
		
		assertTrue(this.tierra.equals(objetoTierra));
		assertTrue(this.agua.equals(objetoAgua));
		
		assertFalse(this.tierra.equals(objetoAgua));
		assertFalse(this.agua.equals(objetoTierra));
		
		assertFalse(this.mixta1.equals(objetoAgua));
		assertFalse(this.mixta1.equals(mixta2));
		
		assertTrue(this.mixta1.equals(ejMixta));
		assertTrue(this.mixta2.equals(ejMixta2));
		
		
		
		
	}
}
