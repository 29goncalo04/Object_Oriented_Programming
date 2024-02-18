import java.util.Scanner;

public class Exercicio1_2 {
    
    public int maximoNumeros(int a, int b){
        return Math.max(a, b);
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Escreva um número: ");
        int num1 = scanner.nextInt();
        System.out.print("Escreva outro número: ");
        int num2 = scanner.nextInt();

        Exercicio1_2 exercicio = new Exercicio1_2();
        System.out.println("O maior número lido é: " + exercicio.maximoNumeros(num1, num2));
        scanner.close();
    }

}