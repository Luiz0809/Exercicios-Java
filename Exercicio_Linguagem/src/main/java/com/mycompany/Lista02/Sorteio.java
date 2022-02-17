
package Lista02;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Sorteio {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Digite um número de 1 a 100");
        Integer numeroEscolhido = sc.nextInt();
        
        Integer contador = 0;
        Integer quantidadePar = 0;
        Integer quantidadeImpar = 0;
        Integer primeiraAparicao = 0;
        for (int i = 0; i < 200; i++){
            Integer numeroSorteado = ThreadLocalRandom.current().nextInt(1,101);
            contador++;
            if (numeroSorteado % 2 == 0){
            quantidadePar++;
            }
            else if (numeroSorteado % 2 == 1){
            quantidadeImpar++;}
            if (numeroSorteado == numeroEscolhido && primeiraAparicao == 0){
                primeiraAparicao = i;
            }
        }
        System.out.println(String.format("Quando o número foi sorteado pela primeira vez ?: %d", primeiraAparicao));
        System.out.println(String.format("Quantos números pares foram sorteados ?: %d", quantidadePar));
        System.out.println(String.format("Quantos números impares foram sorteados ?: %d", quantidadeImpar));
    }
 
}
