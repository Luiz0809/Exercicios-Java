package ExercicioHeranca;

public class DesenvolvedorMobile extends Desenvolvedor {

    private Integer qtdeHorasTrabalhadasMobile;
    private Double valorHorasTrabalhadasMobile;

    public DesenvolvedorMobile(String nome,Integer qtdeHorasTrabalhadasMobile, Double valorHorasTrabalhadasMobile) {
        super(nome, qtdeHorasTrabalhadasMobile, valorHorasTrabalhadasMobile);
        this.qtdeHorasTrabalhadasMobile = qtdeHorasTrabalhadasMobile;
        this.valorHorasTrabalhadasMobile = valorHorasTrabalhadasMobile;
    }

    @Override
    public Double getSalario() {
        return (qtdHorasTrabalhadas * valorHoraTrabalhada)
                + (qtdeHorasTrabalhadasMobile * valorHorasTrabalhadasMobile);
    }

    public Integer getQtdeHorasTrabalhadasMobile() {
        return qtdeHorasTrabalhadasMobile;
    }

    public void setQtdeHorasTrabalhadasMobile(Integer qtdeHorasTrabalhadasMobile) {
        this.qtdeHorasTrabalhadasMobile = qtdeHorasTrabalhadasMobile;
    }

    public Double getValorHorasTrabalhadasMobile() {
        return valorHorasTrabalhadasMobile;
    }

    public void setValorHorasTrabalhadasMobile(Double valorHorasTrabalhadasMobile) {
        this.valorHorasTrabalhadasMobile = valorHorasTrabalhadasMobile;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQtdHorasTrabalhadas() {
        return qtdHorasTrabalhadas;
    }

    public void setQtdHorasTrabalhadas(Integer qtdHorasTrabalhadas) {
        this.qtdHorasTrabalhadas = qtdHorasTrabalhadas;
    }

    public Double getValorHoraTrabalhada() {
        return valorHoraTrabalhada;
    }

    public void setValorHoraTrabalhada(Double valorHoraTrabalhada) {
        this.valorHoraTrabalhada = valorHoraTrabalhada;
    }

    @Override
    public String toString() {
        return String.format("Nome : %s \n"
                + "Quantidade de Horas Trabalhadas Mobile : %d \n"
                + "Valor hora trabalhadas Mobile : R$%.2f \n"
                + "Salário : %.2f",
                nome,
                qtdeHorasTrabalhadasMobile,
                valorHorasTrabalhadasMobile,
                getSalario());}   
}
