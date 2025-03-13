package ar.edu.unlp.info.oo2.Ejercicio12;

public class fourGConnection {
	
	private String symb;
	
	public fourGConnection() {
		this.symb = "Simbolo 4G";
	}

	public String getSymb() {
		return symb;
	}

	public void setSymb(String symb) {
		this.symb = symb;
	}
	
	public String transmit(String data, long crc) {
		return "transmitting data with 4G Connection";
	}
}
