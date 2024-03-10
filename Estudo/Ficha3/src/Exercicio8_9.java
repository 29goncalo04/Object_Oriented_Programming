import java.util.Scanner;

public class Exercicio8_9 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Quantos produtos tem a sua encomenda? ");
        int produtos = input.nextInt();
        Encomenda[] aux = new Encomenda[produtos];
        Encomenda2 encomenda2 = new Encomenda2();
        
        for(int i = 0; i<produtos; i++){
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
            aux[i] = encomenda;
            System.out.printf("O valor da sua venda é %f\n", encomenda.calculaValorLinhaEnc());
            System.out.printf("O valor do seu desconto em euros é %f\n\n", encomenda.calculaValorDesconto());
        }

        encomenda2.setEncomendas(aux);
        System.out.printf("O valor total da sua encomenda é: %f\n", encomenda2.calculaValorTotal());
        System.out.printf("O valor total dos descontos obtidos foi: %f\n", encomenda2.calculaValorDesconto());

        input.close();
    }
}