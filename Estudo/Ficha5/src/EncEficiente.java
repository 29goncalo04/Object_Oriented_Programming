import java.time.LocalDate;
import java.util.ArrayList;

public class EncEficiente {

    private String nome;
    private int nif;
    private String morada;
    private int numero_enc;
    private LocalDate data;
    private ArrayList <LinhaEncomenda> encomendas;

    public EncEficiente(){
        this.nome = null;
        this.nif = -1;
        this.morada = null;
        this.numero_enc = -1;
        this.data = LocalDate.now();
        this.encomendas = new ArrayList<LinhaEncomenda>();
    }

    public EncEficiente(String nome, int nif, String morada, int numero_enc, LocalDate data, ArrayList <LinhaEncomenda> encomendas){
        this.nome = nome;
        this.nif = nif;
        this.morada = morada;
        this.numero_enc = numero_enc;
        this.data = data;
        this.setEncomendas(encomendas);
    }

    public EncEficiente(EncEficiente myEncEficiente){
        this.nome = myEncEficiente.getNome();
        this.nif = myEncEficiente.getNif();
        this.morada = myEncEficiente.getMorada();
        this.numero_enc = myEncEficiente.getNumero_enc();
        this.data = myEncEficiente.getData();
        this.setEncomendas(myEncEficiente.getEncomendas());
    }

    public String getNome() {
        return this.nome;
    }
    public int getNif() {
        return this.nif;
    }
    public String getMorada() {
        return this.morada;
    }
    public int getNumero_enc() {
        return this.numero_enc;
    }
    public LocalDate getData() {
        return this.data;
    }
    public ArrayList<LinhaEncomenda> getEncomendas(){
        return this.encomendas;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setNif(int nif) {
        this.nif = nif;
    }
    public void setMorada(String morada) {
        this.morada = morada;
    }
    public void setNumero_enc(int numero_enc) {
        this.numero_enc = numero_enc;
    }
    public void setData(LocalDate data) {
        this.data = data;
    }
    public void setEncomendas(ArrayList<LinhaEncomenda> encomendas){
        this.encomendas = new ArrayList<LinhaEncomenda>();
        for(LinhaEncomenda l : encomendas){
            this.encomendas.add(l.clone());
        }
    }

    public EncEficiente clone(){
        return new EncEficiente(this);
    }
    public boolean equals(Object o){
        if (this == o) return true;
        if(o == null || this.getClass() != o.getClass()) return false;
        EncEficiente that = (EncEficiente) o;
        return this.nome.equals(that.nome) && this.nif == that.nif && this.morada.equals(that.morada) && this.numero_enc == that.numero_enc && this.data.equals(that.data) && this.encomendas.equals(that.encomendas);
    }
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("EncEficiente {\n");
        sb.append("Nome: ").append(this.getNome()).append("\n");
        sb.append("NIF: ").append(this.getNif()).append("\n");
        sb.append("Morada: ").append(this.getMorada()).append("\n");
        sb.append("Número da encomenda: ").append(this.getNumero_enc()).append("\n");
        sb.append("Data: ").append(this.getData()).append("\n");
        sb.append("Encomendas: ").append(this.getEncomendas().toString()).append("}\n");
        return sb.toString();
    }  

    public double calculaValorTotal(){
        double res = 0;
        for(LinhaEncomenda l : this.getEncomendas()){
            res += l.calculaValorLinhaEnc();
        }
        return res;
    }

    public double calculaValorDesconto(){
        double res = 0;
        for(LinhaEncomenda l : this.getEncomendas()){
            res += l.calculaValorDesconto();
        }
        return res;
    }

    public int numeroTotalProdutos(){
        int res = 0;
        for(LinhaEncomenda l : this.getEncomendas()){
            res += l.getQuantidade();
        }
        return res;
    }

    public boolean existeProdutoEncomenda(String refProduto){
        for(LinhaEncomenda l : this.getEncomendas()){
            if(refProduto.equals(l.getReferencia())) return true;
        }
        return false;
    }

    public void adicionaLinha(LinhaEncomenda linha){
        this.getEncomendas().add(linha);
    }

    public void removeProduto(String codProd){
        int i = 0;
        for(LinhaEncomenda l : this.getEncomendas()){
            if(codProd.equals(l.getReferencia())){
                this.getEncomendas().remove(i);
                break;
            }
            i++;
        }
    }
}