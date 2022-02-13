package com.mycompany.exercicio_linguagem;

import java.util.Scanner;

public class ex08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        String nome;
        Double nota1, nota2;
        
        System.out.println("Digite seu nome : ");
        nome = sc.nextLine();
        
        System.out.println("Primeira Nota : ");
        nota1 = sc.nextDouble();
        
        System.out.println("Segunda Nota : ");
        nota2 = sc.nextDouble();
        
        Double media = (nota1+nota2)/2;
        
        System.out.printf("Olá, %s, Sua média foi de %.1f", nome, media);
    }
}
