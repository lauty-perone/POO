package ar.edu.unlp.info.oo2.Ejercicio15;

import java.time.LocalDate;

public interface Component {
	
	public String prettyPrint();
	public String getNombre();
	public String getExtension();
	public double getTamaño();
	public LocalDate getFechaDeCreacion();
	public LocalDate getFechaDeModificacion();
	public String getPermisos();
}
