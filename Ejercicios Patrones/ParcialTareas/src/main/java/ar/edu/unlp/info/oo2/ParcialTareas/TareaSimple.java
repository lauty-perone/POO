package ar.edu.unlp.info.oo2.ParcialTareas;

public class TareaSimple extends Tarea {
	
	private int duracionEstimada;
	public TareaSimple(String descripcion, int duracionEstimada) {
		super(descripcion);
		this.duracionEstimada = duracionEstimada;
	}

	@Override
	public int estimacionTotal() {
		return this.duracionEstimada;
	}

	@Override
	public void iniciarTarea(int instante) {
		this.getState().iniciarTarea(instante);
	}

	@Override
	public void completarTarea(int instante) {
		this.getState().completarTarea(instante);
	}

	@Override
	public int tiempoUtilizado() {
		return this.getState().tiempoUtilizado();	
	}

	@Override
	public double avanceTarea() {
		// TODO Auto-generated method stub
		return this.tiempoUtilizado() / this.estimacionTotal();
	}
	
	
	
	
}
