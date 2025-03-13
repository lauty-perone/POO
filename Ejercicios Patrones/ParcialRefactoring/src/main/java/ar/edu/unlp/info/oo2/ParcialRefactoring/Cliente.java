package ar.edu.unlp.info.oo2.ParcialRefactoring;

import java.util.ArrayList;
import java.util.List;

public abstract class Cliente {
	
	private String nombre;
	private List<Compra> compras;
	
	public Cliente(String nombre) {
		this.nombre = nombre;
		this.tipo = "basico";
		this.compras = new ArrayList<Compra>();
	}
	
	public Compra comprar(List<Producto> productos) {
		double temp1= this.getTemp1();
		
		double subtotal = this.subtotal(productos);
		
		double costoEnvio = subtotal * temp1;
		
		Compra n = new Compra(productos, costoEnvio(this.ge));
		this.compras.add(n);
		
		if (this.montoAcumuladoEnCompras() > 1000) {
			this.tipo = "advance";
		}else if (this.montoAcumuladoEnCompras() > 5000) {
			this.tipo = "premium";
		}
		return n;
	}
	
	public double montoAcumuladoEnCompras() {
		return 0;
	}

	
	public abstract double getTemp1();
}
