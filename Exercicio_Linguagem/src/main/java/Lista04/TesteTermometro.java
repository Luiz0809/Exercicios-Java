package Lista04;
public class TesteTermometro {
    public static void main(String[] args) {
        
        Termometro termometro = new Termometro();
        
        termometro.temperaturaAtual = 25.00;
        termometro.temperaturaMax = 45.00;
        termometro.temperaturaMin = 15.00;
        System.out.println(String.format("Temperatura Atual : %.1f", termometro.temperaturaAtual));
        
        termometro.aumentaTemperatura(42.00);
        System.out.println(String.format("Temperatura Atual : %.1f", termometro.temperaturaAtual));
        
        termometro.aumentaTemperatura(47.00);
        System.out.println(String.format("Temperatura Atual : %.1f", termometro.temperaturaAtual));
        
        termometro.diminuiTemperatura(19.00);
        System.out.println(String.format("Temperatura Atual : %.1f", termometro.temperaturaAtual));
        
        termometro.diminuiTemperatura(12.00);
        System.out.println(String.format("Temperatura Atual : %.1f", termometro.temperaturaAtual));
        
        termometro.exibeFahreinheit();
    }
 
}
