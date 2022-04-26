package Lista04;

public class Bolo1 {

    String sabor;
    Double valor;
    Integer quantVendida = 0; 

    void comprarBolo(Integer quantdesejada){
     if(quantdesejada < 1){
         System.out.println("Informe um numero maior que 0");
     }
        if(quantdesejada > 100 || quantVendida > 100){
         System.out.println("Seu pedido ultrapassou nosso limite diário para "
                 + "esse bolo");
     }else{
         quantVendida += quantdesejada;
     };
    }

    void exibirRelatorio(){
        System.out.println(String.format("O bolo sabor %s, foi comprado %d vezes"
            + "\n hoje, totalizando R$%.2f", sabor, quantVendida, valor * quantVendida));
    }
}