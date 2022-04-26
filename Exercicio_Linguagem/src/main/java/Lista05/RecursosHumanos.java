package Lista05;

public class RecursosHumanos {

    private Integer promovidos = 0;
    private Integer salariosReajustados = 0;

    public void reajustarSalario(Colaborador colaborador, Double reajuste) {
        colaborador.setSalario(reajuste);
        salariosReajustados++;
    }

    public void promoverColaborador(Colaborador colaborador, String novoCargo, Double novoSalario) {
        if (colaborador.getSalario() < novoSalario) {
            colaborador.setCargo(novoCargo);
            colaborador.setSalario(novoSalario);
            promovidos++;
        } else {
            System.out.println("Operação inválida");
        }
    }

    public Integer getPromovidos() {
        return promovidos;
    }

    public Integer getSalariosReajustados() {
        return salariosReajustados;
    }
    
    
}
