package ar.edu.unlp.info.oo2.Ejercicio19_PersonajesRol;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PersonajesTest {
	
	private Director director;
	private Personaje arquero;
	private Personaje guerrero;
	private Personaje Thoor;
	private Personaje mago;
	
	@BeforeEach
	void setUp() throws Exception{
		
		this.director = new Director();
		
		director.setBuilder(new BuilderGuerrero());
		director.construirPersonaje("Hércules");
		guerrero = director.getPersonaje();
		
		director.setBuilder(new BuilderArquero());
		director.construirPersonaje("Légolas");
		arquero = director.getPersonaje();
		
		director.setBuilder(new BuilderMago());
		director.construirPersonaje("Gandalf");
		mago = director.getPersonaje();
		
		director.setBuilder(new BuilderThoor());
		director.construirPersonaje("Thoor");
		Thoor = director.getPersonaje();
	}
	
	@Test
	void atacarTest() {
		
		guerrero.atacar(mago);
		assertEquals(92, mago.getVida()); //El MAGO TIENE 92 DE VIDA
		
		arquero.atacar(mago);
		assertEquals(87, mago.getVida()); //El MAGO TIENE 87 DE VIDA
		
		Thoor.atacar(mago);
		assertFalse(mago.estaVivo());
									
		Thoor.atacar(arquero);
		Thoor.atacar(arquero);
		assertFalse(arquero.estaVivo());
	}
}
