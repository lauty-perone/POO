package ar.edu.unlp.info.oo2.Ejercicio19_PersonajesRol;

public class BuilderArquero extends PersonajeBuilder{

	@Override
	public void buildArmadura() {
		this.getPersonaje().setArmadura(new ArmaduraCuero());
	}

	@Override
	public void buildArma() {
		this.getPersonaje().setArma(new Arco());
	}

	@Override
	public void buildHabilidad() {
		this.getPersonaje().agregarHabilidad(new CombateDistancia());
	}
	
	
}
