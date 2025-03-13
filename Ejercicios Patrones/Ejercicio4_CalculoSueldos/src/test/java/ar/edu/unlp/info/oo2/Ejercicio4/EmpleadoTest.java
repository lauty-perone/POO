package ar.edu.unlp.info.oo2.Ejercicio4;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EmpleadoTest {
	
	private Temporario empleadoTemporario;
	private Pasante empleadoPasante;
	private Planta empleadoPlanta;
	
	@BeforeEach
	void setUp() throws Exception{
		this.empleadoTemporario = new Temporario(true,2,2);
		this.empleadoPlanta = new Planta(true, 2,2);
		this.empleadoPasante = new Pasante(true,2,2);
	}
	
	@Test
	void descuentoTest() {
		assertEquals(3128, empleadoTemporario.descuento()); //Temporario : 20600 * 0.13 + 9000 * 0.05
		
		assertEquals(2800, empleadoPasante.descuento()); //Pasante : 20000 * 0.13 + 4000 * 0.05
		
		assertEquals(7150, empleadoPlanta.descuento()); //Planta : 50000 * 0.13 + 13000 * 0.05
	}
	
	@Test
	void sueldoTest() {
		assertEquals(26472, empleadoTemporario.sueldo()); //Temporario : 20600 + 9000 - 3128
		assertEquals(21200, empleadoPasante.sueldo()); //Pasante : 20000 + 4000 - 2800
		assertEquals(55850, empleadoPlanta.sueldo()); //Planta : 50000 + 13000 - 7150
	}
}
