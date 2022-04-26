package Lista04;
public class Empregado {
       
    String nome;
    String cargo;
    Double salario;
    
    void reajustarSalario(Double reajuste){
        salario += salario*(reajuste/100);
    }
 
}
