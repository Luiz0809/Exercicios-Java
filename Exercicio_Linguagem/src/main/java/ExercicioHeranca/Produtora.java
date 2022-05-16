package ExercicioHeranca;

import java.util.ArrayList;
import java.util.List;

public class Produtora {

    private String nome;
    private Integer vagas;
    private List<Ator> atores;

    public Produtora(String nome, Integer vagas) {
        this.nome = nome;
        this.vagas = vagas;
        this.atores = new ArrayList<>();
    }

    public Boolean existePorNome(String nome) {
        if (nome != null) {
            for (Ator ator : atores) {
                if (ator.getNome().equalsIgnoreCase(nome)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void contratar(Ator a) {
        if (a != null) {
            if (vagas > 0) {
                atores.add(a);
                vagas--;
            } else {
                System.out.println("Sem vagas disponíveis");
            }
        }
    }

    public Integer getQuantidadeAtores() {
        return atores.size();
    }

    public Integer getQuantidadeProtagonistas() {
        Integer protagonistas = 0;
        for (Ator ator : atores) {
            if (ator instanceof Protagonista) {
                protagonistas++;
            }
        }
        return protagonistas;
    }

    public Double getTotalSalarios() {
        Double totalSalario = 0.0;

        for (Ator ator : atores) {
            totalSalario += ator.getSalario();
        }

        return totalSalario;
    }

    public Ator buscarAtorPorNome(String nome) {
        if (nome != null) {
            for (Ator ator : atores) {
                if(ator.getNome().equalsIgnoreCase(nome)){
                    return ator;
                }
            }
        }
        return null;
    }  

    public String getNome() {
        return nome;
    }

    public Integer getVagas() {
        return vagas;
    }

    @Override
    public String toString() {
        return String.format("Nome Produtora : %s \n"
                + "Vagas : %d", nome, vagas);
    }
}
