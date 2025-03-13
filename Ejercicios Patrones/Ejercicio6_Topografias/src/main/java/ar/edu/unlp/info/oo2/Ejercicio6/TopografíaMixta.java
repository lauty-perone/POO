package ar.edu.unlp.info.oo2.Ejercicio6;

import java.util.ArrayList;
import java.util.List;

public class TopografíaMixta extends Topografía{
	
	private List<Topografía> partes;
	
	public TopografíaMixta() {
		this.partes = new ArrayList<Topografía>();
	}
	
	public void agregarTopografia(Topografía topografia) {
		this.partes.add(topografia);
	}
	
	public double proporcionAgua() {
		return this.partes.stream().mapToDouble(t ->t.proporcionAgua()).sum() / this.partes.size();
	}
	
	public double proporcionTierra() {
		return this.partes.stream().mapToDouble(t ->t.proporcionTierra()).sum() / this.partes.size();
	}
	
	public boolean isEquals(Topografía topografia) {
		return this.partes.equals(topografia.getTopografia());
	}
}
