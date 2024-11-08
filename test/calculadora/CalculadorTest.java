package calculadora;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculadorTest {
    
    public CalculadorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("Bienvenido a las pruebas de la clase Calculador.");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("La operación ha finalizado");
    }
    
    @Before
    public void setUp() {
        System.out.println("Ejecutando prueba...");
    }
    
    @After
    public void tearDown() {
        System.out.println("Prueba finalizada, campos en 0");
    }

    /**
     * Test of sumar method, of class Calculador.
     */
    @Test
    public void testSumar() {
        System.out.println("sumar");
        double a = 0.0;
        double b = 0.0;
        Calculador instance = new Calculador();
        double expResult = 0.0;
        double result = instance.sumar(a, b);
        assertEquals(expResult, result, 0);
    }

    /**
     * Test of restar method, of class Calculador.
     */
    @Test
    public void testRestar() {
        System.out.println("restar");
        double a = 0.0;
        double b = 0.0;
        Calculador instance = new Calculador();
        double expResult = 0.0;
        double result = instance.restar(a, b);
        assertEquals(expResult, result, 0);
    }
}
