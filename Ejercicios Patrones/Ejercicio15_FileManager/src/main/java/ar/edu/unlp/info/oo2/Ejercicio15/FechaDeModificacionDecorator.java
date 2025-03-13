package ar.edu.unlp.info.oo2.Ejercicio15;

public class FechaDeModificacionDecorator extends Decorator {
	

	public FechaDeModificacionDecorator(Component wrappee) {
		super(wrappee);
	}

	@Override
	public String prettyPrint() {
		return super.prettyPrint() + this.getFechaDeModificacion().toString();
	}
	
	
}
