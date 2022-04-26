package Lista05;
public class TestePokemon {
    public static void main(String[] args) {
        
        Pokemon pokemon1 = new Pokemon("Charmander", "Fogo", 12.7, 0);
        Pokemon pokemon2 = new Pokemon("Squirtle", "Água", 10.9, 0);
        TreinadorPokemon treinador = new TreinadorPokemon("Luiz Felipe", 1);
        
        for (int i = 0; i < 5; i++){
            treinador.treinarPokemon(pokemon1);
        }
        
        System.out.println(pokemon1);
        
        treinador.evoluirPokemon(pokemon1, "Charmeleon");
        
        System.out.println(pokemon1);
        
        treinador.treinarPokemon(pokemon2);
        treinador.treinarPokemon(pokemon2);
        
        System.out.println(pokemon2);
        
        treinador.evoluirPokemon(pokemon2, "Wartortle");
        
        System.out.println(treinador);
    }
}
