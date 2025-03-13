package ar.edu.unlp.info.oo2.Ejercicio9;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Excursion  {
	
	private String nombre;
	private LocalDate fechaInicio;
	private LocalDate fechaFin;
	private double costo;
	private String puntoEncuentro;
	private int cupoMin;
	private int cupoMax;
	private List<Usuario> inscriptos;
	private List<Usuario> enEspera;
	private State state;
	
	public Excursion(String nombre, LocalDate fechaInicio, LocalDate fechaFin, 
			String puntoEncuentro, int cupoMin,int cupoMax, double costo) {
		this.nombre = nombre;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.puntoEncuentro = puntoEncuentro;
		this.cupoMin = cupoMin;
		this.cupoMax = cupoMax;
		this.costo = costo;
		this.inscriptos = new ArrayList<Usuario>();
		this.enEspera = new ArrayList<Usuario>();
		this.state = new Provisoria(this);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(LocalDate fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public LocalDate getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(LocalDate fechaFin) {
		this.fechaFin = fechaFin;
	}

	public String getPuntoEncuentro() {
		return puntoEncuentro;
	}

	public void setPuntoEncuentro(String puntoEncuentro) {
		this.puntoEncuentro = puntoEncuentro;
	}

	public int getCupoMin() {
		return cupoMin;
	}

	public void setCupoMin(int cupoMin) {
		this.cupoMin = cupoMin;
	}

	public int getCupoMax() {
		return cupoMax;
	}

	public void setCupoMax(int cupoMax) {
		this.cupoMax = cupoMax;
	}

	public List<Usuario> getInscriptos() {
		return inscriptos;
	}

	public void setInscriptos(List<Usuario> inscriptos) {
		this.inscriptos = inscriptos;
	}

	public List<Usuario> getEnEspera() {
		return enEspera;
	}

	public void setEnEspera(List<Usuario> enEspera) {
		this.enEspera = enEspera;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}
	
	public boolean alcanzoMinimo() {
		return this.inscriptos.size() == this.cupoMin;
	}
	
	public boolean alcanzoMaximo() {
		return this.inscriptos.size() == this.cupoMax;
	}
	
	public void inscribir(Usuario user) {
		this.state.inscribir(user);
	}
	
	public String obtenerInformacion() {
		return "La excursion '" + this.nombre 
				+ "' tiene un costo de " + this.costo
				+ " con fecha de inicio " + this.fechaInicio.toString()
				+ " y fecha de fin " + this.fechaFin.toString()
				+ ".\nEl punto de encuentro es en '" + this.puntoEncuentro
				+ "'. " + this.state.obtenerInformacion();
	}	
	
	public String getMailsInscriptos() {
		return this.inscriptos.stream().map(u -> u.getEmail())
				.reduce("", (acumulator, element)-> acumulator + "\n" + element);
	}
}
