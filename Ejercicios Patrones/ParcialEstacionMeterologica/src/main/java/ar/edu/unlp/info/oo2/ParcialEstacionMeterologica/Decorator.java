package ar.edu.unlp.info.oo2.ParcialEstacionMeterologica;

import java.util.List;

public abstract class Decorator implements WeatherData{
	
	private WeatherData weatherData;
	
	public Decorator(WeatherData weatherData) {
		this.weatherData = weatherData;
	}

	@Override
	public double getTemperatura() {
		return this.weatherData.getTemperatura();
	}

	@Override
	public double getPresion() {
		return this.weatherData.getPresion();
	}

	@Override
	public double getRadiacion() {
		return this.weatherData.getRadiacion();
	}

	@Override
	public List<Double> getTemperaturas() {
		return this.weatherData.getTemperaturas();
	}

	@Override
	public String displayData() {
		return this.weatherData.displayData() + "\n";
	}
	
	
}
