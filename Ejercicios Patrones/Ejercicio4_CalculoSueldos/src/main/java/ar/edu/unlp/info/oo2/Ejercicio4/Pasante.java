package ar.edu.unlp.info.oo2.Ejercicio4;

public class Pasante extends Empleado {

	private int examenRendidos;

	public Pasante(boolean casado, int cantidadHijos, int examenRendidos) {
		super(casado, cantidadHijos);
		this.examenRendidos = examenRendidos;
	}

	public int getExamenRendidos() {
		return examenRendidos;
	}

	public void setExamenRendidos(int examenRendidos) {
		this.examenRendidos = examenRendidos;
	}
	
	public double sueldoBasico() {
		return 20000;
	}
	
	public double sueldoAdicional() {
		return this.examenRendidos * 2000;
	}
	
}
