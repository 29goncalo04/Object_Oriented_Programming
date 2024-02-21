import java.util.Scanner;

public class Exercicio1_3 {
    
    public int classificacao(double clas){
        if(clas < 0 || clas > 20) return -1;   //inválido
        if(clas >= 5){
            if(clas >= 10){
                if(clas >= 15){
                    return 3;  //[15:20]
                }
                return 2;  //[10;15[
            }
            return 1;  //[5;10[
        }
        return 0;  //[0;5[
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Indique quantas classificações irá indicar: ");
        int n = input.nextInt();
        System.out.println("Clique 'ENTER' após cada classificação inserida");        
        int low = 0, good = 0, very_good = 0, excellent = 0;
        for(int i = 0; i<n; i++){
            double clas = input.nextDouble();
            Exercicio1_3 exercicio = new Exercicio1_3();
            if(exercicio.classificacao(clas) == 0) low++;
            if(exercicio.classificacao(clas) == 1) good++;
            if(exercicio.classificacao(clas) == 2) very_good++;
            if(exercicio.classificacao(clas) == 3) excellent++;
        }
        System.out.println("[0;5[ -> " + low);
        System.out.println("[5;10[ -> " + good);
        System.out.println("[10;15[ -> " + very_good);
        System.out.println("[15;20] -> " + excellent);
        input.close();
    }
}