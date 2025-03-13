package ar.edu.unlp.info.oo2.Ejercicio19_PersonajesRol;

public class Director {
	
	private PersonajeBuilder builder;

	public void setBuilder(PersonajeBuilder builder) {
		this.builder = builder;
	}
	
	public Personaje getPersonaje() {
		return this.builder.getPersonaje();
	}
	
	public void construirPersonaje(String nombre) {
		builder.crearNuevoPersonaje(nombre);
		builder.buildArma();
		builder.buildArmadura();
		builder.buildHabilidad();
	}
}
