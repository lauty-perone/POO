package ar.edu.unlp.info.oo2.ParcialSeguros;


public class SeguroTercerosCompleto extends Seguro{

	public SeguroTercerosCompleto(Vehiculo vehiculo, Cliente asegurado) {
		super(vehiculo, asegurado);
	}

	@Override
	public double costoSeguroVida() {
		return super.getVehiculo().getCapacidad() * 5000;
	}

	
	@Override
	public double costoCoberturaDaños() {
		if (this.getVehiculo().antiguedadMayorA(4))
			return this.getVehiculo().antiguedad() * 4000;
		return 10000;
	}

	@Override
	public double costoCoberturaDestruccionTotal() {
		return super.getVehiculo().getValor() * 0.05 + 10000;
	}
	
	
	
}
