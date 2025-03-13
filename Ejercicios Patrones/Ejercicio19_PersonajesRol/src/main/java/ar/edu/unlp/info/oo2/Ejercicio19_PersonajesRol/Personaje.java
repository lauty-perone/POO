package ar.edu.unlp.info.oo2.Ejercicio19_PersonajesRol;

import java.util.ArrayList;
import java.util.List;

public class Personaje {
	
	private String nombre;
	private int vida;
	private Arma arma;
	private List<Habilidad> habilidades;
	private Armadura armadura;
	
	public Personaje(String nombre) {
		this.nombre = nombre;
		this.vida = 100;
		arma = null;
		armadura = null;
		habilidades = new ArrayList<Habilidad>();
	}

	public void setArma(Arma arma) {
		this.arma = arma;
	}

	public void setArmadura(Armadura armadura) {
		this.armadura = armadura;
	}
	
	public Armadura getArmadura() {
		return armadura;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public int getVida() {
		return vida;
	}
	
	public void agregarHabilidad(Habilidad habilidad) {
		this.habilidades.add(habilidad);
	}
	
	public void atacar(Personaje objetivo) {
		objetivo.recibirDaño(arma.atacar(objetivo.getArmadura()));
	}
	
	public void recibirDaño(int daño) {
		this.vida = this.vida - daño;
	}
	
	public boolean estaVivo() {
		return vida > 0;
	}	
}
