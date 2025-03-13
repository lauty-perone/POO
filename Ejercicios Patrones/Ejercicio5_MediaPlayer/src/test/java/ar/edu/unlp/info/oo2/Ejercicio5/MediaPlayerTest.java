package ar.edu.unlp.info.oo2.Ejercicio5;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MediaPlayerTest {
	
	private MediaPlayer mediaPlayer;	
	
	@BeforeEach
	void setUp() throws Exception {
		
		mediaPlayer = new MediaPlayer(new Audio("Gustavo Cerati - Lo que sangra(La Cúpula)"));

	}
	
	@Test
	void playTest() {
		assertEquals("Gustavo Cerati - Lo que sangra(La Cúpula)", mediaPlayer.play()); //AUDIO
		
		mediaPlayer.setMedia(new VideoFile("Mr Beast"));
		assertEquals("Mr Beast", mediaPlayer.play()); //VIDEOFILE
		
		mediaPlayer.setMedia(new VideoStreamAdapter(new VideoStream("El Rubius")));
		assertEquals("El Rubius", mediaPlayer.play()); //STREAM
		
		
	}
}
