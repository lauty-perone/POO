package ar.edu.unlp.info.oo2.Ejercicio2;

public class Papel implements Jugada{
	
	public Papel() {
		
	}
	
	public String jugarContra(Jugada otraJugada) {
		return otraJugada.jugarContraPapel();
	}
	
	public String jugarContraPiedra() {
		return "Gana Papel";
	}
	
	public String jugarContraPapel() {
		return "Empate";
	}
	
	public String jugarContraTijera() {
		return "Gana Tijeras";
	}
	
	public String jugarContraLagarto() {
		return "Gana Lagarto";
	}
	
	public String jugarContraSpock() {
		return "Gana Papel";
	}
}
