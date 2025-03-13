package ar.edu.unlp.info.oo2.Ejercicio12;

public class WifiConn implements Connection{
	
	private String pict;

	public WifiConn() {
		this.pict = "Simbolo Wifi";
	}

	@Override
	public String sendData(String data, long crc) {
		return "transmitting data with Wifi Connection";
	}

	@Override
	public String pict() {
		return this.pict;
	}
	
	
}
