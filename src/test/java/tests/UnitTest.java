package tests;

import org.calculadora.Adicion;
import org.calculadora.Division;
import org.calculadora.Extraccion;
import org.calculadora.Multiplicacion;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class UnitTest {
  
  
  @BeforeClass
  public void beforeClass() {
  System.out.println("El beforeClass se ejecuta una vez antes de todas las pruebas");
  }
  
  @BeforeTest
  public void beforeTest() {
	  System.out.println("El beforeTest se ejecuta antes de todas las pruebas");

  }

  @AfterTest
  public void afterTest() {
	  System.out.println("El afterTest se ejecuta despues de todas las pruebas");
  }

  
  @Test
	public void adicionTest() {
		System.out.println("prueba adicion");
	   Adicion adicion = new Adicion();
	   Assert.assertEquals(3,adicion.suma(1, 2));
	}
	
	
	
	@Test
	public void extraccionTest() {
		System.out.println("prueba extraccion");
	   Extraccion extraccion = new Extraccion();
	   Assert.assertEquals(0,extraccion.resta(2, 2));
	}
	
	/**
	 * Se ignora el test multiplicacion con objetivo de practica para conocer el funcionamiento del tag @ignore
	 */
	@org.testng.annotations.Ignore
	@Test
	public void multiplicacionTest() {
		System.out.println("prueba multiplicacion");
	   Multiplicacion multiplicacion = new Multiplicacion();
	   Assert.assertEquals(4,multiplicacion.multiplicacion(2, 2));
	}
	
	
	@Test
	public void divisionTest() {
		System.out.println("prueba division");
	   Division division = new Division();
	   Assert.assertEquals(2,division.division(4, 2));
	   Assert.assertEquals(0,division.division(1, 0));
	}


  
  

  @AfterClass
  public void afterClass() {
	  System.out.println("El afterClass se ejecuta una vez despues de todas las pruebas");

  }

    

}
