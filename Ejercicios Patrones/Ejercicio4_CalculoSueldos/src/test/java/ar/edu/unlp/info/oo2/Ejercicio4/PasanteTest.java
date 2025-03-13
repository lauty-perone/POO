package ar.edu.unlp.info.oo2.Ejercicio4;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PasanteTest {
	
	private Pasante empleado;
	
	@BeforeEach
	void setUp() throws Exception {
		empleado = new Pasante(true,2,2);
	}
	
	@Test
	void sueldoBasicoTest() {
		assertEquals(20000, empleado.sueldoBasico());
	}
	
	@Test
	void sueldoAdicionalTest() {
		assertEquals(4000, empleado.sueldoAdicional());
	}
}
