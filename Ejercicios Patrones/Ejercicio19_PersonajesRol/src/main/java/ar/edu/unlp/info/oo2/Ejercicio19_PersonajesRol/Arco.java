package ar.edu.unlp.info.oo2.Ejercicio19_PersonajesRol;

public class Arco implements Arma {

	public Arco() {
		
	}

	@Override
	public int atacar(Armadura armadura) {
		return armadura.getDañoArco();
	}
	
}
