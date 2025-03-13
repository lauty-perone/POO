package ar.edu.unlp.info.oo2.ParcialRefactoring;

public class Basico extends Cliente {

	public Basico(String nombre) {
		super(nombre);
	}

	@Override
	public double getTemp1() {
		return 0.1;
	}
	
	
}
