package ar.edu.unlp.info.oo2.ParcialTareas;

public class TareaIniciada extends State {
	
	private int instanteIniciada;
	
	public TareaIniciada(Tarea tarea, int instante) {
		super(tarea);
		this.instanteIniciada = instante;
	}
	
	public int getInstanteIniciada() {
		return instanteIniciada;
	}

	public void setInstanteIniciada(int instanteIniciada) {
		this.instanteIniciada = instanteIniciada;
	}

	@Override
	public void iniciarTarea(int instante) {

	}

	@Override
	public void completarTarea(int instante) {
		this.getTarea().setState(new TareaCompletada(this.getTarea(), instante, this));
	}

	@Override
	public int tiempoUtilizado() {
		return 0;
	}

	
	
	
}
