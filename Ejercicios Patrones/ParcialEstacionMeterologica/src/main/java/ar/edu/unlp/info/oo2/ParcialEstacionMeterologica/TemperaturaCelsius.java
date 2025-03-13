package ar.edu.unlp.info.oo2.ParcialEstacionMeterologica;

public class TemperaturaCelsius extends Decorator {

	public TemperaturaCelsius(WeatherData weatherData) {
		super(weatherData);
	}
	
	public String displayData() {
		return super.displayData() + "Temperatura Celsius: "+ this.calcularTemperatura();
	}
	
	private double calcularTemperatura() {
		return (this.getTemperatura() - 30) + 1.8;
	}
	
	
}
