package ar.edu.unlp.info.oo2.ParcialSeguros;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SeguroTest {
	
	private Cliente c;
	private Vehiculo vehiculo1;
	private Vehiculo vehiculo2;
	
	@BeforeEach
	void setUp() throws Exception {
		 c = new Cliente(50, new SinPromocion());
		 vehiculo1 = new Vehiculo("Renault 11", LocalDate.of(1988, 1, 1)
				 , 680000,  4); //46800
		 vehiculo2 = new Vehiculo("Renault Clio", LocalDate.of(2001, 1, 1), 1200000,5);//78000
		 c.agregarSeguro(new SeguroContraTerceros(vehiculo1,c));
		 c.agregarSeguro(new SeguroContraTerceros(vehiculo2, c));		 
	}
	
	@Test
	void montoAbonarTest() {
		System.out.println(c.montoAbonar());
		assertEquals(124800, c.montoAbonar());
	}
}
