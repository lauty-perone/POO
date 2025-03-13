package ar.edu.unlp.info.oo2.Ejercicio9;

public class Completa extends State{

	public Completa(Excursion excursion) {
		super(excursion);
	}

	@Override
	public void inscribir(Usuario user) {
		this.getExcursion().getEnEspera().add(user);
	}

	@Override
	public String obtenerInformacion() {
		return "";
	}
	
	
}
