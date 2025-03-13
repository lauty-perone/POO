package ar.edu.unlp.info.oo2.TrabajoPracticoRefactoring;

public class LlamadaInternacional extends Llamada {
	
	private double precioLlamada;
	
	public LlamadaInternacional(String origen, String destino, int duracion) {
		super(origen, destino, duracion);
		this.setPrecioPorSegundo(150);
		this.precioLlamada = 50;
	}
	
	public double getPrecioLlamada() {
		return precioLlamada;
	}


	public void setPrecioLlamada(double precioLlamada) {
		this.precioLlamada = precioLlamada;
	}

	@Override
	public double calcularMonto() {
		// el precio es de 150 pesos por segundo más IVA más 50 pesos por establecer la llamada
		return (this.getDuracion() * this.getPrecioPorSegundo()) 
				+ (this.getDuracion() * this.getPrecioPorSegundo() 
						* this.getIva()) + this.precioLlamada;
	}	
}
