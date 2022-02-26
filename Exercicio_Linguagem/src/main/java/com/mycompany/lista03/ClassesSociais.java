
package lista03;

import java.util.Scanner;

public class ClassesSociais {
    
    Double salarioMinimo = 1100.00;
    Double quantidadeDeSalariosMinimos;
    String classe;
    
    Double QuantidadeDeSalariosMinimos(Double renda){
        return quantidadeDeSalariosMinimos = renda/salarioMinimo;
    }
    
    String ClassePertencente(){
        if (quantidadeDeSalariosMinimos > 20){
            classe = "A";
        }
        else if (quantidadeDeSalariosMinimos >= 10 && quantidadeDeSalariosMinimos <= 20){
            classe = "B";
        }
        else if (quantidadeDeSalariosMinimos >= 4 && quantidadeDeSalariosMinimos <= 10){
            classe = "C";
        }
        else if (quantidadeDeSalariosMinimos >= 2 && quantidadeDeSalariosMinimos <= 4){
            classe = "D";
        }
        else {
            classe = "E";
        }
        return classe;
    }

    
}
