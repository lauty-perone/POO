package ar.edu.unlp.info.oo2.Ejercicio7;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Directory extends FileSystem{

	private List<FileSystem> archivos;
	
	public Directory(String nombre, LocalDate fechaCreacion, int tamaño) {
		super(nombre, fechaCreacion, tamaño);
		this.archivos = new ArrayList<FileSystem>();
	}
	
	public void addFile(File file) {
		this.archivos.add(file);
	}
	
	@Override
	public int tamañoTotalOcupado() {
		return this.archivos.stream().mapToInt(a -> a.tamañoTotalOcupado()).sum() + 32;
	}

	@Override
	public File archivoMasGrande() {
		return this.archivos.stream().map(f -> f.archivoMasGrande())
				.max((a1,a2)-> Integer.compare(a1.tamañoTotalOcupado(), a2.tamañoTotalOcupado()))
				.orElse(null);
	}

	@Override
	public File archivoMasNuevo() {
		return this.archivos.stream().map(f -> f.archivoMasNuevo())
				.max((a1,a2)-> a1.getFechaCreacion().compareTo(a2.getFechaCreacion()))
				.orElse(null);
	}

	@Override
	public FileSystem buscar(String nombre) {
		return this.archivos.stream().filter(file -> file.getNombre().equals(nombre))
				.findFirst()
				.orElse(null);
	}

	@Override
	public List<FileSystem> buscarTodos(String nombre) {
		return null;
	}

	@Override
	public String listadoDeContenido() {
		return null;
	}
	
	
}
