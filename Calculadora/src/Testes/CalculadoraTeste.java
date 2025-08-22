package Testes;
import static org.junit.Assert.*;

import org.junit.Test;

import Fontes.Calculadora;

import org.junit.Before;
import org.junit.After;

public class CalculadoraTeste {
	
	private String nomeTeste;
	private Calculadora calc;
	private double resultadoReal; 
	
	
	//Executado antes dos testes
	@Before
	public void inicioTeste() {
		System.out.println("Iniciando o cálculo ");
		calc = new Calculadora();
	}
	
	//Executado depois de cada teste
	@After
	public void terminoTeste() {
		System.out.println(nomeTeste);
		System.out.println("Cálculo finalizado. Resultado: " + resultadoReal);
	}
	
	
	
	@Test
	//Teste de Soma
	public void testeSomar3com2() {
		nomeTeste = "testeSomar3com2";
		
		resultadoReal = calc.somar(3, 2);
		double resultadoEsperado = 5;
		assertEquals(resultadoReal, resultadoEsperado, 2);
	}

	@Test
	//Teste de Soma
		public void testeSomar3ponto5com2pont5() {
			nomeTeste = "testeSomar3ponto5com2pont5";
			
			resultadoReal = calc.somar(3.5, 2.5);
			double resultadoEsperado = 6;
			assertEquals(resultadoReal, resultadoEsperado, 0);
		}

	@Test
	//Teste de Subtração
	public void testeSubtrair2ponto5de3ponto5() {
		nomeTeste = "testeSubtrair2ponto5de3ponto5";
		
		resultadoReal = calc.subtrair(3.5, 2.5);
		double resultadoEsperado = 1;
		assertEquals(resultadoReal, resultadoEsperado, 0);
	}
	
	
	@Test
	//Teste de divisão
	public void testeDividir6por2() {
		nomeTeste ="testeDividir6por2";
		
		resultadoReal = calc.dividir(2, 6);
		double resultadoEsperado = 3;
		assertEquals(resultadoReal, resultadoEsperado, 0);
	}
	
	
	
		
		
}
