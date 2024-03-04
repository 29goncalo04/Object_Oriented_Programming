import java.util.Scanner;
import java.util.Arrays;

public class Exercicio4 {
    public static void main(String[] args){
        Video video = new Video("Video1", "0001011101010001011", "04/03/2024", 1080, "10:30", new String[]{"Nice", "Good"}, 10, 1);
        Scanner input = new Scanner(System.in);
        System.out.print("Escreva um comentário: ");
        String comentario = input.nextLine();
        video.insereComentario(comentario);
        System.out.printf("Comentários do vídeo: %s\n", Arrays.toString(video.getComentarios()));
        video.thumbsUp();
        System.out.printf("Quantidade de likes: %d\n", video.getLikes());
        System.out.printf("Conteúdo do vídeo em bytes: %s\n", video.processa());
        
        input.close();
    }
}