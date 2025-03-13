package ar.edu.unlp.info.oo2.TrabajoPracticoRefactoring;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
	
	private List<Cliente> clientes;
	private GestorNumerosDisponibles guia;
	
	public Empresa() {
		this.clientes = new ArrayList<Cliente>();
		this.guia = new GestorNumerosDisponibles();
	}
	
	public boolean agregarNumeroTelefono(String str) {
		return guia.agregarNumeroTelefono(str);
	}
	
	public Cliente registrarUsuarioFisico(String nombre,String dni) {
		String numeroTelefono = guia.obtenerNumeroLibre();
		Cliente c = new PersonaFisica(nombre,numeroTelefono,dni);
		this.clientes.add(c);
		return c;
	}
	
	public Cliente registrarUsuarioJuridico(String nombre,String cuit) {
		String numeroTelefono = guia.obtenerNumeroLibre();
		Cliente c = new PersonaJuridica(nombre,numeroTelefono,cuit);
		this.clientes.add(c);
		return c;
	}

	public Llamada registrarLlamadaInternacional(Cliente origen, Cliente remitente, int duracion) {
		return origen.registrarLlamadaInternacional(remitente, duracion);
	}
	
	public Llamada registrarLlamadaNacional(Cliente origen, Cliente remitente, int duracion) {
		return origen.registrarLlamadaNacional(remitente, duracion);
	}
	
	public String obtenerNumeroLibre() {
		return guia.obtenerNumeroLibre();
	}
	
	public double calcularMontoTotalLlamadas(Cliente cliente) {
		return cliente.calcularMontoTotalLlamadas();
	}
	
	public int cantidadDeUsuarios() {
		return clientes.size();
	}

	public boolean existeUsuario(Cliente persona) {
		return clientes.contains(persona);
	}

	public GestorNumerosDisponibles getGestorNumeros() {
		return this.guia;
	}
}
