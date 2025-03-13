package ar.edu.unlp.info.oo2.Ejercicio8;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ToDoItemTest {
	
	private ToDoItem tareaIniciada;
	private ToDoItem tareaSinIniciar;
	private ToDoItem tareaFinalizada;
	private ToDoItem tareaEnPausa;
	
	@BeforeEach
	void setUp() throws Exception {
		this.tareaIniciada = new ToDoItem("tarea1");
		this.tareaSinIniciar = new ToDoItem("tarea2");
		this.tareaFinalizada = new ToDoItem("tarea3");
		this.tareaEnPausa = new ToDoItem("tarea4");
		
		this.tareaIniciada.start();
		
		this.tareaFinalizada.start();
		this.tareaFinalizada.finished();
		
		this.tareaEnPausa.start();
		this.tareaEnPausa.togglePaused();
	}
	
	@Test
	 void startTest() {
		assertTrue(this.tareaIniciada.getState() instanceof InProgress);
		
		assertTrue(this.tareaSinIniciar.getState() instanceof Pending);
		
		this.tareaFinalizada.start();
		assertTrue(this.tareaFinalizada.getState() instanceof Finished);
		
		this.tareaEnPausa.start();
		assertTrue(this.tareaEnPausa.getState() instanceof Paused);
		
	}
	
	@Test
	void togglePausedTest() {
		this.tareaIniciada.togglePaused();
		assertTrue(this.tareaIniciada.getState() instanceof Paused);
		
		this.tareaEnPausa.togglePaused();;
		assertTrue(this.tareaEnPausa.getState() instanceof InProgress);
		
		Exception exceptionFinished = assertThrows(RuntimeException.class, () -> {this.tareaFinalizada.togglePaused();});
	    assertEquals("El objeto ToDoItem no se encuentra en pause o in-progress",exceptionFinished.getMessage());
	    Exception exceptionPending = assertThrows(RuntimeException.class, () -> {this.tareaSinIniciar.togglePaused();});
	    assertEquals("El objeto ToDoItem no se encuentra en pause o in-progress",exceptionPending.getMessage());		
	}
	
	@Test 
	void finishedTest(){
		this.tareaIniciada.finished();
		assertTrue(this.tareaIniciada.getState() instanceof Finished);
		
		this.tareaSinIniciar.finished();
		assertTrue(this.tareaSinIniciar.getState() instanceof Pending);
		
		this.tareaEnPausa.finished();
		assertTrue(this.tareaEnPausa.getState() instanceof Finished);
		
		this.tareaFinalizada.finished();
		assertTrue(this.tareaFinalizada.getState() instanceof Finished);
	}
	
	@Test
	void addComentTest() {
		
	}
	
	@Test
	void worketTimeTest() {
		
	}
	
	
}
