package ar.edu.unlp.info.oo2.Ejercicio13;

import java.util.ArrayList;
import java.util.List;

public class Decodificador {
	
	private List<Pelicula> grilla;
	private List<Pelicula> peliculasReproducidas;
	private Sugerencia sugerencia;
	
	public Decodificador() {
		this.grilla = new ArrayList<Pelicula>();
		this.peliculasReproducidas = new ArrayList<Pelicula>();
		this.sugerencia = null;
	}
	
	public List<Pelicula> getGrilla() {
		return grilla;
	}

	public void setGrilla(List<Pelicula> grilla) {
		this.grilla = grilla;
	}

	public List<Pelicula> getPeliculasReproducidas() {
		return peliculasReproducidas;
	}

	public void setPeliculasReproducidas(List<Pelicula> peliculasReproducidas) {
		this.peliculasReproducidas = peliculasReproducidas;
	}

	public void agregarPelicula(Pelicula pelicula) {
		if (!this.grilla.contains(pelicula))
			this.grilla.add(pelicula);
	}
	
	public void agregarPeliculaReproducida(Pelicula pelicula) {
		this.peliculasReproducidas.add(pelicula);
	}
	
	public String recibirSugerencias() {
		//return sugerencia.obtenerSugerencias(this);
		String res = sugerencia.obtenerSugerencias(this).stream()
				.map(p -> p.getTitulo())
				.reduce(" ", (acumulator, element)-> acumulator + ", " + element);
		return res.substring(3);
	}
	
	public void cambiarSugerencia(Sugerencia sugerencia) {
		this.sugerencia = sugerencia;
	}
}
