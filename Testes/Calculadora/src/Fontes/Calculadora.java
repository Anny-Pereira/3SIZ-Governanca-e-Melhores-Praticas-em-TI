package Fontes;

public class Calculadora {

	public static double somar(double n1, double n2) {
		return n1 + n2;
	}

	public static double subtrair(double n1, double n2) {
		return n1 - n2;
	}

	public static double multiplicar(double n1, double n2) {
		return n1 * n2;
	}

	public static double dividir(double n1, double n2) {
		double resultado = 0;
		
		if(n2 != 0) {
			resultado = n2 / n1;
			return resultado;
		} else {
			System.out.println("Erro: divisão por zero");
			return resultado;
		}
		
		
	}

}