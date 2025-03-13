package ar.edu.unlp.info.oo2.ParcialRefactoring;

public class Premium extends Cliente{

	public Premium(String nombre) {
		super(nombre);
	}

	@Override
	public double getTemp1() {
		return 0.55;
	}
	
	
}
