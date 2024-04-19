import java.time.Duration;
import java.time.LocalTime;

public class Exercicio2_7 {
    
    // public long factorial(int num){
    //     int resultado = 1;
    //     for (int i = 1; i<=num; i++){
    //         resultado *= i;
    //     }
    //     return resultado;
    // }

    public long tempoGasto(){
        Exercicio2_6 aux = new Exercicio2_6();
        LocalTime tempo_inicial = LocalTime.now();
        aux.factorial(5000);
        LocalTime tempo_final = LocalTime.now();
        Duration duration = Duration.between(tempo_inicial, tempo_final);
        return duration.toMillis();
    }

    public static void main(String[] args){
        Exercicio2_7 exercicio = new Exercicio2_7();
        System.out.println("A sua máquina demorou " + exercicio.tempoGasto() + " milissegundos a calcular o fatorial do número 5000");
    }
}