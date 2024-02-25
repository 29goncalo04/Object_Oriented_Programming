import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args){
        int[][] notasTurma = new int[5][5];
        Scanner input = new Scanner(System.in);
        Aux_functions aux = new Aux_functions();
        for(int i = 0; i<5; i++){
            System.out.printf("Insira as notas do aluno %d:\n", i+1);
            for(int j = 0; j<5; j++){
                notasTurma[i][j] = input.nextInt();
            }
        }

        System.out.printf("\nPretende saber a soma das notas de qual unidade curricular? (1 a 5): ");
        int uc = input.nextInt(); 
        System.out.printf("A soma das notas da unidade curricular %d é %d\n\n", uc, aux.soma_uc(notasTurma, uc));

        System.out.print("Quer saber a média das notas de qual aluno? (1 a 5): ");
        int aluno = input.nextInt();
        System.out.printf("A média do aluno %d é %d\n\n", aluno, aux.media(notasTurma, aluno));

        System.out.print("Quer saber a média das notas de qual UC? (1 a 5): ");
        uc = input.nextInt();
        System.out.printf("A média de notas da UC %d é %d\n\n", uc, aux.media_uc(notasTurma, uc));

        for(int i = 0; i<5; i++){
            System.out.printf("A maior nota da UC %d foi %d\n", i+1, aux.max_note(notasTurma, i+1));
        }
        System.out.printf("\n");

        for(int i = 0; i<5; i++){
            System.out.printf("A menor nota da UC %d foi %d\n", i+1, aux.min_note(notasTurma, i+1));
        }
        System.out.printf("\n");

        System.out.printf("Indique um valor para saber quais as notas superiores a esse valor: ");
        int nota = input.nextInt();
        if(aux.acima(notasTurma, nota).length == 0) System.out.printf("Não existem notas superiores a %d\n\n", nota);
        else{
            System.out.printf("As notas superiores a %d são: ", nota);
            for(int i = 0; i<aux.acima(notasTurma, nota).length; i++){
                if(i == aux.acima(notasTurma, nota).length-1) System.out.printf("%d\n\n", aux.acima(notasTurma, nota)[i]);
                else System.out.printf("%d ", aux.acima(notasTurma, nota)[i]);
            }
        }

        System.out.printf("Todas as notas de todos os alunos são: %s\n\n", aux.all_notas(notasTurma));

        System.out.printf("A UC com a média de notas mais elevada é: %d\n", aux.melhor_uc(notasTurma));

        input.close();
    }
}