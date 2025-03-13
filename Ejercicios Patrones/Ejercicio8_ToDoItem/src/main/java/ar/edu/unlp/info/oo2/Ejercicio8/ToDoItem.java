package ar.edu.unlp.info.oo2.Ejercicio8;

import java.time.Duration;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ToDoItem {
	
	private String nombre;
	private LocalDate start;
	private LocalDate end;
	private List<String> coments;
	private State state;
	
	public ToDoItem(String nombre) {
		this.nombre = nombre;
		this.start = LocalDate.now();
		this.end = null;
		this.coments = new ArrayList<String>();
		this.state = new Pending(this);
	}

	public LocalDate getStart() {
		return start;
	}

	public void setStart(LocalDate start) {
		this.start = start;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getEnd() {
		return end;
	}

	public void setEnd(LocalDate end) {
		this.end = end;
	}

	public List<String> getComents() {
		return coments;
	}

	public void setComents(List<String> coments) {
		this.coments = coments;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public void addComent(String coment) {
		this.coments.add(coment);
	}
	
	public void start() {
		this.state.start();
	}
	
	public void finished() {
		this.state.finish();
	}
	
	public void togglePaused() {
		this.state.togglePause();
	}
	
	public Duration worketTime() {
		return this.state.worketTime();
	}

}
