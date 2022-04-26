package lista03;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Idade classifica = new Idade();
        
        System.out.println("Qual a sua idade ?: ");
        Integer idade = sc.nextInt();
        
        classifica.classificaIdade(idade);
    }
}
