import java.util.*;
import java.util.stream.Collectors;
import java.time.LocalDate;

public class GestaoEncomendas {
    
    private TreeMap <Integer, EncEficiente> mapEncomendas;

    public GestaoEncomendas(){
        this.mapEncomendas = new TreeMap <Integer, EncEficiente>();
    }

    public GestaoEncomendas(TreeMap <Integer, EncEficiente> mapEncomendas){
        this.setMapEncomendas(mapEncomendas);
    }

    public GestaoEncomendas(GestaoEncomendas myGestaoEncomendas){
        this.setMapEncomendas(myGestaoEncomendas.getMapEncomendas());
    }

    public Map<Integer, EncEficiente> getMapEncomendas(){
        return this.mapEncomendas.entrySet().stream().collect(Collectors.toMap(e -> e.getKey(), e -> e.getValue().clone()));
    }

    public void setMapEncomendas(Map<Integer, EncEficiente> Encomendas){
        this.mapEncomendas = Encomendas.entrySet().stream().collect(Collectors.toMap(e -> e.getKey(), e -> e.getValue().clone(), (a,b) -> b, TreeMap::new));
    }

    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null || this.getClass() != o.getClass()) return false;
        GestaoEncomendas that = (GestaoEncomendas) o;
        return this.mapEncomendas.equals(that.mapEncomendas);
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("\nEncomendas:\n");
        sb.append(this.mapEncomendas.toString());
        sb.append("\n");
        return sb.toString();
    }

    public GestaoEncomendas clone(){
        return new GestaoEncomendas(this);
    }

    public Set<Integer> todosCodigosEnc(){
        return this.mapEncomendas.keySet();
    }

    public void addEncomenda(EncEficiente enc){
        this.mapEncomendas.put(enc.getNumero_enc(), enc);
    }

    public EncEficiente getEncomenda(Integer codEnc){
        return this.mapEncomendas.get(codEnc);
    }

    public void removeEncomenda(Integer codEnc){
        this.mapEncomendas.remove(codEnc);
    }

    public Integer encomendaComMaisProdutos(){
        return this.mapEncomendas.entrySet().stream()
                .max((e1, e2) -> e1.getValue().getEncomendas().size() - e2.getValue().getEncomendas().size())
                .get().getKey();
    }

    public Set<Integer> encomendasComProduto(String codProd){
        return this.mapEncomendas.entrySet().stream()
                .filter(e -> e.getValue().getEncomendas().stream().anyMatch(prod -> prod.getReferencia() == codProd))
                .map(e -> e.getKey()).collect(Collectors.toSet());
    }

    public Set<Integer> encomendasAposData(LocalDate d){
        return this.mapEncomendas.entrySet().stream()
                .filter(e -> e.getValue().getData().isAfter(d))
                .map(e -> e.getKey()).collect(Collectors.toSet());
    }

}