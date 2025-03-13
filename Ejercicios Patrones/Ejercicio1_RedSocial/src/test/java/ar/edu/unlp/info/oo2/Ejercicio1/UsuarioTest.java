package ar.edu.unlp.info.oo2.Ejercicio1;

import java.time.LocalDate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UsuarioTest {
	
	private Usuario user;
	private Tweet tw1;
	private ReTweet rt1;
	
	@BeforeEach
	void setUp() throws Exception{
		this.user = new Usuario("lauty_perone");
		this.tw1 = user.hacerTweet(LocalDate.now(), "Holis");
		this.rt1 = user.hacerReTweet(LocalDate.now(), tw1);
		
	}
	
	@Test
	void hacerTweetTest() {
		
		//Tweet correcto
		Assertions.assertNotNull(tw1);
		
		//Tweet con nada
		Tweet tweet1 = user.hacerTweet(LocalDate.now(), "");
		Assertions.assertNull(tweet1);
		
		//Tweet con un espacio vacio o varios 
		Tweet tweet2 = user.hacerTweet(LocalDate.now(), "  ");
		Assertions.assertNull(tweet2);
		
		//Tweet con 280 caracteres
				String mensaje1 = new String(new char[280]).replace('\0', 'a');
				Tweet tweet3 = user.hacerTweet(LocalDate.now(), mensaje1);
				Assertions.assertNotNull(tweet3);
		
		//Tweet con 281 caracteres
		String mensaje = new String(new char[281]).replace('\0', 'a');
		Tweet tweet4 = user.hacerTweet(LocalDate.now(), mensaje);
		Assertions.assertNull(tweet4);
		
	}
	
	@Test
	void hacerReTweetTest(){
		Assertions.assertNotNull(rt1);	
	}
	
	@Test
	void eliminarTweets() {
		user.eliminarPosteos();
		Assertions.assertTrue(user.getTweets().isEmpty());
	}
}
