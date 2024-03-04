import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args){
        Lampada lampada = new Lampada();
        Scanner input = new Scanner(System.in);
        System.out.println("Deseja 'ligar' a lâmpada, 'desligar', ou colocar em 'eco_mode'?");
        String escolha = input.next();
        if(escolha.equals("ligar")){
            lampada.lampON();
            System.out.println("Lâmpada ligada");
        }
        else if(escolha.equals("desligar")){
            lampada.lampOFF();
            System.out.println("Lâmpada desligada");
        }
        else if(escolha.equals("eco_mode")){
            lampada.lampECO();
            System.out.println("Lâmpada ligada em eco_mode");
        }
        input.close();
    }
}
