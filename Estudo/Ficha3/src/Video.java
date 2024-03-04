public class Video {
    
    private String nome;
    private String conteudo;
    private String data;
    private int resolucao;
    private String duracao;
    private String[] comentarios;
    private int likes;
    private int dislikes;

    public Video(String nome, String conteudo, String data, int resolucao, String duracao, String[] comentarios, int likes, int dislikes){
        this.nome = nome;
        this.conteudo = conteudo;
        this.data = data;
        this.resolucao = resolucao;
        this.duracao = duracao;
        this.comentarios = comentarios;
        this.likes = likes;
        this.dislikes = dislikes;
    }

    public String getNome(){
        return this.nome;
    }
    public String getConteudo(){
        return this.conteudo;
    }
    public String getData(){
        return this.data;
    }
    public int getResolucao(){
        return this.resolucao;
    }
    public String getDuracao(){
        return this.duracao;
    }
    public String[] getComentarios(){
        return this.comentarios;
    }
    public int getLikes(){
        return this.likes;
    }
    public int getDislikes(){
        return this.dislikes;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public void setConteudo(String conteudo){
        this.conteudo = conteudo;
    }
    public void setData(String data){
        this.data = data;
    }
    public void setResolucao(int resolucao){
        this.resolucao = resolucao;
    }
    public void setDuracao(String duracao){
        this.duracao = duracao;
    }
    public void setComentarios(String[] comentarios){
        this.comentarios = comentarios;
    }
    public void setLikes(int likes){
        this.likes = likes;
    }
    public void setDislikes(int dislikes){
        this.dislikes = dislikes;
    }

    public void insereComentario(String comentario){
        String[] new_array = new String[this.getComentarios().length + 1];
        for(int i = 0; i<this.getComentarios().length; i++){
            new_array[i] = this.getComentarios()[i];
        }
        new_array[this.getComentarios().length] = comentario;
        this.setComentarios(new_array);
    }

    //public long qtsDiasDepois(){
    //    
    //}

    public void thumbsUp(){
        this.setLikes(this.getLikes() + 1);
    }

    public String processa(){
        return this.getConteudo();
    }

}