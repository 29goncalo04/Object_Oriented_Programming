public class Encomenda2 {
    
    private String nome_cliente;
    private int numero_fiscal;
    private String[] morada;
    private int numero_encomenda;
    private String data;
    private Encomenda[] encomendas;

    public Encomenda2(){
        this.nome_cliente = "";
        this.numero_fiscal = 0;
        this.morada = new String[0];
        this.numero_encomenda = 0;
        this.data = "";
        this.encomendas = new Encomenda[0];
    }

    public Encomenda2(String nome_cliente, int numero_fiscal, String[] morada, int numero_encomenda, String data, Encomenda[] encomendas){
        this.nome_cliente = nome_cliente;
        this.numero_fiscal = numero_fiscal;
        this.morada = morada;
        this.numero_encomenda = numero_encomenda;
        this.data = data;
        this.encomendas = encomendas;
    }

    public Encomenda2(Encomenda2 myEncomenda){
        this.nome_cliente = myEncomenda.getNome_cliente();
        this.numero_fiscal = myEncomenda.getNumero_fiscal();
        this.morada = myEncomenda.getMorada();
        this.numero_encomenda = myEncomenda.getNumero_encomenda();
        this.data = myEncomenda.getData();
        this.encomendas = myEncomenda.getEncomendas();
    }

    public String getNome_cliente() {
        return this.nome_cliente;
    }
    public int getNumero_fiscal() {
        return this.numero_fiscal;
    }
    public String[] getMorada() {
        return this.morada;
    }
    public int getNumero_encomenda() {
        return this.numero_encomenda;
    }
    public String getData() {
        return this.data;
    }
    public Encomenda[] getEncomendas() {
        return this.encomendas;
    }
    public void setNome_cliente(String nome_cliente) {
        this.nome_cliente = nome_cliente;
    }
    public void setNumero_fiscal(int numero_fiscal) {
        this.numero_fiscal = numero_fiscal;
    }
    public void setMorada(String[] morada) {
        this.morada = morada;
    }
    public void setNumero_encomenda(int numero_encomenda) {
        this.numero_encomenda = numero_encomenda;
    }
    public void setData(String data) {
        this.data = data;
    }
    public void setEncomendas(Encomenda[] encomendas) {
        this.encomendas = encomendas;
    }

    public double calculaValorTotal(){
        double res = 0;
        for(int i = 0; i<this.getEncomendas().length; i++){
            res += this.getEncomendas()[i].calculaValorLinhaEnc();
        }
        return res;
    }

    public double calculaValorDesconto(){
        double res = 0;
        for(int i = 0; i<this.getEncomendas().length; i++){
            res += this.getEncomendas()[i].calculaValorDesconto();
        }
        return res;
    }

}