package ar.edu.unlp.info.oo2.ParcialEstacionMeterologica;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class HomeWeatherStationTest {
	
	private HomeWeatherStationAdapter station;
	private PresionAtmosferica presion;
	private RadiacionSolar radiacion;
	private TemperaturaCelsius t;
	private PromedioFahrenheit p;
	@BeforeEach
	void setUp() throws Exception{
		this.station = new HomeWeatherStationAdapter
				(new HomeWeatherStation(29, 1008, 500));
		
	}
	
	@Test
	void displayDataTest() {
		station.agregarTemperatura(30);
		station.agregarTemperatura(10);
		this.presion = new PresionAtmosferica(station);
		this.radiacion = new RadiacionSolar(presion);
		this.t = new TemperaturaCelsius(radiacion);
		this.p = new PromedioFahrenheit(t);
		
		System.out.println(p.displayData());
	}
}
