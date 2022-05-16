package ExercicioHeranca;

public class Teste02 {

    public static void main(String[] args) {

        Produtora produtora = new Produtora("SPTech Produtora", 4);
        Ator a1 = new Ator("Luiz Felipe", 12, 900.00);
        Ator a2 = new Ator("Beatriz Frederico", 6, 1200.00);
        Ator a3 = new Ator("Kamila Matos", 21, 750.00);
        Ator a4 = new Ator("Williams Miguel", 34, 687.00);
        Protagonista p1 = new Protagonista(4, 2500.00, "Erick Lemos", 10, 1400.00);
        
        System.out.println(produtora);
        System.out.println(a1);
        System.out.println(p1);

        produtora.contratar(a1);
        produtora.contratar(a2);
        produtora.contratar(a3);
        produtora.contratar(a4);
        produtora.contratar(p1);
        produtora.contratar(null);

        System.out.println(produtora);

        System.out.println(produtora.existePorNome("luiz FeLipe"));
        System.out.println(produtora.existePorNome("Giuliana"));

        System.out.println(produtora.getQuantidadeAtores());
        System.out.println(produtora.getQuantidadeProtagonistas());

        System.out.println(produtora.getTotalSalarios());

        System.out.println(produtora.buscarAtorPorNome("Luiz felipe"));
        System.out.println(produtora.buscarAtorPorNome("Manoel"));
    }
}
