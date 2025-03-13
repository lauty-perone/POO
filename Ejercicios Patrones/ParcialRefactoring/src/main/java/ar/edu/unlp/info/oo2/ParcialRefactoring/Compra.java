package ar.edu.unlp.info.oo2.ParcialRefactoring;

import java.util.List;

public class Compra {
	
	private List<Producto> productos;
	private double subtotal;
	private double envio;
	private String estado;

	public Compra(List<Producto> productos,double envio) {
		this.productos = productos;
		this.subtotal = this.subtotal();
		this.envio = envio;
		this.estado = "nuevo";
	}

	public List<Producto> getProductos() {
		return productos;
	}

	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}

	public double getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}

	public double getEnvio() {
		return envio;
	}

	public void setEnvio(double envio) {
		this.envio = envio;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	public double subtotal() {
		return productos.stream().mapToDouble(p-> p.getPrecio()).sum();
	}
	
	public double costoEnvio(double temp1) {
		return subtotal * temp1;
	}
	
	
	 
}
