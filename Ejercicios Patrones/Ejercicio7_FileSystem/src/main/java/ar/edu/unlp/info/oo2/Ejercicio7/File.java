package ar.edu.unlp.info.oo2.Ejercicio7;

import java.time.LocalDate;
import java.util.List;

public class File extends FileSystem{

	public File(String nombre, LocalDate fechaCreacion, int tamaño) {
		super(nombre, fechaCreacion, tamaño);
	}
		
	@Override
	public File archivoMasGrande() {
		return this;
	}

	@Override
	public File archivoMasNuevo() {
		return this;
	}

	@Override
	public int tamañoTotalOcupado() {		
		return super.getTamaño();
	}

	@Override
	public FileSystem buscar(String nombre) {
		return this;
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
