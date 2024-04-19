public class LinhaEncomenda {
    
    private String referencia;
    private String descricao;
    private double preco;
    private int quantidade;
    private int imposto;
    private double desconto;

    public LinhaEncomenda(){
        this.referencia = "";
        this.descricao = null;
        this.preco = 0;
        this.quantidade = 0;
        this.imposto = 0;
        this.desconto = 0;
    }

    public LinhaEncomenda(String referencia, String descricao, double preco, int quantidade, int imposto, double desconto){
        this.referencia = referencia;
        this.descricao = descricao;
        this.preco = preco;
        this.quantidade = quantidade;
        this.imposto = imposto;
        this.desconto = desconto;
    }

    public LinhaEncomenda(LinhaEncomenda myEncomenda){
        this.referencia = myEncomenda.getReferencia();
        this.descricao = myEncomenda.getDescricao();
        this.preco = myEncomenda.getPreco();
        this.quantidade = myEncomenda.getQuantidade();
        this.imposto = myEncomenda.getImposto();
        this.desconto = myEncomenda.getDesconto();
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public void setImposto(int imposto) {
        this.imposto = imposto;
    }
    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }
    public String getReferencia() {
        return this.referencia;
    }
    public String getDescricao() {
        return this.descricao;
    }
    public double getPreco() {
        return this.preco;
    }
    public int getQuantidade() {
        return this.quantidade;
    }
    public int getImposto() {
        return this.imposto;
    }
    public double getDesconto() {
        return this.desconto;
    }
    
    public double calculaValorLinhaEnc() {
       return this.getQuantidade() * (1 + (this.getImposto() - this.getDesconto())/100)*this.getPreco();
    }

    public double calculaValorDesconto() {
        return this.getQuantidade() * this.getDesconto()/100 * this.getPreco();
    }

    public LinhaEncomenda clone() {
        return new LinhaEncomenda(this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Linha Encomenda:: {");
        sb.append("CodProduto: ").append(this.referencia);
        sb.append(" | Descrição: ").append(this.descricao);
        sb.append(" | Preço: ").append(this.preco);
        sb.append(" | Quantidade: ").append(this.quantidade);
        sb.append(" | Imposto: ").append(this.imposto);
        sb.append(" | Desconto: ").append(this.desconto).append("}");
        return sb.toString();
    }

}