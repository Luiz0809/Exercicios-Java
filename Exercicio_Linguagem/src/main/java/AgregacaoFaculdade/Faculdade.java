package AgregacaoFaculdade;

import java.util.ArrayList;
import java.util.List;

public class Faculdade {
    private String nome;
    private List<Aluno> alunos = new ArrayList<Aluno>();

    public Faculdade(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }
    
    
    public void matricularAluno(Aluno aluno){
        alunos.add(aluno);
    }
    
    public void cancelarMatricula(String ra){
        for(Aluno aluno : alunos){
            if(aluno.getRa().equals(ra)){
                aluno.setAtivo(false);
            }
        }
    }
    
    public void exibirAlunos(){
        alunos.forEach(aluno -> System.out.println(aluno));
    }
    
    public void exibirAlunosPorSemestre(Integer semestre){
        for(Aluno aluno : alunos){
            if(aluno.getSemestre().equals(semestre)){
                System.out.println(aluno);
            }
        }
    }
    
    public void exibirCancelados(){
         for(Aluno aluno : alunos){
             if(aluno.getAtivo().equals(false)){
                 System.out.println(aluno);
             }
         }
    }
}
