package Lista06;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaDeInteiros {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer numeroLido = 1;
        List<Integer> numerosInteiros = new ArrayList();
        Integer somaDosNumerosDaLista = 0;
        Integer menorNumeroDaLista = numeroLido;
        Integer maiorNumeroDaLista = numeroLido;

        while (numeroLido != 0) {

            System.out.println("Digite um número inteiro para adicioná-lo a lista");
            numeroLido = sc.nextInt();
            if (numeroLido != 0) {
                menorNumeroDaLista = numeroLido;
                maiorNumeroDaLista = numeroLido;
                numerosInteiros.add(numeroLido);
            }
        }
        System.out.println("-".repeat(30));

        System.out.println("Números Pares da lista");
        for (Integer numero : numerosInteiros) {
            if (numero % 2 == 0) {
                System.out.println(numero);
            }
        }

        System.out.println("-".repeat(30));

        System.out.println("Números Impares da lista");
        for (Integer numero : numerosInteiros) {
            if (numero % 2 == 1) {
                System.out.println(numero);
            }
        }
        System.out.println("-".repeat(30));
        System.out.println("Soma dos números da lista");
        for (Integer numero : numerosInteiros) {
            somaDosNumerosDaLista += numero;
        }
        System.out.println(somaDosNumerosDaLista);
        System.out.println("-".repeat(30));
        System.out.println("Menor numero da lista");
        for (Integer numero : numerosInteiros) {
            if (menorNumeroDaLista >= numero) {
                menorNumeroDaLista = numero;
            }
        }
        System.out.println(menorNumeroDaLista);
        System.out.println("-".repeat(30));
        System.out.println("Maior numero da lista");
        for (Integer numero : numerosInteiros) {
            if (maiorNumeroDaLista <= numero) {
                maiorNumeroDaLista = numero;
            }
        }
        System.out.println(maiorNumeroDaLista);
    }
}
