package ar.edu.unlp.info.oo2.Ejercicio8;

import java.time.Duration;
import java.time.LocalDate;

public abstract class State {
	
	private ToDoItem task;
	
	public State(ToDoItem task) {
		this.task = task;
	}
	
	public ToDoItem getTask() {
		return task;
	}

	public void setTask(ToDoItem task) {
		this.task = task;
	}

	public Duration worketTime() {
		return Duration.between(this.task.getStart(), LocalDate.now());
	}
	
	public void addComent(String coment) {
		this.task.addComent(coment);
	}
	
	public abstract void start();
	public abstract void togglePause();
	public abstract void finish();
}
