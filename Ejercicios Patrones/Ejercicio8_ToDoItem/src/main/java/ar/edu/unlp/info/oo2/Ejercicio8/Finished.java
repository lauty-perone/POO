package ar.edu.unlp.info.oo2.Ejercicio8;

public class Finished extends State{

	public Finished(ToDoItem task) {
		super(task);
	}

	@Override
	public void start() {
		//No hace nada
	}

	@Override
	public void togglePause() {
		throw new RuntimeException("El objeto ToDoItem no se "
				+ "encuentra en pause o in-progress");
	}

	@Override
	public void finish() {
		//No hace nada
	}
	
	
}
