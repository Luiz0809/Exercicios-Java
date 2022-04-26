
package Lista04;
public class App {
    public static void main(String[] args) {
        
        Bolo bolo1 = new Bolo();
        Bolo bolo2 = new Bolo();
        Bolo bolo3 = new Bolo();
        
        bolo1.sabor = "Chocolate";
        bolo1.valor = 48.50;
        
        bolo2.sabor = "Morango";
        bolo2.valor = 32.75;
        
        bolo3.sabor = "Abacaxi";
        bolo3.valor = 29.00;
        
        bolo1.comprarBolo(8);
        bolo1.comprarBolo(41);
        bolo1.comprarBolo(28);
        bolo1.comprarBolo(6);
        bolo2.comprarBolo(12);
        bolo2.comprarBolo(41);
        bolo1.comprarBolo(3);
        bolo3.comprarBolo(9);
        bolo2.comprarBolo(1);
        bolo3.comprarBolo(11);
        
        bolo1.exibirRelatorio();
        bolo2.exibirRelatorio();
        bolo3.exibirRelatorio();
        
        
    }
 
}
