package ar.edu.unlp.info.oo2.Ejercicio19_PersonajesRol;

public class Espada implements Arma {
	
	public Espada() {
		
	}

	@Override
	public int atacar(Armadura armadura) {
		return armadura.getDañoEspada();
	}
	
	
}
