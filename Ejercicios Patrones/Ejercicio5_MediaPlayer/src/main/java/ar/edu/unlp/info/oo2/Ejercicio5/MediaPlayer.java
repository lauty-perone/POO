package ar.edu.unlp.info.oo2.Ejercicio5;

public class MediaPlayer {
	
	private Media media;
	
	public MediaPlayer(Media media) {
		this.media = media;
	}

	public Media getMedia() {
		return media;
	}

	public void setMedia(Media media) {
		this.media = media;
	}
	
	public String play() {
		return this.media.play();
	}
	
}
