
package com.mycompany.exercicio_linguagem;

import java.util.Scanner;

public class ex09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String nome;
        Integer anoNascimento;
        
        System.out.println("Digite seu nome : ");
        nome = sc.nextLine();
        
        System.out.println("Olá, " + nome +"! Qual o ano de seu nascimento ? : ");
        anoNascimento = sc.nextInt();
        
        Integer idadeEm2030 = 2030-anoNascimento;
        System.out.printf("Em 2030 você terá %d anos", idadeEm2030);
    }
}
