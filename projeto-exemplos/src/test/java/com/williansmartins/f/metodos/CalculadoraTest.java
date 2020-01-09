package com.williansmartins.f.metodos;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Before;
import org.junit.Test;

public class CalculadoraTest {
	
	Calculadora c;

	@Before
	public void prepararCalculos() {
		c = new Calculadora();
	}
	
	@Test
	public void somarDoisNumeros() {
		int resultado = c.calcular(3,5);
		assertEquals(8, resultado);
	}
	
	@Test
	public void somarDoisNumerosComErro() {
		int resultado = c.calcular(3,5);
		assertNotEquals(9, resultado);
	}
	
	@Test
	public void subtrair() {
		int resultado = c.subtrair(5,3);
		assertEquals(2, resultado);
	}
}
