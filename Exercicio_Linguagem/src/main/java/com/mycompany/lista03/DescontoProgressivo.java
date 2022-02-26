package lista03;
public class DescontoProgressivo {
  
    Double CalcularDesconto(Double valorUnitario, Integer quantidade){
        if (quantidade <= 3){
        return (valorUnitario*quantidade)-(valorUnitario*quantidade/10);
        }
        else {
        return (valorUnitario*quantidade)-(valorUnitario*0.3);}
    }
    
    void exibirNotaFiscal(Double valorUnitario, Integer quantidade){

        System.out.println("---".repeat(20));
        System.out.println(String.format("Valor do Produto: R$%.2f", valorUnitario));
        System.out.println(String.format("Quantidade: %d", quantidade));
        System.out.println("---".repeat(20));
        
        Double valorFinal = CalcularDesconto(valorUnitario, quantidade);
        System.out.println(String.format("Valor com desconto: R$%.2f", valorFinal));}
}
