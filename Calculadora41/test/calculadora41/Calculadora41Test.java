package calculadora41;

import static junit.framework.TestCase.assertEquals;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class Calculadora41Test {
    
    private Calculadora41 c;
    
    public Calculadora41Test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        c = new Calculadora41();
    }
    
    @After
    public void tearDown() {
    }

    
    
    @Test
    public void testSomar() {
        assertEquals(10, Calculadora41.somar(1, 9));
        System.out.print("Teste passou SOMAR \n");
    }

    @Test
    public void testSubtrair() {
        assertEquals(8, Calculadora41.subtrair(9, 1));
        System.out.print("Teste passou SUBTRAIR \n");
    }

  
    @Test
    public void testMultiplicar() {
        assertEquals(9, Calculadora41.multiplicar(1, 9));
        System.out.print("Teste passou MULTIPLICAR \n");
    }


    @Test
    public void testDividir() {
        assertEquals(0, Calculadora41.dividir(1, 9));
        System.out.print("Teste passou DIVIDIR \n");
    }
    
}
