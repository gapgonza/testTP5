package calculadora;

import org.junit.Test;
import static org.junit.Assert.*;

public class DivisionTest {
    
    public DivisionTest() {
    }
    
    @Test(expected = ArithmeticException.class)
    public void testDivisionCero() {
        int numerador = 10;
        int denominador = 0;
        int resultado = numerador / denominador; 
    }
}
