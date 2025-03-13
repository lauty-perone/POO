package ar.edu.unlp.info.oo2.TrabajoPracticoRefactoring;

public class PersonaFisica extends Cliente{
	
	private String dni;
	private double descuentoFis;
	
	public PersonaFisica(String nombre, String numeroTelefono, String dni) {
		super(nombre, numeroTelefono);
		this.dni = dni;
		this.descuentoFis = 0.85;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}
	
	public double getDescuentoFis() {
		return descuentoFis;
	}

	public void setDescuentoFis(double descuentoFis) {
		this.descuentoFis = descuentoFis;
	}

	@Override
	public double aplicarDescuento(double monto) {
		return monto * this.getDescuentoFis();
	}	
	
	
}
