package ar.edu.unlp.info.oo2.TrabajoPracticoRefactoring;

import java.util.SortedSet;
import java.util.TreeSet;

public class GestorNumerosDisponibles {
	
	private SortedSet<String> lineas;
	private Generador tipoGenerador;
	
	public GestorNumerosDisponibles() {
		this.lineas =  new TreeSet<String>();
		this.tipoGenerador = new GeneradorUltimo();
	}
	
	public SortedSet<String> getLineas() {
		return lineas;
	}
	
	public boolean agregarNumeroTelefono(String str) {
		boolean encontre = this.getLineas().contains(str);
		if (!encontre) {
			this.getLineas().add(str);
			encontre= true;
			return encontre;
		}
		else {
			encontre= false;
			return encontre;
		}
	}
	
	public String obtenerNumeroLibre() {
		String linea = this.tipoGenerador.obtenerNumero(this.lineas);
		this.lineas.remove(linea);
		return linea;
	}
	
	public void cambiarTipoGenerador(Generador generador) {
		this.tipoGenerador = generador;
	}
	
}
