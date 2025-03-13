package ar.edu.unlp.info.oo2.Ejercicio1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SistemaTest {
	
	private Sistema sistema;
	private Usuario user1;
	
	@BeforeEach
	void setUp() throws Exception{
		this.sistema = new Sistema();
		this.user1 = this.sistema.agregarUsuario("lauty_perone");
	}
	
	@Test
	void agregarUsuarioTest() {
		
		Assertions.assertNull(sistema.agregarUsuario("lauty_perone"));
		Assertions.assertNotNull(sistema.agregarUsuario("Juan"));
	}
	
	@Test
	void eliminarUsuario() {
		this.sistema.eliminarUsuario(user1);
		Assertions.assertTrue(!sistema.getUsuarios()
				.stream().anyMatch(u -> u.getSreenName().equals("lauty_perone")));
	}
}
