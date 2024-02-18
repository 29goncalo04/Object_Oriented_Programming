import java.util.Scanner;

public class Exercicio1_5 {

    public String media(int a, int b){
        return "Números por ordem decrescente -> " + Math.max(a, b) + ", " + Math.min(a,b) + "     Média -> " + (a+b)/2;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Insira um número: ");
        int num1 = input.nextInt();
        System.out.print("Insira outro número: ");
        int num2 = input.nextInt();
        Exercicio1_5 exercicio = new Exercicio1_5();
        System.out.println(exercicio.media(num1, num2));
        input.close();
    }
}
