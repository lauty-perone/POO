package ar.edu.unlp.info.oo2.Ejercicio12;

public class fourGConnectionAdapter implements Connection{
	
	private fourGConnection fourGconnection;
	
	public fourGConnectionAdapter() {
		this.fourGconnection = new fourGConnection();
	}

	@Override
	public String sendData(String data, long crc) {
		return this.fourGconnection.transmit(data, crc);
	}

	@Override
	public String pict() {
		return this.fourGconnection.getSymb();
	}
	
	
}
