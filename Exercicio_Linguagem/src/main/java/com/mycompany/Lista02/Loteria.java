package Lista02;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Loteria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer numeroEscolhido = 0, numeroSorteado = 1, contador = 0;
        
        while (numeroEscolhido != numeroSorteado){
            contador++;
            System.out.println("Digite um número de 0 a 10");
            numeroEscolhido = sc.nextInt();
            
            numeroSorteado = ThreadLocalRandom.current().nextInt(0,11);                 
        }
        
        if (contador >= 0 && contador <= 3){
            System.out.println("Você é MUITO sortudo");
        }
        else if (contador >= 4 && contador <= 10){
            System.out.println("Você é sortudo");
        }
        else {
            System.out.println("É melhor você parar de apostar e ir trabalhar");}
        
        
    }
}
