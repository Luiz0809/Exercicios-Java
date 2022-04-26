package com.mycompany.exercicio_linguagem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Integer limitePessoas;
        List<Double> peso = new ArrayList();
        Double limitePesoElevador, peso1, peso2, peso3;
        
        System.out.println("Limite de peso no elevador : ");
        limitePesoElevador = sc.nextDouble();
        
        System.out.println("Limite de pessoas no elevador : ");
        limitePessoas = sc.nextInt();
        
   
        System.out.println("Peso da 1ª pessoa que entrou no elevador : ");
        peso1 = sc.nextDouble();
        
        System.out.println("Peso da 2ª pessoa que entrou no elevador : ");
        peso2 = sc.nextDouble();
        
        System.out.println("Peso da 3ª pessoa que entrou no elevador : ");
        peso3 = sc.nextDouble();
        
        Double pesoElevador = peso1 + peso2 + peso3;
            
        System.out.printf("Entraram 3 pessoas no elevador, no qual cabem %d pessoas.\n"
                          + "O peso total no elevador é de %.2f, sendo que ele suporta %.2f"
                , limitePessoas, pesoElevador, limitePesoElevador);
        
    }
}
