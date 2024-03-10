import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Encomenda encomenda = new Encomenda();
        System.out.printf("Insira o preço do produto sem imposto: ");
        double preco = input.nextDouble();
        System.out.printf("Insira a percentagem de imposto: ");
        int imposto = input.nextInt();
        System.out.printf("Insira o desconto do produto: ");
        double desconto = input.nextDouble();
        encomenda.setPreco(preco);
        encomenda.setImposto(imposto);
        encomenda.setDesconto(desconto);
        System.out.printf("O valor da sua venda é %f\n", encomenda.calculaValorLinhaEnc());
        System.out.printf("O valor do seu desconto em euros é %f\n", encomenda.calculaValorDesconto());

        input.close();
    }
}
