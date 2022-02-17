package com.mycompany.exercicio_linguagem;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String login, senha;
        Integer quantidadeVezes;
        
        System.out.println("Login: ");
        login = sc.nextLine();
        
        System.out.println("Senha: ");
        senha = sc.nextLine();
        
        System.out.println("Quantas vezes você pode errar a senha ?: ");
        quantidadeVezes = sc.nextInt();
        
        System.out.printf("Seu login é %s e sua senha é %s. Você tem %d tentativas"
                + " antes de ser bloqueado", login, senha, quantidadeVezes);
        
        sc.close();
        
    }
}
