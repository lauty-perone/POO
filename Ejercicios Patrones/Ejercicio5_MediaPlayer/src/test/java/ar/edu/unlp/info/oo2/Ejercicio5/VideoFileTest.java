package ar.edu.unlp.info.oo2.Ejercicio5;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class VideoFileTest {
	
	private VideoFile video;
	
	@BeforeEach
	void setUp() throws Exception {
		video = new VideoFile("Mr Beast");
	}
	
	@Test
	void playTest() {
		assertEquals("Mr Beast", video.play());
	}
}
