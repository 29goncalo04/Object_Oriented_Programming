import java.util.Scanner;

public class Exercicio1{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Quantos inteiros quer escrever? ");
        int n = input.nextInt();
        System.out.println("Digite os números e pressione 'ENTER' no fim de cada um");
        int[] array = new int[n];
        for(int i = 0; i<n; i++){
            array[i] = input.nextInt();
        }
        Aux_functions aux = new Aux_functions();
        System.out.printf("O menor número digitado foi -> %d\n\n", aux.min(array));

        System.out.println("Indique dois índices para saber quais os números contidos no array entre essas duas posições");
        int a = input.nextInt();
        int b = input.nextInt();
        int[] new_array = aux.arr(a, b, array);
        System.out.print("\n");
        for (int i = 0; i<new_array.length; i++){
            System.out.printf("%d\n", new_array[i]);
        }
        System.out.printf("\n");

        System.out.print("Quantos inteiros quer escrever no segundo array? ");
        n = input.nextInt();
        System.out.println("Digite os números e pressione 'ENTER' no fim de cada um");
        int[] array2 = new int[n];
        for(int i = 0; i<n; i++){
            array2[i] = input.nextInt();
        }
        System.out.printf("\n");
        System.out.print("Os números comuns em ambos os arrays são:");
        int[] res = aux.equal_array(array, array2);
        for(int i = 0; i<res.length; i++){
            System.out.printf("%d ", res[i]);
        }
        System.out.printf("\n");

        input.close();
    }
}