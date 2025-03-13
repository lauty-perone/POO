package ar.edu.unlp.info.oo2.ParcialSeguros;

public abstract class Seguro {
	
	private Vehiculo vehiculo;
	private Cliente asegurado;
	
	public Seguro(Vehiculo vehiculo, Cliente asegurado) {
		this.vehiculo = vehiculo;
		this.asegurado = asegurado;
	}
	
	public Vehiculo getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}

	public Cliente getAsegurado() {
		return asegurado;
	}

	public void setAsegurado(Cliente asegurado) {
		this.asegurado = asegurado;
	}
	
	public double costoTotal() {
		return this.costoSeguroVida() + this.costoCoberturaDestruccionTotal() 
									  + this.costoCoberturaDaños();
	}
	
	public abstract double costoSeguroVida();	
	public abstract double costoCoberturaDaños();
	public abstract double costoCoberturaDestruccionTotal();
}
