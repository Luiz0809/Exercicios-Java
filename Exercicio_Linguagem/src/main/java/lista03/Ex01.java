
package lista03;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        CalcularMedia calculo = new CalcularMedia();
        
        System.out.println("Nota 1 : ");
        Double nota1 = sc.nextDouble();
        
        System.out.println("Nota 2 : ");
        Double nota2 = sc.nextDouble();
        
        Double media = calculo.calcularMedia(nota1, nota2);
        
        System.out.println(String.format("Média Final : %.2f", media));
        
    }
 
}
