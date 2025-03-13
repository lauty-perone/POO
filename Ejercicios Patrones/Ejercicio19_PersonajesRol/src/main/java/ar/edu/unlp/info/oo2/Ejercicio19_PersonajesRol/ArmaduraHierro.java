package ar.edu.unlp.info.oo2.Ejercicio19_PersonajesRol;

public class ArmaduraHierro implements Armadura{
	
	public ArmaduraHierro() {
		
	}

	@Override
	public int getDañoEspada() {
		return 5;
	}

	@Override
	public int getDañoBaston() {
		return 1;
	}

	@Override
	public int getDañoArco() {
		return 3;
	}
	
	@Override
	public int getDañoMartillo() {
		return 7;
	}
	
}
