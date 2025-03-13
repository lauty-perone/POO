package ar.edu.unlp.info.oo2.ParcialEstacionMeterologica;

public class PromedioFahrenheit extends Decorator{

	public PromedioFahrenheit(WeatherData weatherData) {
		super(weatherData);
	}
	
	public String displayData() {
		return super.displayData() + "Promedio: " + this.calcularPromedio(); 
	}
	
	private double calcularPromedio() {
		return this.getTemperaturas().stream()
				.mapToDouble(t -> t).average().orElse(0);
	}
}
