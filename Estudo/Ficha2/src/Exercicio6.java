import java.util.Scanner;
import java.util.Arrays;

public class Exercicio6 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Aux_functions aux = new Aux_functions();
        System.out.print("Quantas linhas irá ter a sua matriz? ");
        int linhas = input.nextInt();
        System.out.print("Quantas colunas irá ter a sua matriz? ");
        int colunas = input.nextInt();
        int[][] matriz = new int[linhas][colunas];
        for(int i = 0; i<linhas; i++){
            System.out.printf("Insira os valores da linha %d:\n", i+1);
            for(int j = 0; j<colunas; j++) matriz[i][j] = input.nextInt(); 
        }
        System.out.print("\nQuantas linhas irá ter a sua segunda matriz? ");
        int linhas2 = input.nextInt();
        System.out.print("Quantas colunas irá ter a sua segunda matriz? ");
        int colunas2 = input.nextInt();
        int[][] matriz2 = new int[linhas2][colunas2];
        for(int i = 0; i<linhas2; i++){
            System.out.printf("Insira os valores da linha %d:\n", i+1);
            for(int j = 0; j<colunas2; j++) matriz2[i][j] = input.nextInt(); 
        }

        System.out.printf("\nA matriz resultante da soma das duas matrizes é: %s\n\n", aux.soma_matriz(matriz, matriz2));

        if(aux.same_matriz(matriz, matriz2) == 1) System.out.printf("As matrizes são iguais\n\n");
        else System.out.printf("As matrizes não são iguais\n\n");

        System.out.print("Qual das duas matrizes quer que seja determinada a correspondente oposta? (1 ou 2) ");
        int choice = input.nextInt();
        if(choice == 1 || choice == 2){
            if(choice == 1)System.out.printf("A matriz oposta à escolhida é: %s\n", Arrays.deepToString(aux.opposite(matriz)));
            else System.out.printf("A matriz oposta à escolhida é: %s\n", Arrays.deepToString(aux.opposite(matriz2)));
        }

        input.close();
    }
}