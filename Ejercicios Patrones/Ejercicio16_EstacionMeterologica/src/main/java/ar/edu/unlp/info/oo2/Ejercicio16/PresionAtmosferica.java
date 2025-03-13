package ar.edu.unlp.info.oo2.Ejercicio16;

public class PresionAtmosferica extends Decorator{

	public PresionAtmosferica(WeatherData weatherData) {
		super(weatherData);
	}

	public String displayData() {
		return super.displayData() + this.getPresion();
	}
}
