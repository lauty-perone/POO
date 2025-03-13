package ar.edu.unlp.info.oo2.Ejercicio19_PersonajesRol;

public class BuilderGuerrero extends PersonajeBuilder{

	@Override
	public void buildArmadura() {
		this.getPersonaje().setArmadura(new ArmaduraAcero());
	}

	@Override
	public void buildArma() {
		this.getPersonaje().setArma(new Espada());
	}

	@Override
	public void buildHabilidad() {
		this.getPersonaje().agregarHabilidad(new CombateMele());;
	}
	
	
}
