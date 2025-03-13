package ar.edu.unlp.info.oo2.Ejercicio16;

public class RadiacionSolar extends Decorator{

	public RadiacionSolar(WeatherData weatherData) {
		super(weatherData);
	}
	
	public String displayData() {
		return super.displayData() + this.getRadiacionSolar();
	}
	
}
