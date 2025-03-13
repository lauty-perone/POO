package ar.edu.unlp.info.oo2.Ejercicio12;

import java.util.zip.CRC32;

public class CRC32_Calculator implements CRC_Calculator{
	
	private CRC32 crc;
	
	public CRC32_Calculator() {
		this.crc = new CRC32();
	}
	
	public long crcFor(String data) {
		String datos = "un mensaje";
		crc.update(datos.getBytes());
		long result = crc.getValue();
		return result;
	}
}
