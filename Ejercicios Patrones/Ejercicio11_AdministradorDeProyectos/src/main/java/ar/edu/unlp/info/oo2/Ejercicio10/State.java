package ar.edu.unlp.info.oo2.Ejercicio10;

public abstract class State {
	
	private Proyecto proyecto;

	public State(Proyecto proyecto) {
		this.proyecto = proyecto;
	}

	public Proyecto getProyecto() {
		return proyecto;
	}

	public void setProyecto(Proyecto proyecto) {
		this.proyecto = proyecto;
	}
	
	public abstract void aprobarEtapa();
	public abstract void modificarMargenDeGanancia(double margen);
}
