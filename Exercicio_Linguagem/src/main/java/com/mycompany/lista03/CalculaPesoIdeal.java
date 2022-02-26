package lista03;
public class CalculaPesoIdeal {
    
    Double calculaPesoIdeal (String sexo, Double altura){
        if (sexo.equals("M")){
          return (72.7*altura) - 44.7;  
        }
        else if (sexo.equals("F")){
            return (62.1*altura) - 58;
        }
        return null;
    }
}
