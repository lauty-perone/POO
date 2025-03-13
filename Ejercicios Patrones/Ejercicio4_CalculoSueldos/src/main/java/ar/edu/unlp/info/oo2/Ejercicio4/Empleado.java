package ar.edu.unlp.info.oo2.Ejercicio4;

public abstract class Empleado {
	
	private boolean casado;
	private int cantidadHijos;
	
	public Empleado(boolean casado, int cantidadHijos) {
		this.casado = casado;
		this.cantidadHijos = cantidadHijos;
	}

	public boolean isCasado() {
		return casado;
	}

	public void setCasado(boolean casado) {
		this.casado = casado;
	}

	public int getCantidadHijos() {
		return cantidadHijos;
	}

	public void setCantidadHijos(int cantidadHijos) {
		this.cantidadHijos = cantidadHijos;
	}
	
	public double sueldo() {
		return this.sueldoBasico() + this.sueldoAdicional() - this.descuento();
	}
	
	public double descuento() {
		return this.sueldoBasico() * 0.13 + this.sueldoAdicional() * 0.05;
	}
	
	public abstract double sueldoBasico();
	public abstract double sueldoAdicional();
	
	
}
