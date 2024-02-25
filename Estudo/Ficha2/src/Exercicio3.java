import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Quantos elementos terá o seu array? ");
        int tam = input.nextInt();
        int[] array = new int[tam]; 
        System.out.println("Indique os elementos do seu array");
        for(int i = 0; i<tam; i++) array[i] = input.nextInt(); 
        System.out.print("\n");
        
        Aux_functions aux = new Aux_functions();

        System.out.println("O seu array ordenado por ordem crescente fica assim:");
        int[] new_array = aux.crescente(array, tam);
        for(int i = 0; i<tam; i++){
            if(i == tam-1) System.out.printf("%d\n", new_array[i]);
            else System.out.printf("%d ", new_array[i]);
        }

        System.out.printf("\nIndique um número que estava presente nesse array: ");
        int num = input.nextInt();
        System.out.printf("O número %d está na posição %d do array\n", num, aux.pos(new_array, num));

        input.close();
    }
}