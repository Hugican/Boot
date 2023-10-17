package com.capgemini.escuelita.mavenEjemplo2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class CalculadoraTest {

	static Calculadora calculo;
	
	@BeforeAll
	static void setUpBeforeClass()throws Exception{
		System.out.println("estoy en el before ALL");
		calculo= new Calculadora();
	}
	
	@Test
	void testSumar() {
		int suma= calculo.sumar(3, 5);
		int rpta = 8;
		System.out.println("prueba feliz de la suma");
		assertEquals(suma, rpta);
		
		rpta=9;
		System.out.println("prueba triste de la suma");
		assertEquals(suma, rpta);
	}

	@Test
	void testRestar() {
		int resta= calculo.restar(9, 5);
		int rpta = 4;
		System.out.println("prueba feliz de la suma");
		assertEquals(resta, rpta);
		
		rpta=9;
		System.out.println("prueba triste de la suma");
		assertEquals(resta, rpta);
		fail("Not yet implemented");
		fail("Not yet implemented");
	}

}
