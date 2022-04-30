package AgregacaoFaculdade;
public class Aluno {
    private String ra;
    private String nome;
    private Integer semestre;
    private Boolean ativo;

    public Aluno(String ra, String nome, Integer Semestre, Boolean ativo) {
        this.ra = ra;
        this.nome = nome;
        this.semestre = Semestre;
        this.ativo = ativo;
    }

    public String getRa() {
        return ra;
    }

    public String getNome() {
        return nome;
    }

    public Integer getSemestre() {
        return semestre;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setSemestre(Integer Semestre) {
        this.semestre = Semestre;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    @Override
    public String toString() {
        return String.format("Nome do Aluno : %s\n"
                + "RA : %s\n"
                + "Semestre : %d° Semestre\n"
                + "Ativo : %b", nome, ra, semestre, ativo);
    }

    
        
}
