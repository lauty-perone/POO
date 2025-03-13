package ar.edu.unlp.info.oo2.Ejercicio13;

import java.util.List;
import java.util.stream.Collectors;

public abstract class Sugerencia {
	
	public Sugerencia() {
		
	}
	
	public List<Pelicula> obtenerSugerencias(Decodificador d) {
		return this.recibirSugerencias(d).stream()
				.filter(pelicula -> !d.getPeliculasReproducidas().contains(pelicula))
				.limit(3).collect(Collectors.toList());
	}
	
	public abstract List<Pelicula> recibirSugerencias(Decodificador d);
}
