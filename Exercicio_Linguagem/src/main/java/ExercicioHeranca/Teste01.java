package ExercicioHeranca;
public class Teste01 {
    public static void main(String[] args) {
        
        Consultoria consultoria = new Consultoria("SPTech Consultoria", 12);
        Desenvolvedor dev1 = new Desenvolvedor("Luiz Felipe",8,150.00);
        Desenvolvedor dev2 = new Desenvolvedor("Bruno Tavares",16,270.00);
        Desenvolvedor dev3 = new Desenvolvedor("Dener Cardozo",12,120.00);
        DesenvolvedorMobile dev4 = new DesenvolvedorMobile("Vinicius",6,250.00);
        DesenvolvedorMobile dev5 = new DesenvolvedorMobile("Luiz Felipe",5,320.00);
        
        System.out.println(consultoria);
        System.out.println(dev1);
        System.out.println(dev4);
        
        consultoria.contratar(dev1);
        consultoria.contratar(dev2);
        consultoria.contratar(dev3);
        consultoria.contratar(dev4);
        consultoria.contratar(null);
        
        System.out.println(consultoria);
        
        System.out.println(consultoria.existePorNome("luiz FeLipe"));
        System.out.println(consultoria.existePorNome("Diego Brito"));
        
        System.out.println(consultoria.getQuantidadeDesenvolvedores());
        System.out.println(consultoria.getQuantidadeDesenvolvedoresMobile());
        
        consultoria.contratar(dev5);
        
        System.out.println(consultoria.getQuantidadeDesenvolvedores());
        System.out.println(consultoria.getQuantidadeDesenvolvedoresMobile());
        
        System.out.println(consultoria.getTotalSalarios());
        
        System.out.println(consultoria.buscarDesenvolvedorPOrNome("Luiz felipe"));
        
    }
}
