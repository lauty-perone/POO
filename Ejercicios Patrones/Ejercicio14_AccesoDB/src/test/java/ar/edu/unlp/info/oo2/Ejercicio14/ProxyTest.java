package ar.edu.unlp.info.oo2.Ejercicio14;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.Arrays;
import java.util.Collections;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ProxyTest {
	
	private Proxy proxy;
	
	@BeforeEach
	void setUp() throws Exception {
		this.proxy = new Proxy("Pepito", new DatabaseRealAccess());
	}
	
	 @Test
	    void testGetSearchResults() {
		 	//Usuario sin autenticar
		 	Exception exceptionPending = assertThrows(RuntimeException.class, () -> {proxy.getSearchResults("select * from comics where id=1");});
		 	assertEquals("Access denied or incorrect password",exceptionPending.getMessage());
		 
		 	//Usuario autenticado
		 	proxy.authenticate("Pepito");
	        assertEquals(Arrays.asList("Spiderman", "Marvel"), proxy.getSearchResults("select * from comics where id=1"));
	        assertEquals(Collections.emptyList(), proxy.getSearchResults("select * from comics where id=10"));
	    
	        //Usuario cerro sesión
	        proxy.closeSession();
	        Exception exceptionCloseSession = assertThrows(RuntimeException.class, () -> {proxy.getSearchResults("select * from comics where id=1");});
		 	assertEquals("Access denied or incorrect password",exceptionCloseSession.getMessage());
	 }

	    @Test
	    void testInsertNewRow() {
	    	//Usuario sin autenticar
	    	Exception exceptionPending = assertThrows(RuntimeException.class, () -> {proxy.getSearchResults("select * from comics where id=3");});
		 	assertEquals("Access denied or incorrect password",exceptionPending.getMessage());
	    	
	    	//Usuario autenticado
	    	proxy.authenticate("Pepito");
	        assertEquals(3, proxy.insertNewRow(Arrays.asList("Patoruzú", "La flor")));
	        assertEquals(Arrays.asList("Patoruzú", "La flor"),proxy.getSearchResults("select * from comics where id=3"));
	        
	        //Usuario cerro sesión
	        proxy.closeSession();
	        Exception exceptionCloseSession = assertThrows(RuntimeException.class, () -> {proxy.getSearchResults("select * from comics where id=3");});
		 	assertEquals("Access denied or incorrect password",exceptionCloseSession.getMessage());
	    }
}
