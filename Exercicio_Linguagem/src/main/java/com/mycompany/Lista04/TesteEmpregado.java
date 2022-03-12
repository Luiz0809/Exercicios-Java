package Lista04;
public class TesteEmpregado {
    
    public static void main(String[] args) {
        Empregado empregado1 = new Empregado();
        
        empregado1.nome = "João";
        empregado1.salario = 5400.00;
        empregado1.cargo = "Anaista de Sistemas";
        empregado1.reajustarSalario(15.00);
        System.out.println(String.format("Nome: %s \nCargo: %s \nSalario: %.2f",
                empregado1.nome, empregado1.cargo, empregado1.salario));
        System.out.println("");
        
        Empregado empregado2 = new Empregado();
        
        empregado2.nome = "Luiz Felipe";
        empregado2.salario = 8900.00;
        empregado2.cargo = "Desenvolvedor Full-Stack";
        empregado2.reajustarSalario(22.00);
        System.out.println(String.format("Nome: %s \nCargo: %s \nSalario: %.2f",
                empregado2.nome, empregado2.cargo, empregado2.salario));
    }
    
    
    
}
