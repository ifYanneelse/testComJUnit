package calcImposto;
import calcImposto.Inss;

public class Ir {
    
    public double calcular(double salarioBruto){
        if (salarioBruto <= 1371.0){
            return 0.0;
        }else{
            return salarioBruto*0.02057;
        }
    }
    
    public Inss calcularInss(){       
        Inss inss = new Inss();
        return inss;
        
    }
        
}
