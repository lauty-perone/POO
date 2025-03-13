package ar.edu.unlp.info.oo2.Ejercicio1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Usuario {
	
	private String sreenName;
	private List<Posteo> tweets;
	
	public Usuario(String sreenName) {
		this.sreenName = sreenName;
		this.tweets = new ArrayList<Posteo>();
	}

	public String getSreenName() {
		return sreenName;
	}

	public void setSreenName(String sreenName) {
		this.sreenName = sreenName;
	}

	public List<Posteo> getTweets() {
		return tweets;
	}

	public void setTweets(List<Posteo> tweets) {
		this.tweets = tweets;
	}
	
	public Tweet hacerTweet(LocalDate fechaPosteo, String mensaje) {
		if ((mensaje.isBlank()||mensaje.isEmpty())|| (mensaje.length()> 280))
			return null;
		Tweet tweet = new Tweet(fechaPosteo, mensaje);
		this.tweets.add(tweet);
		return tweet;
	}
	
	public ReTweet hacerReTweet(LocalDate fechaPosteo, Tweet tweet) {
		ReTweet reTweet = new ReTweet(fechaPosteo, tweet);
		this.tweets.add(reTweet);
		return reTweet;
	}
	
	public void eliminarPosteos() {
		this.tweets.removeAll(tweets);
	}
	
	public List<Posteo> obtenerListaDeRetweets(Tweet tweet){
		
		return this.tweets.stream().filter(t -> t.comprobarTweet(tweet))
				.collect(Collectors.toList());
	}
	
	
}
