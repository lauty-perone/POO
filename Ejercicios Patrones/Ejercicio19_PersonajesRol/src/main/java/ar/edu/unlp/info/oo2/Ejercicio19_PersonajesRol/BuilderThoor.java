package ar.edu.unlp.info.oo2.Ejercicio19_PersonajesRol;

public class BuilderThoor extends PersonajeBuilder{

	@Override
	public void buildArmadura() {
		this.getPersonaje().setArmadura(new ArmaduraHierro());
	}

	@Override
	public void buildArma() {
		this.getPersonaje().setArma(new Martillo());
	}

	@Override
	public void buildHabilidad() {
		this.getPersonaje().agregarHabilidad(new LanzaRayos());
		this.getPersonaje().agregarHabilidad(new CombateDistancia());
	}
}
