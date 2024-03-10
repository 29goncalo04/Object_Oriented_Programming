public class Encomenda {
    
    private String referencia;
    private String[] descricao;
    private double preco;
    private int quantidade;
    private int imposto;
    private double desconto;

    public Encomenda(){
        this.referencia = "";
        this.descricao = new String[0];
        this.preco = 0;
        this.quantidade = 0;
        this.imposto = 0;
        this.desconto = 0;
    }

    public Encomenda(String referencia, String[] descricao, double preco, int quantidade, int imposto, double desconto){
        this.referencia = referencia;
        this.descricao = descricao;
        this.preco = preco;
        this.quantidade = quantidade;
        this.imposto = imposto;
        this.desconto = desconto;
    }

    public Encomenda(Encomenda myEncomenda){
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
    public void setDescricao(String[] descricao) {
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
    public String[] getDescricao() {
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

    public double calculaValorLinhaEnc(){
        double preco_sem_imposto = this.getPreco();
        double preco_com_imposto = preco_sem_imposto + (this.getPreco() * (this.getImposto()/100));
        double preco_com_desconto = preco_com_imposto - (preco_com_imposto * this.getDesconto()/100);
        return preco_com_desconto;
    }

    public double calculaValorDesconto(){
        return ((this.getPreco() + (this.getPreco() * (this.getImposto()/100))) * this.getDesconto()/100);
    }

}