package Lista04;
public class Bolo {
    
    String sabor;
    Double valor;
    Integer quantidadeVendida = 0;
    
    void comprarBolo(Integer quantidadeDesejada){

        if (quantidadeDesejada > 100 || quantidadeVendida > 100){
            System.out.println("Seu pedido ultrapassou nosso limite diário para esse bolo.");
        }
        else {
            quantidadeVendida += quantidadeDesejada;
        }
    }
    
    void exibirRelatorio(){
        System.out.println(String.format("O bolo sabor %s, foi comprado %d vezes hoje, totalizando R$%.2f", sabor, quantidadeVendida, (valor*quantidadeVendida)));
    }
}
