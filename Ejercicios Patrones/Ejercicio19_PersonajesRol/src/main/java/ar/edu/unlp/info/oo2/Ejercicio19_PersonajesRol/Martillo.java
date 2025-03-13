package ar.edu.unlp.info.oo2.Ejercicio19_PersonajesRol;

public class Martillo implements Arma {
	
	public Martillo() {
		
	}

	@Override
	public int atacar(Armadura armadura) {
		return armadura.getDañoMartillo();
	}
	
	
}
