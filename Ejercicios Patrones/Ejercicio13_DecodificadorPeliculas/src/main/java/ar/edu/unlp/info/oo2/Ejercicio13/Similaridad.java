package ar.edu.unlp.info.oo2.Ejercicio13;

import java.util.List;
import java.util.stream.Collectors;

public class Similaridad extends Sugerencia{
		
	public Similaridad() {
		
	}

	@Override
	public List<Pelicula> recibirSugerencias(Decodificador d) {
		return d.getPeliculasReproducidas().stream()
				.map(p -> p.getPeliculasSimilares())
				.flatMap(l -> l.stream()).distinct().collect(Collectors.toList());
	}
	
	
}
