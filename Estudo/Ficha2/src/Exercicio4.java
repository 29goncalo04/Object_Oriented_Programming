import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Quantas palavras vai querer escrever? ");
        int n = input.nextInt();
        String[] palavras = new String[n];
        for(int i = 0; i<n; i++) palavras[i] = input.next();
        System.out.print("As palavras escritas foram: ");
        Aux_functions aux = new Aux_functions();
        String[] new_array = aux.no_repeat(palavras);
        for(int i = 0; i<new_array.length; i++){
            if(i == new_array.length-1) System.out.printf("%s\n", new_array[i]);
            else System.out.printf("%s, ", new_array[i]);
        }

        System.out.printf("\nA maior string inserida foi: %s\n\n", aux.maior_string(new_array));

        System.out.print("As palavras repetidas nesse array são: ");
        String[] palavras_repetidas = aux.palavras_repetidas(palavras);
        for(int i = 0; i<palavras_repetidas.length; i++){
            if(i == palavras_repetidas.length-1) System.out.printf("%s\n\n", palavras_repetidas[i]);
            else System.out.printf("%s, ", palavras_repetidas[i]);
        }

        System.out.print("Escreva uma palavra para ver o número de vezes que ela aparece no array: ");
        String palavra = input.next();
        System.out.printf("A palavra '%s' aparece %d vezes\n", palavra, aux.numero_ocorr(palavras, palavra));

        input.close();
    }
}