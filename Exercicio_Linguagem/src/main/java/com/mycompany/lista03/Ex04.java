package lista03;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Bem vindo ao sistema de desconto progressivo!");
        System.out.println("");
        
        System.out.println("Digite o valor unitário do produto:");
        Double valorUnitario = sc.nextDouble();
        
        System.out.println("Digite a quantidade:");
        Integer quantidade = sc.nextInt();
        
        DescontoProgressivo desconto = new DescontoProgressivo();
        Double valorFinal = desconto.CalcularDesconto(valorUnitario, quantidade);
        
       desconto.exibirNotaFiscal(valorUnitario, quantidade);
        
        
    }
}
