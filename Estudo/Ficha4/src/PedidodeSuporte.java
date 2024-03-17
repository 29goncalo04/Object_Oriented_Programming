import java.time.LocalDateTime;

public class PedidodeSuporte {

    private String autor;
    private LocalDateTime submetido;
    private String assunto;
    private String descricao;
    private String solucionador;
    private LocalDateTime concluido;
    private String informacao;

    public PedidodeSuporte(){
        this.autor = null;
        this.submetido = LocalDateTime.now();
        this.assunto = null;
        this.descricao = null;
        this.solucionador = null;
        this.concluido = LocalDateTime.now();
        this.informacao = null;
    }
    public PedidodeSuporte(String autor, LocalDateTime submetido, String assunto, String descricao, String solucionador, LocalDateTime concluido, String informacao){
        this.autor = autor;
        this.submetido = submetido;
        this.assunto = assunto;
        this.descricao = descricao;
        this.solucionador = solucionador;
        this.concluido = concluido;
        this.informacao = informacao;
    }
    public PedidodeSuporte(PedidodeSuporte myPedidodeSuporte){
        this.autor = myPedidodeSuporte.getAutor();
        this.submetido = myPedidodeSuporte.getSubmetido();
        this.assunto = myPedidodeSuporte.getAssunto();
        this.descricao = myPedidodeSuporte.getDescricao();
        this.solucionador = myPedidodeSuporte.getSolucionador();
        this.concluido = myPedidodeSuporte.getConcluido();
        this.informacao = myPedidodeSuporte.getInformacao();
    }
    public String getAutor() {
        return this.autor;
    }
    public LocalDateTime getSubmetido() {
        return this.submetido;
    }
    public String getAssunto() {
        return this.assunto;
    }
    public String getDescricao() {
        return this.descricao;
    }
    public String getSolucionador() {
        return this.solucionador;
    }
    public LocalDateTime getConcluido() {
        return this.concluido;
    }
    public String getInformacao() {
        return this.informacao;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public void setSubmetido(LocalDateTime submetido) {
        this.submetido = submetido;
    }
    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public void setSolucionador(String solucionador) {
        this.solucionador = solucionador;
    }
    public void setConcluido(LocalDateTime concluido) {
        this.concluido = concluido;
    }
    public void setInformacao(String informacao) {
        this.informacao = informacao;
    }
    public PedidodeSuporte clone(){
        return new PedidodeSuporte(this);
    }
    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null || this.getClass() != o.getClass()) return false;
        PedidodeSuporte that = (PedidodeSuporte) o;
        return this.autor.equals(that.autor) && this.submetido.equals(that.submetido) && this.assunto.equals(that.assunto) && this.descricao.equals(that.descricao) && this.solucionador.equals(that.solucionador) && this.concluido.equals(that.concluido) && this.informacao.equals(that.informacao);
    }
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Pedido de suporte::{");
        sb.append("Autor: ").append(this.getAutor());
        sb.append(" | Submetido em: ").append(this.getSubmetido());
        sb.append(" | Assunto: ").append(this.getAssunto());
        sb.append(" | Descrição: ").append(this.getDescricao());
        sb.append(" | Solucionador: ").append(this.getSolucionador());
        sb.append(" | Concluído em: ").append(this.getConcluido());
        sb.append(" | Informação: ").append(this.getInformacao()).append("}");
        return sb.toString();
    }

}