package ar.edu.unlp.info.oo2.Ejercicio16;

public abstract class Promedio extends Decorator{

	public Promedio(WeatherData weatherData) {
		super(weatherData);
	}
	
	public String displayData() {
		return super.displayData() + "\nPromedio: "+ this.promedio();
	}
	
	public abstract double promedio();
}
