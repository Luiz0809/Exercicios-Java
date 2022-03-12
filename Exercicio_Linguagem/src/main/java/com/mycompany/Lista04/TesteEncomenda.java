package Lista04;
public class TesteEncomenda {
    public static void main(String[] args) {
        Encomenda encomenda = new Encomenda();
        
        encomenda.distancia = 72.0;
        encomenda.enderecoDestinatario = "Rua Ponche Verde, 522";
        encomenda.enderecoRemetente = "Rua Sonhos Dourados, 86";
        encomenda.tamanho = "G";
        encomenda.valorEncomenda = 25.00;
        
        encomenda.calcularFrete();
        encomenda.emitirEtiqueta();
    }
}
