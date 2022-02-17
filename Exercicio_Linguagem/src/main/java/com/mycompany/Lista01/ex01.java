package com.mycompany.exercicio_linguagem;

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Integer bebe, crianca, adolescente;
        
        System.out.println("Quantos filhos de 0 a 3 anos você tem ?");
        bebe = sc.nextInt();
        
        System.out.println("Quantos filhos de 4 a 16 anos você tem ?");
        crianca = sc.nextInt();
        
        System.out.println("Quantos filhos de 17 a 18 anos você tem ?");
        adolescente = sc.nextInt();
        
        Double resultado = (bebe*25.12) + (crianca*15.88) + (adolescente*12.44);
        Integer quantidadeFilhos = bebe + crianca + adolescente;
        
        System.out.printf("Você tem um total de %d filhos e vai receber R$%.2f de bolsa", quantidadeFilhos, resultado);
    }
}
