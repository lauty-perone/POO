package ar.edu.unlp.info.oo2.ParcialEstacionMeterologica;

public class RadiacionSolar extends Decorator{

	public RadiacionSolar(WeatherData weatherData) {
		super(weatherData);

	}
	
	public String displayData() {
		return super.displayData() + "Radiación Solar: " + this.getRadiacion();
	}
}
