package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import modelos.Persona;

class tests {

	@Test
	void testCrearIncorrectaNegativa() {
		Exception exception = assertThrows(IllegalArgumentException.class, () -> new Persona("pepe", "botella", -1));

		String esperado = "edad incorrecta";
		String obtenido=exception.getMessage();
		assertEquals(esperado,obtenido);
	}
	
	@Test
	void testCrearIncorrectaMayor() {
		Exception exception = assertThrows(IllegalArgumentException.class, () -> new Persona("pepe", "botella", 131));

		String esperado = "edad incorrecta";
		String obtenido=exception.getMessage();
		assertEquals(esperado,obtenido);
	}
	
	@Test
	void testCrearMenor1() {
		String esperado="menor de edad";
		String obtenido=new Persona("nfnvi","vfsv",0).mostrarEdad();
		assertEquals(esperado,obtenido);
	}
	
	@Test
	void testCrearMenor2() {
		String esperado="menor de edad";
		String obtenido=new Persona("nfnvi","vfsv",17).mostrarEdad();
		assertEquals(esperado,obtenido);
	}
	
	@Test
	void testCrearMayor1() {
		String esperado="mayor de edad";
		String obtenido=new Persona("nfnvi","vfsv",18).mostrarEdad();
		assertEquals(esperado,obtenido);
	}
	
	@Test
	void testCrearMayor2() {
		String esperado="mayor de edad";
		String obtenido=new Persona("nfnvi","vfsv",65).mostrarEdad();
		assertEquals(esperado,obtenido);
	}
	
	@Test
	void testCrearJubilado1() {
		String esperado="jubilado";
		String obtenido=new Persona("nfnvi","vfsv",66).mostrarEdad();
		assertEquals(esperado,obtenido);
	}
	
	@Test
	void testCrearJubilado2() {
		String esperado="jubilado";
		String obtenido=new Persona("nfnvi","vfsv",130).mostrarEdad();
		assertEquals(esperado,obtenido);
	}
}
