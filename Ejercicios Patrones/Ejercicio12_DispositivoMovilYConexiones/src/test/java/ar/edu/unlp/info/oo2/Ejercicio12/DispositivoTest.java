package ar.edu.unlp.info.oo2.Ejercicio12;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DispositivoTest {
	
	private Dispositivo dispositivo;
	
	@BeforeEach
	void setUp() throws Exception{
		this.dispositivo = new Dispositivo();
	}
	
	@Test
	void testSend() {
		assertEquals("transmitting data with 4G Connection", this.dispositivo.send("Datos"));
	}
	
	@Test
	void testConectarCon() {
		assertEquals("Connection changed", dispositivo.conectarCon(new WifiConn()));
		assertEquals("Connection changed", dispositivo.conectarCon(new fourGConnectionAdapter()));
	}
	
	@Test
	void testConfigurarCRC() {
		assertEquals("crc calculator changed", dispositivo.configurarCRC(new CRC32_Calculator()));
		assertEquals("crc calculator changed", dispositivo.configurarCRC(new CRC16_Calculator()));
	}
}
