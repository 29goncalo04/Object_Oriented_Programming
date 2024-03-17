import java.time.LocalDateTime;
import java.util.ArrayList;

public class Exercicio4 {
    public static void main(String[] args){
        ArrayList <String> comentarios = new ArrayList<String>();
        comentarios.add("Java");
        comentarios.add("Python");
        LocalDateTime data_aux = LocalDateTime.of(2022, 1, 1, 18, 0);  //  01/01/2022 às 18:00
        FBPost post1 = new FBPost(1, "Gonçalo", data_aux, "Post", 30, comentarios);
        FBPost post2 = new FBPost(2, "Martim", LocalDateTime.now(), "Post", 10, comentarios);
        FBPost post3 = new FBPost(3, "Gonçalo", LocalDateTime.now(), "Post", 5, comentarios);
        FBPost post4 = new FBPost(4, "Gonçalo", LocalDateTime.now(), "Post", 20, comentarios);
        ArrayList <FBPost> posts = new ArrayList<FBPost>();
        posts.add(post1);
        posts.add(post2);
        posts.add(post3);
        posts.add(post4);
        FBFeed feed = new FBFeed(posts);

        System.out.printf(feed.toString());

        System.out.printf("\n\nNúmero de posts do utilizador 'Gonçalo': %d\n\n", feed.nrPosts("Gonçalo"));

        System.out.print("Lista de posts do utilizador 'Gonçalo' -> " + feed.postsOf("Gonçalo").toString() + "\n\n");

        LocalDateTime data = LocalDateTime.of(2023, 1, 1, 18, 0);  //  01/01/2023 às 18:00
        System.out.print("Lista de posts do utilizador 'Gonçalo' entre 01/01/2023T18:00 até ao momento -> " + feed.postsOf("Gonçalo", data, LocalDateTime.now()).toString() + "\n\n");

        System.out.print("Post com o ID '2' -> " + feed.getPost(2).toString() + "\n\n");

        String comentario = "Prefiro outra";
        feed.comment(post2, comentario);
        System.out.printf("Post de ID '2' atualizado -> " + feed.getPost(2).toString() + "\n\n");

        comentario = "Amanhã também é dia";
        feed.comment(3, comentario);
        System.out.printf("Post de ID '3' atualizado -> " + feed.getPost(3).toString() + "\n\n");

        feed.like(post1);
        System.out.printf("Post '1' com mais 1 like -> " + feed.getPost(1) + "\n\n");

        feed.like(4);
        System.out.printf("Post '4' com mais 1 like -> " + feed.getPost(4) + "\n\n");
        
        //System.out.printf(feed.toString());

    }
}