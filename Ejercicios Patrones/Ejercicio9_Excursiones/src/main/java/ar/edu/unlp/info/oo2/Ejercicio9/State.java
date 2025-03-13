package ar.edu.unlp.info.oo2.Ejercicio9;

public abstract class State {
	
	private Excursion excursion;
	
	public State(Excursion excursion) {
		this.excursion = excursion;
	}
	
	public Excursion getExcursion() {
		return excursion;
	}

	public void setExcursion(Excursion excursion) {
		this.excursion = excursion;
	}

	public abstract void inscribir(Usuario user);
	public abstract String obtenerInformacion();
}
