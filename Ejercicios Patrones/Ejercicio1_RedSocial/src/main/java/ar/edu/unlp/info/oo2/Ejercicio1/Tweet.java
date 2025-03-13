package ar.edu.unlp.info.oo2.Ejercicio1;

import java.time.LocalDate;

public class Tweet extends Posteo{
	
	private String mensaje;

	public Tweet(LocalDate fechaPosteo, String mensaje) {
		super(fechaPosteo);
		this.mensaje = mensaje;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	
	public Tweet getTweet() {
		return null;
	}
	
	public boolean comprobarTweet(Posteo t) {
		return false;
	}
}
