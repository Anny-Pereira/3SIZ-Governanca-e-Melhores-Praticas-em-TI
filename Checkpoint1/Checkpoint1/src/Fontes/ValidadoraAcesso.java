package Fontes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ValidadoraAcesso {
	
	List<String> listaCpfsAutorizados = new ArrayList<>();
	
	
	public void alimentarlista() {
		listaCpfsAutorizados.add("45597675800");
		listaCpfsAutorizados.add("51261482816");
	}
	
	public boolean verificaAcesso(String CPF) {
		
		CodigoPessoaFisica pessoa = new CodigoPessoaFisica();
		
		if(pessoa.validaCPF(CPF)) {
			//erro
			if(listaCpfsAutorizados.contains(pessoa.removeCaracteresEspeciais(CPF))) {
				return true;
			} else {
				return false;
			}
			
		} else {
			return false;
		}

	}
	
	public String exibirMensagem(String CPF) {
		if(verificaAcesso(CPF)) {
			return "Seu CPF é válido para acesso ao sistema.";
		} else {
			return "Seu CPF é inválido para acesso ao sistema.";
		}
	}
	
	

}
