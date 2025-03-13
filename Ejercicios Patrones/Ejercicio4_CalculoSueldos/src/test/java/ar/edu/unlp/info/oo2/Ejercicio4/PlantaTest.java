package ar.edu.unlp.info.oo2.Ejercicio4;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PlantaTest {
	
	private Planta empleadoCasado;
	private Planta empleadoSoltero;
	
	@BeforeEach
	void setUp() throws Exception {
		this.empleadoCasado = new Planta(true,2,2);
		this.empleadoSoltero = new Planta(false, 2,2);
	}
	
	@Test
	void sueldoBasicoTest() {
		assertEquals(50000, empleadoCasado.sueldoBasico());
	}
	
	@Test
	void sueldoAdicionalTest() {
		assertEquals(13000, empleadoCasado.sueldoAdicional());
		
		assertEquals(8000, empleadoSoltero.sueldoAdicional());
	}
}
