package ar.edu.unlp.info.oo2.Ejercicio5;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class VideoStreamAdapterTest {
	
private VideoStreamAdapter adapter;
	
	@BeforeEach
	void setUp() throws Exception {
		adapter = new VideoStreamAdapter(new VideoStream("El Rubius"));
	}
	
	@Test
	void playTest() {
		assertEquals("El Rubius", adapter.play());
	}
}
