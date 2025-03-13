package ar.edu.unlp.info.oo2.Ejercicio15;

import java.time.LocalDate;

public abstract class Decorator implements Component{
	
	private Component wrappee;
	
	public Decorator(Component wrappee) {
		this.wrappee = wrappee;
	}
	
	public Component getWrappee() {
		return wrappee;
	}

	public void setWrappee(Component wrappee) {
		this.wrappee = wrappee;
	}

	@Override
	public String prettyPrint() {
		return this.wrappee.prettyPrint() + " ";
	}

	@Override
	public String getNombre() {
		return this.wrappee.getNombre();
	}

	@Override
	public String getExtension() {
		return this.wrappee.getExtension();
	}

	@Override
	public double getTamaño() {
		return this.wrappee.getTamaño();
	}

	@Override
	public LocalDate getFechaDeCreacion() {
		return this.wrappee.getFechaDeCreacion();
	}

	@Override
	public LocalDate getFechaDeModificacion() {
		return this.wrappee.getFechaDeModificacion();
	}

	@Override
	public String getPermisos() {
		return this.wrappee.getPermisos();
	}

	
	
}
