package ar.edu.unlp.info.oo2.ParcialTareas;

import java.util.ArrayList;
import java.util.List;

public class TareaCompleja extends Tarea{
	
	private List<Tarea> components;

	public TareaCompleja(String descripcion) {
		super(descripcion);
		this.components = new ArrayList<Tarea>();
	}

	@Override
	public int estimacionTotal() {
		return this.components.stream().mapToInt(t-> t.estimacionTotal()).sum();
	}

	@Override
	public void iniciarTarea(int instante) {
		for (Tarea tarea: components)
			tarea.iniciarTarea(instante);
	}

	@Override
	public void completarTarea(int instante) {
		for (Tarea tarea: components)
			tarea.completarTarea(instante);
	}

	@Override
	public int tiempoUtilizado() {
		return this.components.stream().mapToInt(t->t.tiempoUtilizado()).sum();
	}

	@Override
	public double avanceTarea() {
		return (double)this.tiempoUtilizado() / this.estimacionTotal();
	}
	
	public void agregarTarea(Tarea t) {
		this.components.add(t);
	}
	
	
	
	
}
