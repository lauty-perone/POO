package ar.edu.unlp.info.oo2.Ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Sistema {
	
	private List<Usuario> usuarios;

	public Sistema() {
		this.usuarios = new ArrayList<Usuario>();
	}

	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}
	
	public Usuario agregarUsuario(String screenName) {
		Usuario usuario = new Usuario(screenName);
		if (this.userExist(usuario))
			return null;
		this.usuarios.add(usuario);
		return usuario;
	}
	
	public boolean eliminarUsuario(Usuario usuario) {
		boolean ok = false;
		
		if (this.userExist(usuario)) {
			
			//Obtengo lista de tweets del usuario indicado
			List<Posteo> userTweets = usuario.getTweets();
			
			//Compruebo uno por uno los tweets que tienen rt y elimino los rt 
			//que referencian a estos tweets
			
			//Recorro lista de tweets del usuario 
			for (Posteo tw : userTweets) {
				
				//Recorro todos los usuarios del sistema
				for (Usuario user : this.usuarios) {
					
					//Recorro los tweets de un usuario
					for (Posteo tweetUser : user.getTweets()) {
						
						//Verificio si coincide con los tweets 
						//del usuario indicado y lo elimino
						if(tweetUser.comprobarTweet(tw))
							user.getTweets().remove(tweetUser);
					}
				}
			}
			
	
			//Elimina los posteos del usuario indicado				
			usuario.eliminarPosteos();
			//Elimina al usuario
			this.usuarios.remove(usuario);
			ok = true;
		}
		return ok;
		
	}
	
	private boolean userExist(Usuario usuario) {
		return this.usuarios.stream()
				.anyMatch(u -> u.getSreenName().equals(usuario.getSreenName()));
	}
	
	
}
