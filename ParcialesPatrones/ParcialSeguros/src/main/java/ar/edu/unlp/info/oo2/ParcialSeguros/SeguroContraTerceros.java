package ar.edu.unlp.info.oo2.ParcialSeguros;

public class SeguroContraTerceros extends Seguro {
	
	
	public SeguroContraTerceros(Vehiculo vehiculo, Cliente asegurado) {
		super(vehiculo, asegurado);
	}

	@Override
	public double costoSeguroVida() {
		return super.getAsegurado().getEdad() * 100;
	}

	@Override
	public double costoCoberturaDaños() {
		return super.getVehiculo().getValor() * 0.01 + 1000;
	}

	@Override
	public double costoCoberturaDestruccionTotal() {
		return super.getVehiculo().getValor() * 0.05;
	}
	
}
