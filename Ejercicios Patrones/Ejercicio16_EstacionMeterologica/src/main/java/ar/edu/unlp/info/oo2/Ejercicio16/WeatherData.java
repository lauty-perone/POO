package ar.edu.unlp.info.oo2.Ejercicio16;

import java.util.List;

public interface WeatherData {
	
	public String displayData();
	public double getTemperatura();
	public List<Double> getTemperaturas();
	public double getPresion();
	public double getRadiacionSolar();
}
