package ar.edu.unlp.info.oo2.ParcialTareas;

public class TareaSinIniciar extends State{

	public TareaSinIniciar(Tarea tarea) {
		super(tarea);
	}

	@Override
	public void iniciarTarea(int instante) {
		this.getTarea().setState(new TareaIniciada(this.getTarea(),instante));
	}

	@Override
	public void completarTarea(int instante) {
		
	}

	@Override
	public int tiempoUtilizado() {
		return 0;
	}
	
	
	
}
