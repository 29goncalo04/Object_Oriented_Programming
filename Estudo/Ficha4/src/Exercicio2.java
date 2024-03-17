import java.util.Scanner;
import java.util.ArrayList;

public class Exercicio2 {
    public static void main(String[] args){
        EncEficiente encEficiente = new EncEficiente();
        Scanner input = new Scanner(System.in);
        System.out.printf("Insira o nome do cliente: ");
        String nome = input.nextLine();
        encEficiente.setNome(nome);
        System.out.printf("Insira o NIF do cliente: ");
        int nif = input.nextInt();
        encEficiente.setNif(nif);
        input.nextLine();
        System.out.printf("Insira a morada do cliente: ");
        String morada = input.nextLine();
        encEficiente.setMorada(morada);
        System.out.printf("Insira o número da encomenda: ");
        int numero_enc = input.nextInt();
        encEficiente.setNumero_enc(numero_enc);
        input.nextLine();
        LinhaEncomenda linhaEncomenda1 = new LinhaEncomenda("123", "produto1", 10, 1, 100, 50);  //15 euros
        LinhaEncomenda linhaEncomenda2 = new LinhaEncomenda("321", "produto2", 20, 1, 100, 50);  //30 euros
        ArrayList <LinhaEncomenda> encomendas = new ArrayList <LinhaEncomenda>();
        encomendas.add(linhaEncomenda1);
        encomendas.add(linhaEncomenda2);
        encEficiente.setEncomendas(encomendas);

        System.out.printf("\nO valor total da encomenda é: %f\n\n", encEficiente.calculaValorTotal());

        System.out.printf("O valor total dos descontos foi: %f\n\n", encEficiente.calculaValorDesconto());

        System.out.printf("A quantidade total de itens comprados foi: %d\n\n", encEficiente.numeroTotalProdutos());

        System.out.printf("Insira a referência de um produto para saber se ele vai ser encomendado: ");
        String ref = input.nextLine();
        if(encEficiente.existeProdutoEncomenda(ref) == true) System.out.printf("Esse produto vai ser encomendado\n\n");
        else System.out.printf("Esse produto não vai ser encomendado\n\n");

        encEficiente.adicionaLinha(linhaEncomenda2);

        System.out.printf("Insira a referência do produto que deseja remover: ");
        ref = input.nextLine();
        encEficiente.removeProduto(ref);
        System.out.printf(encEficiente.toString());

        input.close();
    }
}