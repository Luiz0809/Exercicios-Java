package ClasseAbstrata;
public class Vendedor extends Funcionario{
    
    private Double vendas;
    private Double taxas;

    public Vendedor(Double vendas, Double taxas, String cpf, String nome) {
        super(cpf, nome);
        this.vendas = vendas;
        this.taxas = taxas;
    }

    @Override
    public Double calcSalario() {
        return vendas+taxas;
    }

    public Double getVendas() {
        return vendas;
    }

    public void setVendas(Double vendas) {
        this.vendas = vendas;
    }

    public Double getTaxas() {
        return taxas;
    }

    public void setTaxas(Double taxas) {
        this.taxas = taxas;
    }

    @Override
    public String toString() {
        return String.format("%s \n"
                + "Vendas: %.2f\n"
                + "Taxas: %.2f\n"
                + "Salário Final: %.2f\n", super.toString(), vendas, taxas,calcSalario());
    }
    
    
    
}
