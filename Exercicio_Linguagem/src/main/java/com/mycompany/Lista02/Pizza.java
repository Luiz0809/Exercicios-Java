
package Lista02;

import java.util.Scanner;

public class Pizza {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        Integer calabresa = 0;
        Integer mussarela = 0;
        Integer quatroQueijos = 0;
        
        for (int i = 0; i < 10; i++){
            System.out.println("Vote no seu sabor de pizza favorito");
            Integer voto = sc.nextInt();
            
            switch(voto){
                case 5:
                    mussarela++;
                    break;
                case 25:
                    calabresa++;
                    break;
                case 50:
                    quatroQueijos++;
                    break;
                        }
       }
        
        System.out.println(String.format("Votos da mussarela : %d", mussarela));
        System.out.println(String.format("Votos da calabresa : %d", calabresa));
        System.out.println(String.format("Votos da Quatro Queijos : %d", quatroQueijos));
        
        if (calabresa > mussarela && calabresa > quatroQueijos){
            System.out.println("Calabresa é o sabor favorito");}
        else if (mussarela > calabresa && mussarela > quatroQueijos){
            System.out.println("Mussarela é o sabor favorito");}
        else if (quatroQueijos > mussarela && quatroQueijos > calabresa){
            System.out.println("Quatro Queijos é o sabor favorito");}
        else {System.out.println("Não tem sabor favorito");}
    }
}
