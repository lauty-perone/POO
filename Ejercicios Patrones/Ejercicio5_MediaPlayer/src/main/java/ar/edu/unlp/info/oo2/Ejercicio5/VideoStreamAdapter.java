package ar.edu.unlp.info.oo2.Ejercicio5;

public class VideoStreamAdapter extends Media{
	
	private VideoStream videoStream;
	
	public VideoStreamAdapter(VideoStream videoStream) {
		this.videoStream = videoStream;
	}
	
	public String play() {
		return this.videoStream.reproduce();
	}
}
