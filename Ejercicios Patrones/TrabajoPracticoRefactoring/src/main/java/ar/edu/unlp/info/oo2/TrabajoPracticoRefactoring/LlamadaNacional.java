package ar.edu.unlp.info.oo2.TrabajoPracticoRefactoring;

public class LlamadaNacional extends Llamada {
	
	public LlamadaNacional(String origen, String destino, int duracion) {
		super(origen, destino, duracion);
		this.setPrecioPorSegundo(3);
	}

	@Override
	public double calcularMonto() {
		// el precio es de 3 pesos por segundo más IVA sin adicional por establecer la llamada
		return this.getDuracion() * this.getPrecioPorSegundo()
				+ this.getDuracion() * this.getPrecioPorSegundo() * this.getIva();
	}
}
