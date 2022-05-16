package ExercicioHeranca;

public class Protagonista extends Ator {

    private Integer qtdeHorasTrabalhadasProtagonista;
    private Double valorHorasTrabalhasProtagonista;

    public Protagonista(Integer qtdeHorasTrabalhadasProtagonista, Double valorHorasTrabalhasProtagonista, String nome, Integer qtdHorasTrabalhadas, Double valorHoraTrabalhada) {
        super(nome, qtdHorasTrabalhadas, valorHoraTrabalhada);
        this.qtdeHorasTrabalhadasProtagonista = qtdeHorasTrabalhadasProtagonista;
        this.valorHorasTrabalhasProtagonista = valorHorasTrabalhasProtagonista;
    }

    @Override
    public Double getSalario() {
        return (qtdHorasTrabalhadas * valorHoraTrabalhada)
                + (qtdeHorasTrabalhadasProtagonista * valorHorasTrabalhasProtagonista);
    }

    public Integer getQtdeHorasTrabalhadasProtagonista() {
        return qtdeHorasTrabalhadasProtagonista;
    }

    public void setQtdeHorasTrabalhadasProtagonista(Integer qtdeHorasTrabalhadasProtagonista) {
        this.qtdeHorasTrabalhadasProtagonista = qtdeHorasTrabalhadasProtagonista;
    }

    public Double getValorHorasTrabalhasProtagonista() {
        return valorHorasTrabalhasProtagonista;
    }

    public void setValorHorasTrabalhasProtagonista(Double valorHorasTrabalhasProtagonista) {
        this.valorHorasTrabalhasProtagonista = valorHorasTrabalhasProtagonista;
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
        return String.format("Nome do Ator : %s \n"
                + "Horas Trabalhadas como Protagonista : %d \n"
                + "Valor Hora Trabalhado como Protagonista : %.2f",
                nome,
                qtdeHorasTrabalhadasProtagonista,
                valorHorasTrabalhasProtagonista);
    }

}
