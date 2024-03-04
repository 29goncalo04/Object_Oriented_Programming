import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Sensor sensor = new Sensor(0);
        System.out.printf("Pressão inicial detetada no sensor: %f\n", sensor.getPressao());
        System.out.print("Digite a nova pressão: ");
        double pressao = input.nextDouble();
        boolean validade = sensor.setPressao(pressao);
        if (validade == false) System.out.println("A pressão inserida é inválida");
        else System.out.printf("A nova pressão marcada no sensor é válida e corresponde a: %f\n", sensor.getPressao());
        input.close();
    }
}
