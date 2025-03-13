package ar.edu.unlp.info.oo2.ParcialTareas;

public class TareaCompletada extends State {
	
	private int instanteCompletada;
	private TareaIniciada t;
	
	public TareaCompletada(Tarea tarea, int instante, TareaIniciada t) {
		super(tarea);
		this.instanteCompletada = instante;
		this.t = t;
	}
	
	public int getInstanteCompletada() {
		return instanteCompletada;
	}

	public void setInstanteCompletada(int instanteCompletada) {
		this.instanteCompletada = instanteCompletada;
	}

	@Override
	public void iniciarTarea(int instante) {
		
	}

	@Override
	public void completarTarea(int instante) {
		
	}

	@Override
	public int tiempoUtilizado() {
		return this.instanteCompletada - this.t.getInstanteIniciada();
	}

	
	
	
	
	
}
