package ar.edu.unlp.info.oo2.ParcialTareas;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TareaTest {
	
	private TareaCompleja almuerzo;
	private TareaCompleja compras;
	private TareaSimple supermercado;
	private TareaSimple verduleria;
	private TareaSimple cocinar;
	private TareaSimple mesa;

	
	@BeforeEach
	void setUp() throws Exception{
		this.compras = new TareaCompleja("realizar compras");
		this.almuerzo = new TareaCompleja("preparar almuerzo");
		
		this.supermercado = new TareaSimple("ir al supermercado", 3);
		this.verduleria = new TareaSimple("ir a la verduleria", 1);
		this.cocinar = new TareaSimple("cocinar", 2);
		this.mesa = new TareaSimple("preparar la mesa", 1);
		
		this.supermercado.iniciarTarea(9);
		this.supermercado.completarTarea(11);
		
		this.verduleria.iniciarTarea(11);
		this.verduleria.completarTarea(12);
		
		this.cocinar.iniciarTarea(12);
		
		this.compras.agregarTarea(supermercado);
		this.compras.agregarTarea(verduleria);
		
		this.almuerzo.agregarTarea(compras);
		this.almuerzo.agregarTarea(cocinar);
		this.almuerzo.agregarTarea(mesa);
	}
	
	@Test
	void avanceTareaTest() {
		System.out.println(this.almuerzo.estimacionTotal());
		System.out.println(this.almuerzo.tiempoUtilizado());
		System.out.println(this.almuerzo.avanceTarea());
		assertEquals(0.42857142857142855, this.almuerzo.avanceTarea());
	}
}
