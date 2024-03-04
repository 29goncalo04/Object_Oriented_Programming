import java.util.Scanner;
import java.util.Arrays;

public class Exercicio3 {
    public static void main(String[] args){
        Telemovel telemovel = new Telemovel("Samsung", "S22", "120X60", new String[]{"Oi", "olá"}, 120, 20, 100, 50, 2, 1, new String[]{"Pubg"});
        Scanner input = new Scanner(System.in);
        System.out.print("Insira o tamanho de um conteúdo para ver se cabe no armazenamento do telemóvel: ");
        int bytes = input.nextInt();

        if(telemovel.existeEspaco(bytes) == true) System.out.println("Existe espaço disponível");
        else System.out.println("Não existe espaço disponível");

        System.out.print("Insira o nome da aplicação a instalar: ");
        String app = input.next();
        System.out.print("Insira o tamanho da aplicação: ");
        bytes = input.nextInt();
        telemovel.instalaApp(app, bytes);
        System.out.printf("Espaço ocupado: %d   Aplicações: %d    Nomes das apps: %s\n", telemovel.getEspaco_ocupado(), telemovel.getNumero_apps(), Arrays.toString(telemovel.getNome_apps()));
        
        System.out.print("Escreva uma mensagem de texto para inserir: ");
        String msg = input.next();
        telemovel.recebeMsg(msg);
        System.out.printf("Mensagens de texto: %s\n", Arrays.toString(telemovel.getMensagens_armaz()));

        System.out.printf("O tamanho médio das aplicações é: %f\n", telemovel.tamMedioApps());

        System.out.printf("A maior mensagem de texto é: %s\n", telemovel.maiorMsg());

        System.out.print("Escreva o nome da aplicação a desinstalar: ");
        app = input.next();
        System.out.print("Insira o tamanho da mesma: ");
        bytes = input.nextInt();
        telemovel.removeApp(app, bytes);
        System.out.printf("Nomes das aplicações: %s\n", Arrays.toString(telemovel.getNome_apps()));
        
        input.close();
    }
}
