package ar.edu.unlp.info.oo2.TrabajoPracticoRefactoring;

public class PersonaJuridica extends Cliente {

	private String cuit;
	private double descuentoJur;
	
	public PersonaJuridica(String nombre, String numeroTelefono, String cuit) {
		super(nombre, numeroTelefono);
		this.cuit = cuit;
		this.descuentoJur = 0;
	}

	public String getCuit() {
		return cuit;
	}

	public void setCuit(String cuit) {
		this.cuit = cuit;
	}

	public double getDescuentoJur() {
		return descuentoJur;
	}

	public void setDescuentoJur(double descuentoJur) {
		this.descuentoJur = descuentoJur;
	}

	@Override
	public double aplicarDescuento(double monto) {
		return monto * this.getDescuentoJur();
	}	
	
	
}
