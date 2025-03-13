package ar.edu.unlp.info.oo2.Ejercicio12;

public class Dispositivo {
	
	private CRC_Calculator crcCalculator;
	private Display display;
	private Ringer ringer;
	private Connection connection;

	public Dispositivo() {
		this.crcCalculator = new CRC16_Calculator();
		this.display = new Display();
		this.ringer = new Ringer();
		this.connection = new fourGConnectionAdapter();
	}
	
	public String send(String data) {
		long crc =  this.crcCalculator.crcFor(data);
		return this.connection.sendData(data, crc);
	}
	
	public String conectarCon (Connection connection) {
		this.connection = connection;
		System.out.println(this.display.showBanner(connection.pict()));
		System.out.println(this.ringer.ring());
		return "Connection changed";
	}
	
	public String configurarCRC(CRC_Calculator crc) {
		this.crcCalculator = crc;
		return "crc calculator changed";
	}
}
