package ar.edu.unlp.info.oo2.ParcialTareas;

public abstract class State {
	
	private Tarea tarea;

	public State(Tarea tarea) {
		this.tarea = tarea;
	}

	public Tarea getTarea() {
		return tarea;
	}

	public void setTarea(Tarea tarea) {
		this.tarea = tarea;
	}
	
	public abstract void iniciarTarea(int instante);
	public abstract void completarTarea(int instante);
	public abstract int tiempoUtilizado();
	
	
}
