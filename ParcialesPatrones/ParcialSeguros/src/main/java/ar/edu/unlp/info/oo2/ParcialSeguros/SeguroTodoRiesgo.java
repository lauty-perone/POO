package ar.edu.unlp.info.oo2.ParcialSeguros;

public class SeguroTodoRiesgo extends Seguro {

	public SeguroTodoRiesgo(Vehiculo vehiculo, Cliente asegurado) {
		super(vehiculo, asegurado);
	}

	@Override
	public double costoSeguroVida() {
		return this.getVehiculo().antiguedad() * 9000;
	}

	@Override
	public double costoCoberturaDaños() {
		return 10000 / this.getAsegurado().getEdad();
	}

	@Override
	public double costoCoberturaDestruccionTotal() {
		return this.getVehiculo().getValor() * 0.05 + 1000;
	}
	
	
}
