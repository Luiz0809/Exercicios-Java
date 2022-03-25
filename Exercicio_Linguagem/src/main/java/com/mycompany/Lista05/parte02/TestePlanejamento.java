package Lista05.parte02;

public class TestePlanejamento {

    public static void main(String[] args) {

        Planejamento planejamento = new Planejamento("Atualizar Site", "Luiz Felipe", 12);

        planejamento.terminarAtividade(15);
        System.out.println(planejamento.calcularTempo());

        planejamento.terminarAtividade(7);
        System.out.println(planejamento.calcularTempo());

        planejamento.terminarAtividade(12);
        System.out.println(planejamento.calcularTempo());

        System.out.println(planejamento);
    }
}
