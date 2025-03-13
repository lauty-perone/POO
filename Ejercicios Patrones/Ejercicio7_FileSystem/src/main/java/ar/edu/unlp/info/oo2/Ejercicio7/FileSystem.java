package ar.edu.unlp.info.oo2.Ejercicio7;

import java.time.LocalDate;
import java.util.List;

public abstract class FileSystem {
	
	private String nombre;
	private LocalDate fechaCreacion;
	private int tamaño;
	
	public FileSystem(String nombre, LocalDate fechaCreacion, int tamaño) {
		this.nombre = nombre;
		this.fechaCreacion = fechaCreacion;
		this.tamaño = tamaño;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(LocalDate fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public int getTamaño() {
		return tamaño;
	}

	public void setTamaño(int tamaño) {
		this.tamaño = tamaño;
	}

	public abstract File archivoMasGrande();
	public abstract File archivoMasNuevo();
	public abstract int tamañoTotalOcupado();
	public abstract FileSystem buscar(String nombre);
	public abstract List<FileSystem> buscarTodos(String nombre);
	public abstract String listadoDeContenido();

	
}
