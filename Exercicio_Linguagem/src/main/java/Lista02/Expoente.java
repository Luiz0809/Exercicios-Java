
package Lista02;

import java.util.Scanner;

public class Expoente {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Double resultado = 1.0;
        
        System.out.println("Digite o valor da base : ");
        Integer base = sc.nextInt();
        
        System.out.println("Digite o valor do expoente");
        Integer expoente = sc.nextInt();
        
        for (int i = 0; i < expoente; i++){
          resultado *= base; 
        }
        
        System.out.println(String.format("Resultado : %.2f", resultado));
    }
  
}
