package ar.edu.unlp.info.oo2.Ejercicio1;

import java.time.LocalDate;

public class ReTweet extends Posteo{
	
	private Tweet tweet;

	public ReTweet(LocalDate fechaPosteo, Tweet tweet) {
		super(fechaPosteo);
		this.tweet = tweet;
	}

	public Tweet getTweet() {
		return tweet;
	}

	public void setTweet(Tweet tweet) {
		this.tweet = tweet;
	}
	
	public boolean comprobarTweet(Posteo t) {
		return this.tweet.equals(t);
	}
	
}
