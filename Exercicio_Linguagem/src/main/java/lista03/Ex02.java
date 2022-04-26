
package lista03;

import java.util.Scanner;

public class Ex02 {
        public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        ClassesSociais classe = new ClassesSociais();
        
        System.out.println("Digite sua renda: ");
        Double renda = sc.nextDouble();
        
            System.out.println(String.format("Você recebe aproximadamente %.1f salários mínimo", classe.QuantidadeDeSalariosMinimos(renda)));
            System.out.println(String.format("Você pertence a classe social: %s ", classe.ClassePertencente()));
    }
}
