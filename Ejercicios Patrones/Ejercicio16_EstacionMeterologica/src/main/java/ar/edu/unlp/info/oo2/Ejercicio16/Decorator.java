package ar.edu.unlp.info.oo2.Ejercicio16;

import java.util.List;

public class Decorator implements WeatherData{
	
	private WeatherData weatherData;

	public Decorator(WeatherData weatherData) {
		this.weatherData = weatherData;
	}
	
	public WeatherData getWeatherData() {
		return weatherData;
	}

	public void setWeatherData(WeatherData weatherData) {
		this.weatherData = weatherData;
	}

	@Override
	public String displayData() {
		return this.weatherData.displayData() + " ";
	}

	@Override
	public double getTemperatura() {
		return this.weatherData.getTemperatura();
	}

	@Override
	public List<Double> getTemperaturas() {
		return this.weatherData.getTemperaturas();
	}

	@Override
	public double getPresion() {
		return this.weatherData.getPresion();
	}

	@Override
	public double getRadiacionSolar() {
		return this.weatherData.getRadiacionSolar();
	}
	
	
	
	
}
