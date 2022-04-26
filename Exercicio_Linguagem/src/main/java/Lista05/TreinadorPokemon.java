package Lista05;
public class TreinadorPokemon {
    
    private String nome;
    private Integer nivel;

    public TreinadorPokemon(String nome, Integer nivel) {
        this.nome = nome;
        this.nivel = nivel;
    }
    
    public void treinarPokemon(Pokemon pokemon){
        pokemon.setForca(pokemon.getForca() + pokemon.getForca()*0.10);
        pokemon.setDoces(pokemon.getDoces()+10);
        nivel += 2;
    }
    
    public void evoluirPokemon(Pokemon pokemon, String nomeEvolucao){
        if(pokemon.getDoces() >= 50){
            System.out.println(String.format("Pokémon %s evoluiu para -> %s", pokemon.getNome(), nomeEvolucao));
            pokemon.setNome(nomeEvolucao);
            pokemon.setDoces(pokemon.getDoces()-50);
            nivel += 10;   
        }
        else {
            System.out.println("Não foi possível realizar operação");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNivel() {
        return nivel;
    }

    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }

    @Override
    public String toString() {
        return "TreinadorPokemon\n" + "nome = " + nome + "\nnivel = " + nivel;
    }
    
    
}
