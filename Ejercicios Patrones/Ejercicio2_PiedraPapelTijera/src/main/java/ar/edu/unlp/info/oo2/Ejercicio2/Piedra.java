package ar.edu.unlp.info.oo2.Ejercicio2;

public class Piedra implements Jugada {
	
	public Piedra() {
		
	}
	
	public String jugarContra(Jugada otraJugada) {
		return otraJugada.jugarContraPiedra();	
	}
	
	public String jugarContraPiedra() {
		return "Empate";
	}
	
	public String jugarContraPapel() {
		return "Gana Papel";
	}
	
	public String jugarContraTijera() {
		return "Gana Piedra";
	}
	
	public String jugarContraLagarto() {
		return "Gana Piedra";
	}
	
	public String jugarContraSpock() {
		return "Gana Spock";
	}
}
