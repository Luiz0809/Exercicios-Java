package ExercicioHeranca;

public class Ator {

    protected String nome;
    protected Integer qtdHorasTrabalhadas;
    protected Double valorHoraTrabalhada;

    public Ator(String nome, Integer qtdHorasTrabalhadas, Double valorHoraTrabalhada) {
        this.nome = nome;
        this.qtdHorasTrabalhadas = qtdHorasTrabalhadas;
        this.valorHoraTrabalhada = valorHoraTrabalhada;
    }

    public Double getSalario(){
        return qtdHorasTrabalhadas*valorHoraTrabalhada;
    }
    
    public String getNome() {
        return nome;
    }

    public Integer getQtdHorasTrabalhadas() {
        return qtdHorasTrabalhadas;
    }

    public Double getValorHoraTrabalhada() {
        return valorHoraTrabalhada;
    }

    @Override
    public String toString() {
        return String.format("Nome do Ator : %s \n"
                + "Quantidade Horas Trabalhadas : %d \n"
                + "Valor Hora Trabalhada : %.2f \n"
                + "Salário : %.2f",
                nome,
                qtdHorasTrabalhadas,
                valorHoraTrabalhada,
                getSalario());
    }

    
}
