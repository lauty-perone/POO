package ar.edu.unlp.info.oo2.Ejercicio2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class JugadaTest {
	
	private Piedra piedra;
	private Papel papel;
	private Tijera tijera;
	private Spock spock;
	private Lagarto lagarto;
	private String[] resultados;
	
	@BeforeEach
	void setUp() throws Exception{
		this.resultados = new String[]{"Gana Tijeras","Gana Papel","Gana Piedra","Gana Lagarto","Gana Spock","Empate"};
				
		this.piedra = new Piedra();
		this.papel = new Papel();
		this.tijera = new Tijera();
		this.spock = new Spock();
		this.lagarto = new Lagarto();
	}
	
	@Test
	void jugadaTest() {
		Assertions.assertEquals(this.resultados[5], piedra.jugarContra(piedra));
		Assertions.assertEquals(this.resultados[2], piedra.jugarContra(tijera));
		Assertions.assertEquals(this.resultados[1], piedra.jugarContra(papel));
		Assertions.assertEquals(this.resultados[2], piedra.jugarContra(lagarto));
		Assertions.assertEquals(this.resultados[4], piedra.jugarContra(spock));
	}
}
