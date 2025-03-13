package ar.edu.unlp.info.oo2.Ejercicio4;

public class Temporario extends Empleado{
	
	private int horasTrabajadas;

	public Temporario(boolean casado, int cantidadHijos, int horasTrabajadas) {
		super(casado, cantidadHijos);
		this.horasTrabajadas = horasTrabajadas;
	}

	public int getHorasTrabajadas() {
		return horasTrabajadas;
	}

	public void setHorasTrabajadas(int horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}
	
	public double sueldoBasico() {
		return 20000 + this.horasTrabajadas * 300;
	}
	
	public double sueldoAdicional() {
		double adicional = super.getCantidadHijos() * 2000;
		if (super.isCasado())
			return adicional + 5000;
		return adicional;
	}
}
