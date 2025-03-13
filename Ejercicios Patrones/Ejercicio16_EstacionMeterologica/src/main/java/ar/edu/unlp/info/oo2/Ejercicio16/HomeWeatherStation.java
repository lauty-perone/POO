package ar.edu.unlp.info.oo2.Ejercicio16;

import java.util.ArrayList;
import java.util.List;

public class HomeWeatherStation implements WeatherData{
	
	private double temperatura;
	private double presion;
	private double radiacionSolar;
	private List<Double> temperaturasSensadas;
	
	public HomeWeatherStation(double temperatura, double presion, double radiacionSolar) {
		this.temperatura = temperatura;
		this.presion = presion;
		this.radiacionSolar = radiacionSolar;
		this.temperaturasSensadas = new ArrayList<Double>();
	}

	public double getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(double temperatura) {
		this.temperatura = temperatura;
	}

	public double getPresion() {
		return presion;
	}

	public void setPresion(double presion) {
		this.presion = presion;
	}

	public double getRadiacionSolar() {
		return radiacionSolar;
	}

	public void setRadiacionSolar(double radiacionSolar) {
		this.radiacionSolar = radiacionSolar;
	}

	public List<Double> getTemperaturas() {
		return temperaturasSensadas;
	}

	public void setTemperaturasSensadas(List<Double> temperaturasSensadas) {
		this.temperaturasSensadas = temperaturasSensadas;
	}
	
	public String displayData() {
		return "Temperatura F: " + this.getTemperatura() + "\n" + 
			   	  "Presión atmosf: " + this.getPresion() + "\n" +
			   	  "Radiación solar: " + this.getRadiacionSolar();
	}
	
	public void agregarTemperatura(double t) {
		this.temperaturasSensadas.add(t);
	}
	
}
