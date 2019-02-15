package principal;

import org.calculadora.Adicion;
import org.calculadora.Division;
import org.calculadora.Extraccion;
import org.calculadora.Multiplicacion;

public class Principal {

	public static void main(String[] args) {
	
		
		
		//Instanciacion de la clase Adicion y uso de metodo sumar
		Adicion adicion = new Adicion();
		System.out.println(adicion.suma(1, 2));
		
		//Instanciacion de la clase extraccion y uso de metodo restar
		Extraccion extraccion = new Extraccion();
		System.out.println(extraccion.resta(2, 1));
		
		//Instanciacion de la clase multiplicacion y uso del metodo multiplicar
		Multiplicacion multiplicacion = new Multiplicacion();
		System.out.println(multiplicacion.multiplicacion(2, 2));
		
		
		//Instanciacion de la clase division y uso del metodo division
		Division division = new Division();
		System.out.println(division.division(4, 2));
		
	}

}
