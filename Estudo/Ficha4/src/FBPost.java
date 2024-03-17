import java.util.ArrayList;
import java.time.LocalDateTime;

public class FBPost {
    
    private int id;
    private String utilizador;
    private LocalDateTime data;
    private String conteudo;
    private int likes;
    private ArrayList <String> comentarios;

    public FBPost(){
        this.id = -1;
        this.utilizador = null;
        this.data = LocalDateTime.now();
        this.conteudo = null;
        this.likes = -1;
        this.comentarios = new ArrayList<String>();
    }
    public FBPost(int id, String utilizador, LocalDateTime data, String conteudo, int likes, ArrayList<String> comentarios){
        this.id = id;
        this.utilizador = utilizador;
        this.data = data;
        this.conteudo = conteudo;
        this.likes = likes;
        this.setComentarios(comentarios);
    }
    public FBPost(FBPost myFbPost){
        this.id = myFbPost.getId();
        this.utilizador = myFbPost.getUtilizador();
        this.data = myFbPost.getData();
        this.conteudo = myFbPost.getConteudo();
        this.likes = myFbPost.getLikes();
        this.setComentarios(myFbPost.getComentarios());
    }

    public int getId() {
        return this.id;
    }
    public String getUtilizador() {
        return this.utilizador;
    }
    public LocalDateTime getData() {
        return this.data;
    }
    public String getConteudo() {
        return this.conteudo;
    }
    public int getLikes() {
        return this.likes;
    }
    public ArrayList<String> getComentarios() {
        return this.comentarios;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setUtilizador(String utilizador) {
        this.utilizador = utilizador;
    }
    public void setData(LocalDateTime data) {
        this.data = data;
    }
    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }
    public void setLikes(int likes) {
        this.likes = likes;
    }
    public void setComentarios(ArrayList <String> comentarios){
        this.comentarios = new ArrayList<String>();
        for(String l : comentarios){
            this.comentarios.add(l);
        }
    }
    public FBPost clone(){
        return new FBPost(this);
    }
    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null || this.getClass() != o.getClass()) return false;
        FBPost that = (FBPost) o;
        return this.id == that.id && this.utilizador.equals(that.utilizador) && this.data.equals(that.data) && this.conteudo.equals(that.conteudo) && this.likes == that.likes && this.comentarios.equals(that.comentarios);
    }
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Post::{");
        sb.append("ID: ").append(this.getId());
        sb.append(" | Nome do utilizador: ").append(this.getUtilizador());
        sb.append(" | Criação do post: ").append(this.getData());
        sb.append(" | Número de likes: ").append(this.getLikes());
        sb.append(" | Comentários: ").append(this.getComentarios()).append("}");
        return sb.toString();
    }
}