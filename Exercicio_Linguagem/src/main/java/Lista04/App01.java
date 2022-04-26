package Lista04;

public class App01 {
    public static void main(String[] args) {

    Bolo1 bolo1 = new Bolo1();
    Bolo1 bolo2 = new Bolo1();
    Bolo1 bolo3 = new Bolo1();

    bolo1.sabor = "Morango";
    bolo1.valor = 40.00;

    bolo2.sabor = "Chocolate";
    bolo2.valor = 30.00;

    bolo3.sabor = "Maracujá";
    bolo3.valor = 50.00;

    bolo1.comprarBolo(22);
    bolo2.comprarBolo(10);
    bolo3.comprarBolo(15);

    bolo1.comprarBolo(2);
    bolo1.comprarBolo(22);

    bolo2.comprarBolo(0);
    bolo2.comprarBolo(10);
    bolo2.comprarBolo(101);
    bolo2.comprarBolo(10);

    bolo3.comprarBolo(15);
    bolo3.comprarBolo(20);
    bolo3.comprarBolo(150);

    bolo1.exibirRelatorio();
    bolo2.exibirRelatorio();
    bolo3.exibirRelatorio();
}
}
