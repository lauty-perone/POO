package ar.edu.unlp.info.oo2.Ejercicio16;

public class PromedioCelsius extends Promedio{

	public PromedioCelsius(WeatherData weatherData) {
		super(weatherData);
	}

	@Override
	public double promedio() {
		return super.getTemperaturas().stream().map(t -> this.temperaturaCelsius(t))
				.mapToDouble(t -> t).average().orElse(0);
	}
	
	private double temperaturaCelsius(double t) {
		return (t -32 )/1.8;
	}
}
