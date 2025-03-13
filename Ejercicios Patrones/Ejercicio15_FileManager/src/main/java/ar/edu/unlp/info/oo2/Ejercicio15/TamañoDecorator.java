package ar.edu.unlp.info.oo2.Ejercicio15;

public class TamañoDecorator extends Decorator{
	

	public TamañoDecorator(Component wrappee) {
		super(wrappee);
	}

	@Override
	public String prettyPrint() {
		return super.prettyPrint() + this.getTamaño();
	}
	
	
}
