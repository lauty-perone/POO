package ar.edu.unlp.info.oo2.Ejercicio19_PersonajesRol;

public abstract class PersonajeBuilder {
	
	private Personaje personaje;

	public Personaje getPersonaje() {
		return personaje;
	}

	public void crearNuevoPersonaje(String nombre) {
		this.personaje = new Personaje(nombre);
	}
	
	public abstract void buildArmadura();
	public abstract void buildArma();
	public abstract void buildHabilidad();
}
