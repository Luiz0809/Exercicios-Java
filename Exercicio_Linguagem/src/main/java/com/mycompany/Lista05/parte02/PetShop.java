package Lista05.parte02;
public class PetShop {
    private String nome;
    private Double faturamento;

    public PetShop(String nome) {
        this.nome = nome;
        this.faturamento = 0.0;
    }

    public String getNome() {
        return nome;
    }

    public Double getFaturamento() {
        return faturamento;
    }

    public void darBanho(Pet pet, Double valor){
        pet.setQtdVisitas(pet.getQtdVisitas()+1);
        pet.setValorGasto(pet.getValorGasto()+valor);
        faturamento += valor;
    }
    
    public void darBanho(Pet pet, Double valor, Integer desconto){
        pet.setQtdVisitas(pet.getQtdVisitas()+1);
        pet.setValorGasto((pet.getValorGasto()+valor) - valor*(desconto/100));
        faturamento += valor;
    }

    @Override
    public String toString() {
        return String.format("Pet Shop : \n"
                + "Nome do estabelecimento : %s\n"
                + "Faturamento total : R$%.2f", nome, faturamento);
    }
    
    
}
