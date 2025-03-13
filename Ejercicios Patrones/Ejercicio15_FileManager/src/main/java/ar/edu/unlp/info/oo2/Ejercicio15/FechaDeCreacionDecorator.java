package ar.edu.unlp.info.oo2.Ejercicio15;

public class FechaDeCreacionDecorator extends Decorator{

	public FechaDeCreacionDecorator(Component wrappee) {
		super(wrappee);
	}

	@Override
	public String prettyPrint() {
		return super.prettyPrint() + this.getFechaDeCreacion().toString();
	}
	
	
}
