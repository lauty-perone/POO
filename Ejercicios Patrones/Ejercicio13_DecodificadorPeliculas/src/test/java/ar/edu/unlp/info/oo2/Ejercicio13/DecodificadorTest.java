package ar.edu.unlp.info.oo2.Ejercicio13;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DecodificadorTest {
	
	private Decodificador d;
	private Pelicula thor;
	private Pelicula CapitanAmerica;
	private Pelicula IronMan;
	private Pelicula Dunkirk;
	private Pelicula Rocky;
	private Pelicula Rambo;
	@BeforeEach
	void setUp() throws Exception{
		this.d = new Decodificador();
		this.thor = new Pelicula("Thor", 7.9, 2007);
		this.CapitanAmerica = new Pelicula("Capitan America", 7.8, 2016);
		this.IronMan = new Pelicula("Iron Man", 7.9,2010);
		this.Dunkirk = new Pelicula("Dunkirk", 7.9, 2017);
		this.Rocky = new Pelicula("Rocky", 8.1, 1976);
		this.Rambo = new Pelicula("Rambo", 7.8, 1979);
		
		this.thor.agregarSimilaridad(CapitanAmerica);
		this.thor.agregarSimilaridad(IronMan);
		
		this.CapitanAmerica.agregarSimilaridad(thor);
		this.CapitanAmerica.agregarSimilaridad(IronMan);
		
		this.IronMan.agregarSimilaridad(thor);
		this.IronMan.agregarSimilaridad(CapitanAmerica);
		
		this.Rocky.agregarSimilaridad(Rambo);
		
		this.Rambo.agregarSimilaridad(Rocky);
		
		this.d.agregarPelicula(thor);
		this.d.agregarPelicula(CapitanAmerica);
		this.d.agregarPelicula(IronMan);
		this.d.agregarPelicula(Dunkirk);
		this.d.agregarPelicula(Rocky);
		this.d.agregarPelicula(Rambo);
		
		this.d.agregarPeliculaReproducida(thor);
		this.d.agregarPeliculaReproducida(Rocky);
	}
	
	@Test
	void sugerenciaTest() {
		this.d.cambiarSugerencia(new Similaridad());
		System.out.println(d.recibirSugerencias());
		assertEquals("Capitan America, Iron Man, Rambo", d.recibirSugerencias());
		
		
		this.d.cambiarSugerencia(new Puntaje());
		System.out.println(d.recibirSugerencias());
		assertEquals("Dunkirk, Iron Man, Capitan America", d.recibirSugerencias());
		
	}
}
