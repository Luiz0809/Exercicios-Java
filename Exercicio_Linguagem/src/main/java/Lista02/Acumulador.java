package Lista02;

import java.util.Scanner;

public class Acumulador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Integer numeroLido = 1, soma = 0;
        
        while (numeroLido != 0){
            System.out.println("Digite um número : ");
            numeroLido = sc.nextInt();
            soma += numeroLido;
        }
        System.out.println(String.format("A soma total deu : %d", soma));
    }
}
