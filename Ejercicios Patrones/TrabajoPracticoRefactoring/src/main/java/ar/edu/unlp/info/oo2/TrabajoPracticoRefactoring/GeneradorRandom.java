package ar.edu.unlp.info.oo2.TrabajoPracticoRefactoring;

import java.util.ArrayList;
import java.util.Random;
import java.util.SortedSet;

public class GeneradorRandom implements Generador {

	@Override
	public String obtenerNumero(SortedSet<String> lineas) {
		return new ArrayList<String>(lineas)
				.get(new Random().nextInt(lineas.size()));
	}
	
	
}
