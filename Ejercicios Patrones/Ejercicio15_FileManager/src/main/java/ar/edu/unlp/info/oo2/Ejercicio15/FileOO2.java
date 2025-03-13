package ar.edu.unlp.info.oo2.Ejercicio15;

import java.time.LocalDate;

public class FileOO2 implements Component {
	
	private String nombre;
	private String extension;
	private double tamaño;
	private LocalDate fechaDeCreacion;
	private LocalDate fechaDeModificacion;
	private String permisos;
	
	public FileOO2(String nombre, String extension, double tamaño, LocalDate fechaDeCreacion,
			LocalDate fechaDeModificacion, String permisos) {
		this.nombre = nombre;
		this.extension = extension;
		this.tamaño = tamaño;
		this.fechaDeCreacion = fechaDeCreacion;
		this.fechaDeModificacion = fechaDeModificacion;
		this.permisos = permisos;
	}

	public String getNombre() {
		return nombre;
	}

	public String getExtension() {
		return extension;
	}

	public double getTamaño() {
		return tamaño;
	}

	public LocalDate getFechaDeCreacion() {
		return fechaDeCreacion;
	}

	public LocalDate getFechaDeModificacion() {
		return fechaDeModificacion;
	}

	public String getPermisos() {
		return permisos;
	}

	@Override
	public String prettyPrint() {
		return "";
	}
	
	
	
	
}
