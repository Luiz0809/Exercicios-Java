package ExercicioHeranca;

import java.util.ArrayList;
import java.util.List;

public class Consultoria {

    private String nome;
    private Integer vagas;
    private List<Desenvolvedor> desenvolvedores;

    public Consultoria(String nome, Integer vagas) {
        this.nome = nome;
        this.vagas = vagas;
        this.desenvolvedores = new ArrayList<>();
    }

    public Boolean existePorNome(String nome) {
        if (nome != null) {
            for (Desenvolvedor dev : desenvolvedores) {
                if (dev.getNome().equalsIgnoreCase(nome)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void contratar(Desenvolvedor d) {
        if (d != null) {
            if (vagas > 0) {
                desenvolvedores.add(d);
                vagas --;
            } else {
                System.out.println("Sem vagas disponíveis");
            }
        }
    }

    public Integer getQuantidadeDesenvolvedores() {
        return desenvolvedores.size();
    }

    public Integer getQuantidadeDesenvolvedoresMobile() {
        Integer devsMobile = 0;
        for (Desenvolvedor dev : desenvolvedores) {
            if (dev instanceof DesenvolvedorMobile) {
                devsMobile++;
            }
        }
        return devsMobile;
    }

    public Double getTotalSalarios() {
        Double totalSalario = 0.0;

        for (Desenvolvedor dev : desenvolvedores) {
            totalSalario += dev.getSalario();
        }

        return totalSalario;
    }

    public Desenvolvedor buscarDesenvolvedorPOrNome(String nome) {
        if (nome != null) {
            if (existePorNome(nome)) {
                for (Desenvolvedor dev : desenvolvedores) {
                    if (dev.getNome().equalsIgnoreCase(nome)) {
                        return dev;
                    }
                }
            } else {
                return null;
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
        return String.format("Nome Consultoria : %s \n"
                + "Vagas : %d", nome, vagas);
    }

}
