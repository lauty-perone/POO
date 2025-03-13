package ar.edu.unlp.info.oo2.Ejercicio6;

public abstract class Topografía  {
	
	public double proporcionTierra() {
		return 1 - this.proporcionAgua();
	}
	
	//Retorna objeto para comparar con una topografía atómica con compuesta
	public Object getTopografia() {
		return this;
	}
	
	public boolean isEquals(Topografía topografia) {
		return (this.proporcionAgua() == topografia.proporcionAgua());
	}
	
	//Hay que redefinirla (Topografía) para que la comparación de topografía mixta sea
	//en cuando a proporción
	//Si no se redefine compara si es el mismo objeto( misma dirección de memoria)
	public boolean equals(Object objeto) {
		return this.isEquals((Topografía) objeto);
	}
	
	public abstract double proporcionAgua();
	
	
	
	
}
