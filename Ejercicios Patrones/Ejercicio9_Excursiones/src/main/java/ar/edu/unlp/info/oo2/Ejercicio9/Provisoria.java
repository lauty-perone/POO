package ar.edu.unlp.info.oo2.Ejercicio9;

public class Provisoria extends State {

	public Provisoria(Excursion excursion) {
		super(excursion);
	}

	@Override
	public void inscribir(Usuario user) {
		this.getExcursion().getInscriptos().add(user);
		if (this.getExcursion().alcanzoMinimo())
			this.getExcursion().setState(new Definitiva(this.getExcursion()));
	}

	@Override
	public String obtenerInformacion() {
		return "\nLos usuarios que faltan son " + 
				(this.getExcursion().getCupoMin() - 
						this.getExcursion().getInscriptos().size()) + 
				"para alcanzar el cupo mínimo";
	}
}
