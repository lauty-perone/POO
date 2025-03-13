package ar.edu.unlp.info.oo2.Ejercicio19_PersonajesRol;

public class BuilderMago extends PersonajeBuilder {

	@Override
	public void buildArmadura() {
		this.getPersonaje().setArmadura(new ArmaduraCuero());
	}

	@Override
	public void buildArma() {
		this.getPersonaje().setArma(new BastonMago());
	}

	@Override
	public void buildHabilidad() {
		this.getPersonaje().agregarHabilidad(new Magia());
		this.getPersonaje().agregarHabilidad(new CombateDistancia());		
	}
}
