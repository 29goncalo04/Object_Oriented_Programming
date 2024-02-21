import java.util.Scanner;

public class Exercicio2_3 {
    
    public String criaDescricaoConta(String nome, double saldo){
        return "Nome -> " + nome + ", Saldo -> " + saldo;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Insira um nome: ");
        String nome = input.next();
        System.out.print("Insira o saldo: ");
        int saldo = input.nextInt();
        Exercicio2_3 exercicio = new Exercicio2_3();
        System.out.println(exercicio.criaDescricaoConta(nome, saldo));
        input.close();
    }

}