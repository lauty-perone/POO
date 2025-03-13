package ar.edu.unlp.info.oo2.Ejercicio19_PersonajesRol;

public class BastonMago implements Arma{

	public BastonMago() {
		
	}

	@Override
	public int atacar(Armadura armadura) {
		return armadura.getDañoBaston();
	}
	
	
}
