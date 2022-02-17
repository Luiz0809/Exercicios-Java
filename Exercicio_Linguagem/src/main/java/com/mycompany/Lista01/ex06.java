
package com.mycompany.exercicio_linguagem;

import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Double salarioBruto, conducao, vt, salarioLiquido, inss, ir;
        
        
        System.out.println("Digite seu salário bruto: ");
        salarioBruto = sc.nextDouble();
        
        inss = salarioBruto * 0.1;
        ir = salarioBruto * 0.2;
        
        System.out.println("Valor da condução diária : ");
        conducao = sc.nextDouble();
        
        vt = conducao * 2 * 22;
        
        Double descontos = inss + ir + vt;
        
        salarioLiquido = salarioBruto - descontos;
        
        System.out.printf("Seu salário bruto é R$%.2f, tem um total de R$%.2f"
                + " em descontos e receberá um líquido de R$%.2f"
                ,salarioBruto, descontos, salarioLiquido);
    }
}
