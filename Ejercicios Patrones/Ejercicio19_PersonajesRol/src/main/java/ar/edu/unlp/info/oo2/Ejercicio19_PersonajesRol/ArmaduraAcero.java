package ar.edu.unlp.info.oo2.Ejercicio19_PersonajesRol;

public class ArmaduraAcero implements Armadura{

	public ArmaduraAcero() {

	}

	@Override
	public int getDañoEspada() {
		return 3;
	}

	@Override
	public int getDañoBaston() {
		return 1;
	}

	@Override
	public int getDañoArco() {
		return 2;
	}
	
	@Override
	public int getDañoMartillo() {
		return 5;
	}

	
}
