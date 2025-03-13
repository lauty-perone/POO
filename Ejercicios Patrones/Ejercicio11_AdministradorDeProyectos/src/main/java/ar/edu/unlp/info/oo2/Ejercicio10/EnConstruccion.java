package ar.edu.unlp.info.oo2.Ejercicio10;

public class EnConstruccion extends State {

	public EnConstruccion(Proyecto proyecto) {
		super(proyecto);
	}

	@Override
	public void aprobarEtapa() {
		if (this.getProyecto().precioDelProyecto() == 0)
			throw new RuntimeException("Error: el precio del proyecto es igual a cero");
		this.getProyecto().setState(new EnEvaluacion(this.getProyecto()));
	}

	@Override
	public void modificarMargenDeGanancia(double margen) {
		if ((this.getProyecto().getMargenGanancia() > 8)
			&& (this.getProyecto().getMargenGanancia() < 10))
			this.getProyecto().setMargenGanancia(margen);
	}
	
	
}
