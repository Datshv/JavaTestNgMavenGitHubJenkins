package org.calculadora;

public class Division {

	public int division(int numero1, int numero2) {
		if(numero2==0) {
			System.out.println("no se puede dividir para 0 por lo cual se retornara un 0 por default");
			return 0;
		}else {
			return numero1/numero2;
		}
		
	}
}
