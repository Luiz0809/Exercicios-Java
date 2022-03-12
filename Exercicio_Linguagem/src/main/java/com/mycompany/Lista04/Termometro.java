package Lista04;
public class Termometro {
    
    Double temperaturaAtual, temperaturaMax, temperaturaMin;
    
    void aumentaTemperatura(Double temperaturaAumentar){
        if(temperaturaAumentar > temperaturaMax){
            temperaturaAtual = temperaturaMax;
        }
        else {
            temperaturaAtual = temperaturaAumentar;
        }
    }
    
    void diminuiTemperatura(Double temperaturaDiminuir){
        if(temperaturaDiminuir < temperaturaMin){
            temperaturaAtual = temperaturaMin;
        }else {
            temperaturaAtual = temperaturaDiminuir;
        }
    }
    
    void exibeFahreinheit(){
        System.out.println(String.format("Temperatura em Fahreinheit: %.1f", temperaturaAtual*33.8));
    }
        
}
