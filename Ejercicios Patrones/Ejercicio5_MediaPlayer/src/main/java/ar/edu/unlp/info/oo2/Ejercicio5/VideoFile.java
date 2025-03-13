package ar.edu.unlp.info.oo2.Ejercicio5;

public class VideoFile extends Media{
	
	private String video;
	
	public VideoFile(String video) {
		this.video = video;
	}
	
	public String getVideo() {
		return video;
	}


	public void setVideo(String video) {
		this.video = video;
	}


	public String play() {
		return this.video;
	}
}
