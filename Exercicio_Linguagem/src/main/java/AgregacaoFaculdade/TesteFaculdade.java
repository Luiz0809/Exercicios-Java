package AgregacaoFaculdade;
public class TesteFaculdade {
    public static void main(String[] args) {
        
        Aluno aluno1 = new Aluno("01212131", "Luiz Felipe", 2, true);
        Aluno aluno2 = new Aluno("01212132","Williams",2,true);
        Aluno aluno3 = new Aluno("01212133","Christian",1,false);
        
        
        Faculdade faculdade = new Faculdade("SPTech");
        
        faculdade.matricularAluno(aluno1);
        faculdade.matricularAluno(aluno2);
        faculdade.matricularAluno(aluno3);
        
        faculdade.exibirAlunos();
        
        faculdade.exibirAlunosPorSemestre(1);
        
        faculdade.cancelarMatricula("01212133");
        
        faculdade.exibirAlunos();
        
        faculdade.exibirCancelados();
    }
}
