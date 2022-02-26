package lista03;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite seu sexo: ");
        String sexo = sc.nextLine();
        
        System.out.println("Digite sua altura: ");
        Double altura = sc.nextDouble();
        
        CalculaPesoIdeal calculo = new CalculaPesoIdeal();
        Double pesoIdeal = calculo.calculaPesoIdeal(sexo, altura);
        
        System.out.println(String.format("Peso ideal : %.1f",pesoIdeal));
    }
}
