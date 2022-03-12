package Lista04;
public class Encomenda {
    
    String tamanho;
    String enderecoRemetente;
    String enderecoDestinatario;
    Double distancia;
    Double valorEncomenda;
    Double valorFrete;
    Double valorFinal = 0.0;
        
    Double calcularFrete(){
        
        
        if(tamanho.equals("P")){
           valorFinal = valorEncomenda + valorEncomenda * 0.01;
        }
        else if(tamanho.equals("M")){
            valorFinal = valorEncomenda + valorEncomenda * 0.03;
        }
        else if(tamanho.equals("G")){
            valorFinal = valorEncomenda + valorEncomenda * 0.05;
        }
        
        if(distancia <= 50){
            valorFrete = 3.00;
        }
        else if(distancia >= 51 && distancia <= 200){
            valorFrete = 5.00;
        }
        else if(distancia >= 201){
            valorFrete = 7.00;
        }
        
        return valorFinal = valorFinal + valorFrete;
    }
    
    void emitirEtiqueta(){
        System.out.println("***** ETIQUETA PARA ENVIO *****");
        System.out.println(String.format("Endereço do Remetente : %s", enderecoRemetente));
        System.out.println(String.format("Endereço do Destinatário : %s", enderecoDestinatario));
        System.out.println(String.format("Tamanho : %s", tamanho));
        System.out.println("-".repeat(20));
        System.out.println(String.format("Valor encomenda : R$%.2f", valorEncomenda));
        System.out.println(String.format("Valor Frete : R$%.2f", valorFrete));
        System.out.println("-".repeat(20));
        System.out.println(String.format("Valor Final : R$%.2f", valorFinal));
    }
}
