package Calculadora;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculadoraTeste {

    @Test
    public void testSubtraiInteiros() {
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.subtraiInteiros(10, 5);
        assertEquals(5, resultado);
        
       
        }

    @Test
    public void testMultiplicaInteiros() {
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.multiplicaInteiros(6, 3);
        assertEquals(18, resultado);
        }

    @Test
    public void testDivideInteiros() {
        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.divideInteiros(8, 2);
        assertEquals(4.0, resultado, 0.001);
    }
}



