package ar.edu.unlp.info.oo2.Ejercicio5;

public class VideoStream {
	
	private String stream;
	
	public VideoStream(String stream) {
		this.stream = stream;
	}
	
	public String getStream() {
		return stream;
	}

	public void setStream(String stream) {
		this.stream = stream;
	}

	public String reproduce() {
		return this.stream;
	}
	
	
}
