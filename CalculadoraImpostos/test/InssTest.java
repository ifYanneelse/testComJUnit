import calcImposto.Inss;
import junit.framework.Test;
import junit.framework.TestCase;
import static junit.framework.TestCase.assertEquals;



public class InssTest extends TestCase implements Test {    
    

    public void testCalcular() {           
        Inss inss = new Inss();

        System.out.println("calcular INSS");
        
        assertEquals(76.0, inss.calcular(950.0));
        System.out.print("Teste 1. 8%. Passou\n");
        
        assertEquals(108.0, inss.calcular(1200.0));
        System.out.print("Teste 2. 9%. Passou\n");
        
        assertEquals(231.0, inss.calcular(2100.0));
        System.out.print("Teste 3. 11%. Passou\n");
        
        assertEquals(354.079, inss.calcular(5000.0));
        System.out.print("Teste 4. 11%. Passou\n");
        
    }

}
