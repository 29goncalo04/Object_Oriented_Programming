import java.util.Scanner;

public class Exercicio2_4 {
    
    public double eurosParaLibras(double valor, double taxaConversao){
        return valor * taxaConversao;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Insira um valor em euros: ");
        double valor = input.nextDouble();
        System.out.print("Insira a taxa de conversão para libras: ");
        double tc = input.nextDouble();
        Exercicio2_4 exercicio = new Exercicio2_4();
        System.out.println("O correspondente valor em libras é: " + exercicio.eurosParaLibras(valor, tc));
        input.close();
    }
}