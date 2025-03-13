package ar.edu.unlp.info.oo2.Ejercicio2;

public class Lagarto implements Jugada {
	
	public Lagarto() {
		
	}
	
	public String jugarContra(Jugada otraJugada) {
		return otraJugada.jugarContraLagarto();
	}
	
	public String jugarContraPiedra() {
		return "Gana Piedra";
	}
	
	public String jugarContraPapel() {
		return "Gana Lagarto";
	}
	
	public String jugarContraTijera() {
		return "Gana Tijeras";
	}
	
	public String jugarContraLagarto() {
		return "Empate";
	}
	
	public String jugarContraSpock() {
		return "Gana Lagarto";
	}
}
