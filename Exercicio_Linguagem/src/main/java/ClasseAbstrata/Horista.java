package ClasseAbstrata;
public class Horista extends Funcionario{
    
    private Integer qtdHoras;
    private Double valorHora;

    public Horista(Integer qtdHoras, Double valorHora, String cpf, String nome) {
        super(cpf, nome);
        this.qtdHoras = qtdHoras;
        this.valorHora = valorHora;
    }

    @Override
    public Double calcSalario() {
        return qtdHoras*valorHora;
    }
    
    public Integer getQtdHoras() {
        return qtdHoras;
    }

    public void setQtdHoras(Integer qtdHoras) {
        this.qtdHoras = qtdHoras;
    }

    public Double getValorHora() {
        return valorHora;
    }

    public void setValorHora(Double valorHora) {
        this.valorHora = valorHora;
    }

    @Override
    public String toString() {
        return String.format("%s \n"
                + "Quantidade de Horas Trabalhadas: %d\n"
                + "Valor por hora Trabalhada: %.2f\n"
                + "Salário Final: %.2f\n", super.toString(), qtdHoras, valorHora,calcSalario());
    }  
}
