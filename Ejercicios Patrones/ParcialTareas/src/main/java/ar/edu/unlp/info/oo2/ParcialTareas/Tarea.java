package ar.edu.unlp.info.oo2.ParcialTareas;

public abstract class Tarea {
	
	private String descripcion;
	private State state;

	public Tarea(String descripcion) {
		this.descripcion = descripcion;
		this.state = new TareaSinIniciar(this);
	}
	
	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public abstract int estimacionTotal();
	public abstract void iniciarTarea(int instante);
	public abstract void completarTarea(int instante);
	public abstract int tiempoUtilizado();
	public abstract double avanceTarea();
	
}
