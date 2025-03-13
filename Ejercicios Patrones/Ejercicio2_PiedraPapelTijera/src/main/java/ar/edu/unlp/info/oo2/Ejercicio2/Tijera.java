package ar.edu.unlp.info.oo2.Ejercicio2;

public class Tijera implements Jugada{
	
	public Tijera()  {
		
	}
	
	public String jugarContra(Jugada otraJugada) {
		return otraJugada.jugarContraTijera();
	}
	
	public String jugarContraPiedra() {
		return "Gana Piedra";
	}
	
	public String jugarContraPapel() {
		return "Gana Tijeras";
	}
	
	public String jugarContraTijera() {
		return "Empate";
	}
	
	public String jugarContraLagarto() {
		return "Gana Tijeras";
	}
	
	public String jugarContraSpock() {
		return "Gana Spock";
	}
}
