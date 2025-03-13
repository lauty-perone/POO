package ar.edu.unlp.info.oo2.Ejercicio15;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FileManagerTest {
	
	private NombreDecorator nombre1;
	private NombreDecorator nombre2;
	private TamañoDecorator tamaño;
	private PermisosDecorator permisos;
	private ExtensionDecorator extension1;
	private ExtensionDecorator extension2;
	private FechaDeCreacionDecorator fechaCreacion;
	private FileOO2 file;
	
	@BeforeEach
	void setUp() throws Exception{
		this.file = new FileOO2("NOMBRE", "EXTENSION", 10
				, LocalDate.of(2024, 3, 20), LocalDate.now(), "PERMISOS");
		
	}
	
	@Test
	void prettyPrintTest() {
		this.nombre1 = new NombreDecorator(file);
		this.extension1 = new ExtensionDecorator(nombre1);
		System.out.println(this.extension1.prettyPrint());
		assertEquals(" NOMBRE EXTENSION", this.extension1.prettyPrint());
		
		this.fechaCreacion = new FechaDeCreacionDecorator(extension1);
		System.out.println(this.fechaCreacion.prettyPrint());
		assertEquals(" NOMBRE EXTENSION 2024-03-20", this.fechaCreacion.prettyPrint());
		
		this.permisos = new PermisosDecorator(file);
		this.nombre2 = new NombreDecorator(permisos);
		this.extension2 = new ExtensionDecorator(nombre2);
		this.tamaño = new TamañoDecorator(extension2);
		System.out.println(tamaño.prettyPrint());
		assertEquals(" PERMISOS NOMBRE EXTENSION 10.0", this.tamaño.prettyPrint());
	}
}
