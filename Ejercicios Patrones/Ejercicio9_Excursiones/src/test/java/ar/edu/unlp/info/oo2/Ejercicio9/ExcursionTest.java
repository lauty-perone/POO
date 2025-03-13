package ar.edu.unlp.info.oo2.Ejercicio9;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ExcursionTest {
	
	private Excursion excursion;
	
	@BeforeEach
	void setUp() throws Exception{
		this.excursion = new Excursion("Dos días en kayak bajando el Paraná",
				LocalDate.now(), LocalDate.of(2024, 4, 25),
				"El centro", 1, 2, 500);
		this.excursion.inscribir(new Usuario("Pedrito", "Soma", "pedrosoma@gmail.com"));
		this.excursion.inscribir(new Usuario("Lautaro", "Perone", "lautyperone@hotmail.com"));
	}
	
	@Test
	void inscribirTest() {
		this.excursion.inscribir(new Usuario("Agus", "Perone", "agus@gmail.com"));
		assertTrue(this.excursion.getState() instanceof Completa);
	}
}
