package ar.edu.unlp.info.oo2.Ejercicio19_PersonajesRol;

public class ArmaduraCuero implements Armadura{
	
	public ArmaduraCuero() {
		
	}

	@Override
	public int getDañoEspada() {
		return 8;
	}

	@Override
	public int getDañoBaston() {
		return 2;
	}

	@Override
	public int getDañoArco() {
		return 5;
	}
	
	@Override
	public int getDañoMartillo() {
		return 90;
	}	
}
