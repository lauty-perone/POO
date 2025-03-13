package ar.edu.unlp.info.oo2.ParcialEstacionMeterologica;

import java.util.List;

public class HomeWeatherStationAdapter implements WeatherData {
	
	private HomeWeatherStation homeWeatherStation;

	public HomeWeatherStationAdapter(HomeWeatherStation homeWeatherStation) {
		this.homeWeatherStation = homeWeatherStation;
	}

	@Override
	public double getTemperatura() {
		return this.homeWeatherStation.getTemperaturaFahrenheit();
	}

	@Override
	public double getPresion() {
		return this.homeWeatherStation.getPresion();
	}

	@Override
	public double getRadiacion() {
		return this.homeWeatherStation.getRadiacionSolar();
	}

	@Override
	public List<Double> getTemperaturas() {
		return this.homeWeatherStation.getTemperaturasFahrenheit();
	}

	@Override
	public String displayData() {
		return "";
	}
	
	public void agregarTemperatura(double temperatura) {
		this.homeWeatherStation.getTemperaturasFahrenheit().add(temperatura);
	}
	
	

	
	
}
