
package com.mycompany.exercicio_linguagem;

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Double valorUnitario, valorPago;
        Integer quantidade;
        
        System.out.println("Valor unitário do produto : ");
        valorUnitario = sc.nextDouble();
        
        System.out.println("Quantidade vendida : ");
        quantidade = sc.nextInt();
        
        System.out.println("Valor pago pelo cliente : ");
        valorPago = sc.nextDouble();
        
        Double valorCompra = valorUnitario * quantidade;
        Double troco = valorPago - valorCompra;
        
        if (valorPago < valorCompra){
            System.out.println("Compra não realizada");
        }
        else if(valorPago == valorCompra){
            System.out.println("Sem troco!");
        }
        else {
            System.out.printf("Seu troco será de R$%.2f", troco);
        }
        
        
        
        
    }
}
