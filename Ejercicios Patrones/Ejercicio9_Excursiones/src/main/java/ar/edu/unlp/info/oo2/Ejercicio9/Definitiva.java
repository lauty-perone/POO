package ar.edu.unlp.info.oo2.Ejercicio9;

public class Definitiva extends State{

	public Definitiva(Excursion excursion) {
		super(excursion);
	}

	@Override
	public void inscribir(Usuario user) {
		super.getExcursion().getInscriptos().add(user);
		if (this.getExcursion().alcanzoMaximo())
			this.getExcursion().setState(new Completa(this.getExcursion()));
	}

	@Override
	public String obtenerInformacion() {
		return "Mails de los usuarios inscriptos" + this.getExcursion().getMailsInscriptos()
				+ "Actualmente faltan" + (this.getExcursion().getCupoMax() - 
						this.getExcursion().getInscriptos().size())
				+ " usuarios para alcanzar el cupo máximo";
	}
	
	
}
