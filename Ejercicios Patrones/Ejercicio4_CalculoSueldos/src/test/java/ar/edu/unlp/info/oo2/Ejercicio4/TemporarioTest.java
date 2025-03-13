package ar.edu.unlp.info.oo2.Ejercicio4;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TemporarioTest {
	
	private Temporario empleadoCasado; //
	private Temporario empleadoSoltero;
	
	@BeforeEach
	void setUp() throws Exception {
		this.empleadoCasado = new Temporario(true,2,2);
		this.empleadoSoltero = new Temporario(false, 2,2);
	}
	
	@Test
	void sueldoBasicoTest() {
		assertEquals(20600, empleadoCasado.sueldoBasico());
	}
	
	@Test
	void sueldoAdiciconalTest() {
		assertEquals(9000, empleadoCasado.sueldoAdicional()); 
		
		assertEquals(4000, empleadoSoltero.sueldoAdicional());
	}
}
