import java.util.ArrayList;
import java.util.LocalDate;

public class EncEficiente {
    
    private String nome;
    private int nif;
    private String morada;
    private int numero_enc;
    private LocalDate data;
    private ArrayList<LinhaEncomenda> encomendas;

    public EncEficiente(){
        this.nome = null;
        this.nif = 0;
        this.morada = null;
        this.numero_enc = 0;
        this.data = LocalDate.now();
        this.encomendas = new ArrayList<LinhaEncomenda>();
    }

    public EncEficiente(String nome, int nif, String morada, int numero_enc, LocalDate data, ArrayList<LinhaEncomenda> encomendas){
        this.nome = nome;
        this.nif = nif;
        this.morada = morada;
        this.numero_enc = numero_enc;
        this.data = data;
        this.setEncomendas(encomendas);
    }

    public EncEficiente(EncEficiente myEncEficiente){

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
    public ArrayList<LinhaEncomenda> getEncomendas() {
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
    public void setEncomendas(ArrayList<LinhaEncomenda> encomendas) {
        this.encomendas = new ArrayList<>();
        for(LinhaEncomenda l : encomendas){
            this.encomendas.add(l.clone());
        }
    }

    public EncEficiente clone() {
        return new EncEficiente(this);
    }

}