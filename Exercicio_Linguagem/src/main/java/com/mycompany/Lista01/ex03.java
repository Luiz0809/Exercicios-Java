package com.mycompany.exercicio_linguagem;

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        Integer aquecimento, aerobico, musculacao;
        
        System.out.println("Quantos minutos você passou se aquecendo ?");
        aquecimento = sc.nextInt();
        
        System.out.println("Quantos minutos você passou fazendo exercícios aeróbicos ?");
        aerobico = sc.nextInt();
        
        System.out.println("Quantos minutos você fazendo exercícios de musculação ?");
        musculacao = sc.nextInt();
        
        Integer tempo = aquecimento + aerobico + musculacao;
        Double caloria = (aquecimento * 12.00) + (aerobico * 20.00) + (musculacao*25.00);
        
        System.out.printf("Olá, Jorge. Você fez um total de %d minutos de exercícios e perdeu cerca de %.2f calorias", tempo, caloria);
    }
}
