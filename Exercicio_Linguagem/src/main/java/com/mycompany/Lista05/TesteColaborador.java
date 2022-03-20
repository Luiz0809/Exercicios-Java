package Lista05;
public class TesteColaborador {
    public static void main(String[] args) {
        
        Colaborador colaborador1 = new Colaborador("Luiz Felipe","Estagiário",2300.00);
        Colaborador colaborador2 = new Colaborador("Monica Nunes Barbosa", "Faxineira", 2500.00);
        RecursosHumanos rh = new RecursosHumanos();
        
        System.out.println(colaborador1);
        System.out.println(colaborador2);
        
        rh.promoverColaborador(colaborador1, "Analista de Sistemas JR", 4000.00);
        rh.promoverColaborador(colaborador2, "Faxineira", 2000.00);
        
        rh.reajustarSalario(colaborador2, 2800.00);
        
        System.out.println(colaborador1);
        System.out.println(colaborador2);
        
        System.out.println(rh.getPromovidos());
        System.out.println(rh.getSalariosReajustados());
        
    }
}
