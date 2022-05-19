package ClasseAbstrata;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    
   private List<Funcionario> funcionarios = new ArrayList<>();

    public Empresa() {}
   
   public void adicionarFunc(Funcionario f){
       if(f != null){
           funcionarios.add(f);
       }
   }
   
   public void exibeTodos(){
       if(funcionarios.isEmpty()){
           System.out.println("Não existem funcionários na empresa");
       }
       else {
           System.out.println(funcionarios);
       }
   }
   
   public void exibeTotalSalario(){
       Double totalSalario = 0.0;
      if(funcionarios.isEmpty()){
           System.out.println("Não existem funcionários na empresa");
       }
      else {
          for(Funcionario func : funcionarios){
              totalSalario += func.calcSalario();
          }
          System.out.println(String.format("Salário Total: %.2f", totalSalario));
      }
   }
}
