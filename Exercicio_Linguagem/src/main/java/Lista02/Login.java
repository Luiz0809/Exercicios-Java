
package Lista02;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String login = "";
        String senha = "";
        Boolean logado = false;
        
        while(logado != true){
            System.out.println("Login : ");
            login = sc.nextLine();
            
            System.out.println("Senha : ");
            senha = sc.nextLine();
            
            if (login.equals("admin") && senha.equals("#Bandtec")){
                System.out.println("Login realizado com sucesso");
                logado = true;
            }
            else {
                System.out.println("Login e/ou senha inválidos");}
        }
    }
   
}
