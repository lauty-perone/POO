package ar.edu.unlp.info.oo2.Ejercicio13;

import java.util.List;
import java.util.stream.Collectors;

public class Novedad extends Sugerencia{
	
	public Novedad() {
		
	}

	@Override
	public List<Pelicula> recibirSugerencias(Decodificador d) {
		return d.getGrilla().stream().sorted((p1,p2)-> Integer.compare(p1.getAnioEstreno(), p2.getAnioEstreno()))
				.collect(Collectors.toList());
	}
	
	
}
