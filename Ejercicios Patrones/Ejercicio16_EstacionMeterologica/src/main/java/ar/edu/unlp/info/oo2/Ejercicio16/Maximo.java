package ar.edu.unlp.info.oo2.Ejercicio16;

public class Maximo extends Decorator{

	public Maximo(WeatherData weatherData) {
		super(weatherData);
	}
	
	public String displayData() {
		return super.displayData() + "\nMaximo: " +this.maximo();
	}
	
	private double maximo() {
		return super.getTemperaturas().stream()
				.max((t1,t2)-> Double.compare(t1, t2))
				.orElse(0.0);
	}
}
