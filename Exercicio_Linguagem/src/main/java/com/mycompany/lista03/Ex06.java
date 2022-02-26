package lista03;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Integer numero = 0;
        while (numero >= 0){
            System.out.println("Digite um número e veja se ele é primo: ");
            numero = sc.nextInt();
            VerificarPrimo verificar = new VerificarPrimo();
            Boolean ehprimo = verificar.isPrimo(numero);
            String resposta = ehprimo ? "É Primo" : "Não é Primo";
            System.out.println(resposta);
        }
    }
}
