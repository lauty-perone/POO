package ar.edu.unlp.info.oo2.ParcialSeguros;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	
	private int edad;
	private Promocion promocion;
	private List<Seguro> seguros;
	
	public Cliente(int edad, Promocion promocion) {
		this.edad = edad;
		this.promocion = promocion;
		this.seguros =  new ArrayList<Seguro>();	
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public Promocion getPromocion() {
		return promocion;
	}

	public void setPromocion(Promocion promocion) {
		this.promocion = promocion;
	}
	
	public List<Seguro> getSeguros() {
		return seguros;
	}

	public void setSeguros(List<Seguro> seguros) {
		this.seguros = seguros;
	}

	public void agregarSeguro(Seguro seguro) {
		this.seguros.add(seguro);
	}
	
	public double costoSeguros() {
		return this.seguros.stream()
				.mapToDouble(s -> s.costoTotal()).sum();
	}
	
	private double descuentoPromocion() {
		return this.promocion.aplicarPromocion(this);
	}
	
	public double montoAbonar() {
		return this.costoSeguros() - this.descuentoPromocion();
	}
	
	public double costoSeguroMasEconomico() {
		return this.seguros.stream()
						   .mapToDouble(s -> s.costoTotal())
						   .min().orElse(0);
	}
}
