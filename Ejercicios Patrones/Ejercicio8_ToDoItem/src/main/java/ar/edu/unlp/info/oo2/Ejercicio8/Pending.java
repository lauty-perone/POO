package ar.edu.unlp.info.oo2.Ejercicio8;

public class Pending extends State {
	
	public Pending(ToDoItem task) {
		super(task);
	}

	public void start() {
		this.getTask().setState(new InProgress(this.getTask()));
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
