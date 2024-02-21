import java.util.Scanner;

public class Exercicio2_6 {
    
    public long factorial(int num){
        int resultado = 1;
        for (int i = 1; i<=num; i++){
            resultado *= i;
        }
        return resultado;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Insira um número: ");
        int num = input.nextInt();
        Exercicio2_6 exercicio = new Exercicio2_6();
        System.out.println("O fatorial desse número é: " + exercicio.factorial(num));
        input.close();
    }
}