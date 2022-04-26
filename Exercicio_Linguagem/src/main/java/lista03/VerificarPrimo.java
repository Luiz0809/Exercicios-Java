package lista03;

import java.awt.BorderLayout;

public class VerificarPrimo {
    
    boolean isPrimo (Integer numero){
        for (int i = 2; i < numero; i++) {
                if (numero % i == 0)
                    return false;   
            }
            return true;
        }
}
