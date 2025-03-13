package ar.edu.unlp.info.oo2.Ejercicio16;

public class PromedioFahrenheit extends Promedio{

	public PromedioFahrenheit(WeatherData weatherData) {
		super(weatherData);
	}

	@Override
	public double promedio() {
		return super.getTemperaturas().stream()
				.mapToDouble(t -> t).average().orElse(0);
	}
	
	
}
