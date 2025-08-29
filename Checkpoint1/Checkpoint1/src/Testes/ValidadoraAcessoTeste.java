package Testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import Fontes.CodigoPessoaFisica;
import Fontes.ValidadoraAcesso;

class ValidadoraAcessoTeste {

	private String nomeTeste;
	ValidadoraAcesso acesso = new ValidadoraAcesso();
	
	//Executado antes dos testes
	@Before
	public void inicioTeste() {
		System.out.println("Iniciando o teste " + nomeTeste);
	}
	

	@Test
	//Teste Verificar Acesso com Sucesso
	public void testeVerificarAcessoComSucesso() {
		nomeTeste = "testeVerificarAcessoComSucesso";
		boolean resultadoReal = acesso.verificaAcesso("45597675800");
		//erro no codigo da funcao verificaAcesso
		assertTrue(resultadoReal);
	}


}


