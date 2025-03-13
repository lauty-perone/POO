package ar.edu.unlp.info.oo2.Ejercicio10;

public class EnEvaluacion extends State{

	public EnEvaluacion(Proyecto proyecto) {
		super(proyecto);
	}

	@Override
	public void aprobarEtapa() {
		this.getProyecto().setState(new Confirmada(this.getProyecto()));
	}

	@Override
	public void modificarMargenDeGanancia(double margen) {
		if ((this.getProyecto().getMargenGanancia() > 11)
				&& (this.getProyecto().getMargenGanancia() < 15))
			this.getProyecto().setMargenGanancia(margen);
	}
	
	
}
