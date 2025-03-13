package ar.edu.unlp.info.oo2.TrabajoPracticoRefactoring;

import java.util.SortedSet;

public class GeneradorUltimo implements Generador{

	@Override
	public String obtenerNumero(SortedSet<String> lineas) {
		return lineas.last();
	}
	
	
		
	
}
