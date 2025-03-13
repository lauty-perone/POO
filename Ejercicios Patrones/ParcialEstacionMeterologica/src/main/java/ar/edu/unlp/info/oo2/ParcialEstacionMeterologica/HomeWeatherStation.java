package ar.edu.unlp.info.oo2.ParcialEstacionMeterologica;

import java.util.ArrayList;
import java.util.List;

public class HomeWeatherStation {
	
	private double temperaturaFahrenheit;
	private double presion;
	private double radiacionSolar;
	private List<Double> temperaturasFahrenheit;

	public HomeWeatherStation(double temperaturaFahrenheit, double presion, double radiacionSolar) {
		this.temperaturaFahrenheit = temperaturaFahrenheit;
		this.presion = presion;
		this.radiacionSolar = radiacionSolar;
		this.temperaturasFahrenheit = new ArrayList<Double>();
	}

	public double getTemperaturaFahrenheit() {
		return temperaturaFahrenheit;
	}

	public double getPresion() {
		return presion;
	}

	public double getRadiacionSolar() {
		return radiacionSolar;
	}

	public List<Double> getTemperaturasFahrenheit() {
		return temperaturasFahrenheit;
	}
	
	
}
