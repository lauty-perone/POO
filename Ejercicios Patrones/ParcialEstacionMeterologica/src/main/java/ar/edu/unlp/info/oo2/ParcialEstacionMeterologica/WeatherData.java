package ar.edu.unlp.info.oo2.ParcialEstacionMeterologica;

import java.util.List;

public interface WeatherData {
	
	public double getTemperatura();
	public double getPresion();
	public double getRadiacion();
	public List<Double> getTemperaturas();
	public String displayData();
}
