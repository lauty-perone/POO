package ar.edu.unlp.info.oo2.ParcialSeguros;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Vehiculo {
	
	private String nombre;
	private LocalDate anioFabricacion;
	private double valor;
	private int capacidad;

	public Vehiculo(String nombre, LocalDate anioFabricacion, double valor, int capacidad) {
		this.nombre = nombre;
		this.anioFabricacion = anioFabricacion;
		this.valor = valor;
		this.capacidad = capacidad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getAnioFabricacion() {
		return anioFabricacion;
	}

	public void setAnioFabricacion(LocalDate anioFabricacion) {
		this.anioFabricacion = anioFabricacion;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}
	
	public int antiguedad() {
		return (int) ChronoUnit.YEARS.between(this.getAnioFabricacion()
				, LocalDate.now());
	}
	
	public boolean antiguedadMayorA(int anios) {
		return this.antiguedad() > anios;
	}
}
