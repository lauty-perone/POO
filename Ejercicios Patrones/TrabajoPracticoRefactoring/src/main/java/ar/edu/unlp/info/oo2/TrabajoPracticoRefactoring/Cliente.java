package ar.edu.unlp.info.oo2.TrabajoPracticoRefactoring;

import java.util.ArrayList;
import java.util.List;

public abstract class Cliente {
	
	private String nombre;
	private String numeroTelefono;
	private List<Llamada> llamadas;
	
	public Cliente(String nombre, String numeroTelefono) {
		this.nombre = nombre;
		this.numeroTelefono = numeroTelefono;
		this.llamadas = new ArrayList<Llamada>();
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNumeroTelefono() {
		return numeroTelefono;
	}
	
	public void setNumeroTelefono(String numeroTelefono) {
		this.numeroTelefono = numeroTelefono;
	}

	public Llamada registrarLlamadaNacional(Cliente destino, int duracion) {
		Llamada l = new LlamadaNacional(this.getNumeroTelefono(), destino.getNumeroTelefono(),duracion);
		this.llamadas.add(l);
		return l;
	}
	
	public Llamada registrarLlamadaInternacional(Cliente destino, int duracion) {
		Llamada l = new LlamadaInternacional(this.getNumeroTelefono(), destino.getNumeroTelefono(),duracion);
		this.llamadas.add(l);
		return l;
	}
	
	public double calcularMontoTotalLlamadas() {
		return this.llamadas.stream()
				.mapToDouble(llamada -> {
					double auxc = llamada.calcularMonto();
					return auxc -= this.aplicarDescuento(auxc);
				})
				.sum();
	}
	
	public abstract double aplicarDescuento(double monto);
}
