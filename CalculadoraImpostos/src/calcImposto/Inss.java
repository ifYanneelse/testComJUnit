package calcImposto;

public class Inss {
    
    public double calcular(double salarioBruto){
        if(salarioBruto <= 965.67){
            return salarioBruto * (0.08);
        } else if (salarioBruto > 965.68 && salarioBruto <= 1609.45){
            return salarioBruto * (0.09);
        } else if (salarioBruto > 1609.46 && salarioBruto < 3218.90){
            return salarioBruto * (0.11);
        } else {
            return 3218.90 * (0.11);
        }
    }
    
}
