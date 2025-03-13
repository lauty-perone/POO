package ar.edu.unlp.info.oo2.Ejercicio10;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ProyectoTest {
	
	private Proyecto proyecto;
	private Proyecto proyectoPrecioCero;
	
	@BeforeEach
	void setUp() throws Exception{
		this.proyecto = new Proyecto("Vacaciones de invierno",
				LocalDate.now(), LocalDate.of(2024, 4, 25),
				"salir con amigos", 3, 500);
		this.proyecto.aprobarEtapa();
		
		this.proyectoPrecioCero = new Proyecto("Vacaciones de invierno",
				LocalDate.now(), LocalDate.of(2024, 4, 25),
				"salir con amigos", 3, 0);
		
	}
	
	@Test
	void aprobarEtapaTest() {
		assertTrue(this.proyecto.getState() instanceof EnEvaluacion);
		
		Exception excepcion =  assertThrows(RuntimeException.class, () -> {this.proyectoPrecioCero.aprobarEtapa();});
		String error = "Error: el precio del proyecto es igual a cero";
		assertEquals(error, excepcion.getMessage());	
	}
}
