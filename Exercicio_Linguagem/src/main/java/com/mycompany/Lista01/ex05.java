package com.mycompany.exercicio_linguagem;

import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
       Double numero1, numero2;
       
        System.out.println("Digite o primeiro número: ");
        numero1 = sc.nextDouble();
        
        System.out.println("Digite o segundo número: ");
        numero2 = sc.nextDouble();
        
        Double soma = numero1 + numero2;
        Double subtracao = numero1 - numero2;
        Double multiplicacao = numero1 * numero2;
        Double divisao = numero1 / numero2;
        
        System.out.printf("Resultado da Soma \n %.1f \n"
                + "Resultado da Subtração \n %.1f \n"
                + "Resultado da Multiplicação \n %.1f \n"
                + "Resultado da Divisão \n %.1f \n", soma, subtracao, multiplicacao, divisao);
    }
}
