package ar.edu.unlp.info.oo2.Ejercicio4;

public class Planta extends Empleado{
	
	private int aniosAntiguedad;

	public Planta(boolean casado, int cantidadHijos, int aniosAntiguedad) {
		super(casado, cantidadHijos);
		this.aniosAntiguedad = aniosAntiguedad;
	}

	public int getAniosAntiguedad() {
		return aniosAntiguedad;
	}

	public void setAniosAntiguedad(int aniosAntiguedad) {
		this.aniosAntiguedad = aniosAntiguedad;
	}
	
	public double sueldoBasico() {
		return 50000;
	}
	
	public double sueldoAdicional() {
		double adicional = super.getCantidadHijos() * 2000 + this.aniosAntiguedad * 2000;
		if (super.isCasado())
			return adicional + 5000;
		return adicional;
	}
}
