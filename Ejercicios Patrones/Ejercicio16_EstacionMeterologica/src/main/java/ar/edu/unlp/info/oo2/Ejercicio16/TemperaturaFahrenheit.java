package ar.edu.unlp.info.oo2.Ejercicio16;

public class TemperaturaFahrenheit extends Decorator{

	public TemperaturaFahrenheit(WeatherData weatherData) {
		super(weatherData);
	}
	
	public String displayData() {
		return super.displayData() + this.getTemperatura();
	}
	
}
