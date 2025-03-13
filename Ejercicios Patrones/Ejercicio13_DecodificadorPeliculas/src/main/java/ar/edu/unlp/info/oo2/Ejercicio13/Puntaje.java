package ar.edu.unlp.info.oo2.Ejercicio13;

import java.util.List;
import java.util.stream.Collectors;

public class Puntaje extends Sugerencia {
	
	public Puntaje() {
		
	}

	@Override
	public List<Pelicula> recibirSugerencias(Decodificador d) {
		return d.getGrilla().stream()
				.sorted((p1,p2)-> Integer.compare(p2.getAnioEstreno(), p1.getAnioEstreno()))
				.sorted((p1,p2)-> Double.compare(p2.getPuntaje(), p1.getPuntaje()))
				.collect(Collectors.toList());
	}
	
	
}
