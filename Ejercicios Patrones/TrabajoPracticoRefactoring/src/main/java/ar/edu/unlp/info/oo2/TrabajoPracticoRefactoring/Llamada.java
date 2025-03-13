package ar.edu.unlp.info.oo2.TrabajoPracticoRefactoring;

public abstract class Llamada {
	
	private String origen;
	private String destino;
	private int duracion;
	private double iva;
	private double precioPorSegundo;

	public Llamada(String origen, String destino, int duracion) {
		this.origen = origen;
		this.destino = destino;
		this.duracion = duracion;
		this.iva = 0.21;
	}
	
	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	
	public double getIva() {
		return iva;
	}

	public void setIva(double iva) {
		this.iva = iva;
	}

	public double getPrecioPorSegundo() {
		return precioPorSegundo;
	}

	public void setPrecioPorSegundo(double precioPorSegundo) {
		this.precioPorSegundo = precioPorSegundo;
	}

	public abstract double calcularMonto();
}
