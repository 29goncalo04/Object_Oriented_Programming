import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args){
        Circulo circulo = new Circulo();
        System.out.printf("[círculo inicial] Centro: (%f, %f)  Raio: %f\n", circulo.getX(), circulo.getY(), circulo.getRaio());
        Scanner input = new Scanner(System.in);
        System.out.println("Qual a abcissa(X) do centro do círculo?");
        double x = input.nextDouble();
        System.out.println("Qual a ordenada(Y) do centro do círculo?");
        double y = input.nextDouble();
        System.out.println("Qual o raio do círculo?");
        double raio = input.nextDouble();
        circulo.alteraCentro(x, y);
        circulo.setRaio(raio);
        System.out.printf("Centro: (%f, %f)  Raio: %f\n", circulo.getX(), circulo.getY(), circulo.getRaio());
        System.out.printf("A área do seu círculo é %f\n", circulo.calculaArea());
        System.out.printf("O perímetro do seu círculo é %f\n", circulo.calculaPerimetro());
        input.close();
    }
}