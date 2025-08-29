package Testes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import Fontes.CodigoPessoaFisica;
import Fontes.ValidadoraAcesso;

class CodigoPessoaFisicaTeste {
	
	private String nomeTeste;
	CodigoPessoaFisica cpf = new CodigoPessoaFisica();
	
	//Executado antes dos testes
	@Before
	public void inicioTeste() {
		System.out.println("Iniciando o teste " + nomeTeste);
	}
	

	@Test
	//Teste CPF Valido
	public void testeCPFValido() {
		nomeTeste = "testeCPFValido";
		boolean resultadoReal = cpf.validaCPF("455.976.758-00");
		assertTrue(resultadoReal);
	}
	
	
	@Test
	//Teste CPF Invalido
	public void testeCPFInvalido() {
		nomeTeste = "testeCPFValido";
		boolean resultadoReal = cpf.validaCPF("111.444.000-35");
		assertFalse(resultadoReal);
	}


	
	@Test
	//Teste Remove com Sucesso
	public void testeRemoveCaracteresComSucesso() {
		nomeTeste = "testeRemoveCaracteresComSucesso";
		String resultadoReal = cpf.removeCaracteresEspeciais("111.444.000-35");
		String resultadoEsperado = "11144400035";
		assertEquals(resultadoReal, resultadoEsperado);
	}
	
}
	

