package ar.edu.unlp.info.oo2.Ejercicio8;

import java.time.LocalDate;

public class Paused extends State{

	public Paused(ToDoItem task) {
		super(task);
	}

	@Override
	public void start() {
		//No hace nada
	}

	@Override
	public void togglePause() {
		this.getTask().setState(new InProgress(this.getTask()));
	}

	@Override
	public void finish() {
		this.getTask().setState(new Finished(this.getTask()));
		this.getTask().setEnd(LocalDate.now());
	}
	
	
}
