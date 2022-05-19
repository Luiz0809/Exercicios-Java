package ClasseAbstrata;

public class Teste {

    public static void main(String[] args) {

        Vendedor vendedor1 = new Vendedor(75.00, 2.50, "001.002.003-44", "Luiz");
        Vendedor vendedor2 = new Vendedor(165.00, 6.70, "087.135.182-98", "Bruno");
        Horista horista = new Horista(8, 147.50, "455.147.624-93", "Dener Cardozo");
        Empresa empresa = new Empresa();

        System.out.println("Exibindo informações dos funcionários");
        System.out.println(vendedor1);
        System.out.println(vendedor2);
        System.out.println(horista);
        System.out.println("-".repeat(30));
        
        System.out.println("Exibindo todos os funcionarios");
        empresa.exibeTodos();
        System.out.println("-".repeat(30));
        
        System.out.println("Exibindo total de salários ");
        empresa.exibeTotalSalario();
        System.out.println("-".repeat(30));
        
        System.out.println("Adicionando os funcionários a empresa");
        empresa.adicionarFunc(vendedor1);
        empresa.adicionarFunc(vendedor2);
        empresa.adicionarFunc(horista);
        System.out.println("-".repeat(30));
        
        System.out.println("Exibindo todos os funcionarios novamente");
        empresa.exibeTodos();
        System.out.println("-".repeat(30));
        
        System.out.println("Exibindo total de salários novamente");
        empresa.exibeTotalSalario();
        System.out.println("-".repeat(30));

    }
}
