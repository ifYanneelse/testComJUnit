import calcImposto.Inss;
import calcImposto.Ir;
import junit.framework.Test;
import junit.framework.TestCase;
import static junit.framework.TestCase.assertEquals;



public class IrTest extends TestCase implements Test {

    public void testCalcular() {        
        Ir ir = new Ir();
        
        System.out.println("calcular IR");
        
        assertEquals(0.0, ir.calcular(1000.0));
        System.out.print("Teste 1. 1000. Passou.\n");
        
        assertEquals(41.14, ir.calcular(2000.0));
        System.out.print("Teste 2. 2000. Passou.\n");
        
        System.out.print(" - - - - - - - \n\n");
    }

    
    public void testCalcularInss() {
//        Inss inss = new Inss();
//        System.out.println("calcular INSS por IR");
//        
//        assertEquals(76.0, inss.calcular(950.0));
//        System.out.print("Teste 1. 8%. Passou\n");
//        
//        assertEquals(108.0, inss.calcular(1200.0));
//        System.out.print("Teste 2. 9%. Passou\n");
//        
//        assertEquals(231.0, inss.calcular(2100.0));
//        System.out.print("Teste 3. 11%. Passou\n");
//        
//        assertEquals(354.079, inss.calcular(5000.0));
//        System.out.print("Teste 4. 11%. Passou\n");
//        
//        System.out.print(" - - - - - - - \n");
        
    }


}
