import domain.Iphone;
import domain.NavegadorWeb;
import domain.AparelhoTelefonico;
import domain.ReprodutorMusica;
import java.util.Scanner;





public class App {
    //static Iphone iphone;
    public static void main(String[] args) throws Exception {
        Iphone iphone = new Iphone();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Iphone carregado! \n Bem vindo!");
        System.out.println("Selecione o que deseja fazer \n");
        System.out.println("1 - Menu Telefone \n 2 - Menu Web \n 3 - Menu Musica \n 4 - Sair");
        
        Integer opc = scanner.nextInt();


        while(opc != 4){
            
            if(opc.equals(1) ){
                System.out.println("1 - Atender Chamada");
                System.out.println("2 - Discar");
                System.out.println("3 - Correio de Voz");
                System.out.println("4 - Sair");
                Integer subopc = scanner.nextInt();;
                
                while(subopc != 4){
                    if(subopc.equals(1)){
                        iphone.answer();
                    }else if(subopc.equals(2)){
                        iphone.call();
                    }else if(subopc.equals(3)){
                        iphone.voiceMail();
                    }else{
                        System.out.println("Insira um valor valido");
                    }
                    System.out.println("1 - Atender Chamada \n 2 - Discar \n 3 - Correio de Voz \n 4 - Sair");
                    subopc = scanner.nextInt();;
                }
            }
            System.out.println("1 - Menu Telefone \n 2 - Menu Web \n 3 - Menu Musica \n 4 - Sair");
            opc = scanner.nextInt();
        }
        scanner.close();
        System.out.println("Desligando Iphone.");
    }
    
}