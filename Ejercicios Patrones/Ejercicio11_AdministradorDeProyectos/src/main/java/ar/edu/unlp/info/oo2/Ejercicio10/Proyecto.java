package ar.edu.unlp.info.oo2.Ejercicio10;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Proyecto {
	
	private String nombre;
	private LocalDate fechaInicio;
	private LocalDate fechaFin;
	private String objetivo;
	private int numIntegrantes;
	private double margenGanancia;
	private double montoPago;
	private State state;
	
	public Proyecto(String nombre,LocalDate fechaInicio, LocalDate fechaFin, String objetivo, 
			int numIntegrantes, double montoPago) {
		this.nombre = nombre;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.objetivo = objetivo;
		this.numIntegrantes = numIntegrantes;
		this.margenGanancia = 7;
		this.montoPago = montoPago;
		this.state = new EnConstruccion(this);
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getMargenGanancia() {
		return margenGanancia;
	}

	public void setMargenGanancia(double margenGanancia) {
		this.margenGanancia = margenGanancia;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public double costoDelProyecto() {
		return ChronoUnit.DAYS.between(fechaInicio, fechaFin) * this.numIntegrantes * this.montoPago; 
	}
	
	public double precioDelProyecto() {
		return  this.costoDelProyecto() + this.costoDelProyecto() * this.margenGanancia / 100;
	}
	
	public void aprobarEtapa() {
		this.state.aprobarEtapa();
	}
	
	public void modificarMargenDeGanancia(double margen) {
		this.state.modificarMargenDeGanancia(margen);
	}
	
	public void cancelarProyecto() {
		if (this.objetivo.contains("(Cancelado)"))
			this.objetivo += "(Cancelado)";
	}
	
	
}
