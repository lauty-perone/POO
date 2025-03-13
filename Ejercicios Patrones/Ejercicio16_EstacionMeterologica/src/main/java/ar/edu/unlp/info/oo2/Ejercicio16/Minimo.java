package ar.edu.unlp.info.oo2.Ejercicio16;

public class Minimo extends Decorator {

	public Minimo(WeatherData weatherData) {
		super(weatherData);
	}
	
	public String displayData() {
		return super.displayData() + "\nMinimo: " + this.minimo();
	}
	
	private double minimo() {
		return super.getTemperaturas().stream()
				.min((t1,t2) -> Double.compare(t1,t2))
				.orElse(0.0);
	}
}
