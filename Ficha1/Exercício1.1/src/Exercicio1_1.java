import java.util.Scanner;


public class Exercicio1_1 {
    public static double celsiusParaFarenheit(double graus){
        return graus*1.8 + 32;
    }
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");
        Scanner oi = new Scanner(System.in);
        System.out.println("Insira uma temperatura em graus Celsius:");
        double Celsius = oi.nextDouble();
        System.out.println("A correspondente temperatura em Farenheit é: " + celsiusParaFarenheit(Celsius));
    }
}
