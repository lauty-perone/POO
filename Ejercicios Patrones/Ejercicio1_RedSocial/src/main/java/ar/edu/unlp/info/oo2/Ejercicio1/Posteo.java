package ar.edu.unlp.info.oo2.Ejercicio1;

import java.time.LocalDate;

public abstract class Posteo {
	
	private LocalDate fechaPosteo;

	public Posteo(LocalDate fechaPosteo) {
		this.fechaPosteo = fechaPosteo;
	}

	public LocalDate getFechaPosteo() {
		return fechaPosteo;
	}
	
	public void setFechaPosteo(LocalDate fechaPosteo) {
		this.fechaPosteo = fechaPosteo;
	}
	
	public abstract boolean comprobarTweet(Posteo t);
	
	
}
