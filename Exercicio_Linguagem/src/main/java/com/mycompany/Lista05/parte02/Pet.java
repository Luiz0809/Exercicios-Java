
package Lista05.parte02;
public class Pet {
    private String nome;
    private String raca;
    private Integer qtdVisitas;
    private Double valorGasto;

    public Pet(String nome, String raca) {
        this.nome = nome;
        this.raca = raca;
        this.qtdVisitas = 0;
        this.valorGasto = 0.0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public Integer getQtdVisitas() {
        return qtdVisitas;
    }

    public void setQtdVisitas(Integer qtdVisitas) {
        this.qtdVisitas = qtdVisitas;
    }

    public Double getValorGasto() {
        return valorGasto;
    }

    public void setValorGasto(Double valorGasto) {
        this.valorGasto = valorGasto;
    }

    @Override
    public String toString() {
        return String.format("Pet : \n"
                + "Nome do Pet : %s\n"
                + "Raça : %s\n"
                + "Quantidade de visitas : %d\n"
                + "Valor Gasto : R$%.2f", nome, raca, qtdVisitas, valorGasto);
    }
    
    
}
