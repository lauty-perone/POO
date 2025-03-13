package ar.edu.unlp.info.oo2.ParcialEstacionMeterologica;

public class PresionAtmosferica extends Decorator {

	public PresionAtmosferica(WeatherData weatherData) {
		super(weatherData);
	}
	
	public String displayData() {
		return super.displayData() + "Presión Atmosferica: " + this.getPresion();
	}
}
