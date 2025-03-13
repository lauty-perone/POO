package ar.edu.unlp.info.oo2.Ejercicio5;

public class Audio extends Media{
	
	private String cancion;
	
	public Audio(String cancion) {
		this.cancion = cancion;
	}
	
	public String getCancion() {
		return cancion;
	}


	public void setCancion(String cancion) {
		this.cancion = cancion;
	}


	public String play() {
		return cancion;
	}
	
}
