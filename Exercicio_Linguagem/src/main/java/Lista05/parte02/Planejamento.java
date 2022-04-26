package Lista05.parte02;

public class Planejamento {

    private String atividade;
    private String responsavel;
    private Integer diasEstimados;
    private Integer diasUsados;

    public Planejamento(String atividade, String responsavel, Integer diasEstimados) {
        this.atividade = atividade;
        this.responsavel = responsavel;
        this.diasEstimados = diasEstimados;
        this.diasUsados = 0;
    }

    public String getAtividade() {
        return atividade;
    }

    public void setAtividade(String atividade) {
        this.atividade = atividade;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public Integer getDiasEstimados() {
        return diasEstimados;
    }

    public void setDiasEstimados(Integer diasEstimados) {
        this.diasEstimados = diasEstimados;
    }

    public Integer getDiasUsados() {
        return diasUsados;
    }

    public void terminarAtividade(Integer diasUsados) {
        this.diasUsados = diasUsados;
    }

    public String calcularTempo() {
        if (diasEstimados > diasUsados) {
            return String.format("Você estimou %d dias, e a tarefa foi feita em %d"
                    + " dias (%d dias a menos que o estimado).Parabéns!",
                    diasEstimados, diasUsados, diasEstimados - diasUsados);
        } else if (diasEstimados.equals(diasUsados)) {
            return String.format("Você estimou %d dias, e a tarefa foi feita em %d"
                    + " dias, atendendo a estimativa com precisão",
                    diasEstimados, diasUsados);
        } else {
            return String.format("Você estimou %d dias, mas a tarefa"
                    + " foi feita em %d dias (%d dias a mais que o estimado). Melhore a estimativa",
                    diasEstimados, diasUsados, diasUsados - diasEstimados);
        }
    }

    @Override
    public String toString() {
        return String.format("Planejamento : \n"
                + "Ativiade : %s\n"
                + "Responsável : %s\n"
                + "Dias Estimados : %d\n"
                + "Dias Usados : %d", atividade, responsavel, diasEstimados, diasUsados);
    }

}
