package ar.edu.unlp.info.oo2.Ejercicio16;

public class GradosCelsius extends Decorator {

	public GradosCelsius(WeatherData weatherData) {
		super(weatherData);
	}
		
	public String displayData() {
		return super.displayData() + this.getTemperaturaCelsius();
	}
	
	private double getTemperaturaCelsius() {
		return (super.getTemperatura() - 32) / 1.8;
	}
}
