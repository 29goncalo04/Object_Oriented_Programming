import java.util.Scanner;


public class Exercicio1_1 {

    public double celsiusParaFarenheit(double graus){
        return graus*1.8 + 32;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Insira uma temperatura em graus Celsius:");
        double Celsius = input.nextDouble();
        Exercicio1_1 exercicio = new Exercicio1_1();
        System.out.println("A correspondente temperatura em Farenheit é: " + exercicio.celsiusParaFarenheit(Celsius));
        input.close();
    }
}