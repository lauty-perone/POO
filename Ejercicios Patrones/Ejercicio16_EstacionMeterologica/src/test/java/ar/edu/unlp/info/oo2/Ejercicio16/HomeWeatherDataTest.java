package ar.edu.unlp.info.oo2.Ejercicio16;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class HomeWeatherDataTest {
	
	private HomeWeatherStation home;
	private GradosCelsius gradosCelsius;
	private PresionAtmosferica presion;
	private RadiacionSolar radiacion;
	private Promedio promedio;
	private Minimo min;
	private Maximo max;
	
	@BeforeEach
	void setUp() throws Exception {
		this.home = new HomeWeatherStation(86, 1008, 200);
		this.home.agregarTemperatura(27);
		this.home.agregarTemperatura(31);
		this.home.agregarTemperatura(32);
	}
	
	@Test
	void displayDataTest() {
		this.gradosCelsius = new GradosCelsius(home);
		this.presion = new PresionAtmosferica(gradosCelsius);
		this.radiacion = new RadiacionSolar(presion);
		this.promedio = new PromedioCelsius(radiacion);
		this.min = new Minimo(promedio);
		this.max = new Maximo(min);
		System.out.println(max.displayData());
	}
}
