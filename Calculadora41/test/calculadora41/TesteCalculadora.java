package calculadora41;
import junit.framework.Test;
import junit.framework.TestCase;


public class TesteCalculadora extends TestCase implements Test {
    

    public void testSomar() {
        assertEquals(10, Calculadora41.somar(1, 9));
        System.out.print("Teste passou");
    }

 
    public void testSubtrair() {
        assertEquals(8, Calculadora41.subtrair(9, 1));
        System.out.print("Teste passou");
    }

 
    public void testMultiplicar() {
        assertEquals(9, Calculadora41.multiplicar(1, 9));
        System.out.print("Teste passou");
    }

  
    public void testDividir() {
        assertEquals(0, Calculadora41.dividir(1, 9));
        System.out.print("Teste passou");
    }

}
