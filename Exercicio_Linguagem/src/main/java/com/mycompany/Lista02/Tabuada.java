
package Lista02;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite um número para ver a tabuada dele : ");
        Integer numeroEscolhido = sc.nextInt();
        
        for (int i = 0; i <= 10; i++){
            System.out.println(String.format("%d x %d = %d", numeroEscolhido, i, numeroEscolhido*i));}
    }
}
