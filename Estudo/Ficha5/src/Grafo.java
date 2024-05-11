import java.util.stream.Collectors;
import java.util.*;


public class Grafo {

    private Map <Integer, Set<Integer>> adj ;

    public Grafo(){
        this.adj = new HashMap<Integer, Set<Integer>>();
    }

    public Grafo(Map<Integer, Set<Integer>> adj2){
        this.adj = adj2.entrySet().stream()
                .collect(Collectors.toMap(v -> v.getKey(), e -> new HashSet<>(e.getValue())));
    }

    public Map <Integer, Set<Integer>> getAdj(){
        return this.adj.entrySet().stream()
                .collect(Collectors.toMap(v -> v.getKey(), e -> new HashSet<>(e.getValue())));
    }

    void addArco(Integer vOrig, Integer vDest){
        this.adj.putIfAbsent(vOrig, new HashSet<>());
        this.adj.putIfAbsent(vDest, new HashSet<>());
        this.adj.get(vOrig).add(vDest);
    }

    boolean isSink(Integer v){
        return this.adj.containsKey(v) && this.adj.get(v).isEmpty();
    }

    boolean isSource(Integer v){
        return this.adj.containsKey(v) && !this.adj.values().stream().anyMatch(e -> e.contains(v));
    }

    int size(){
        return this.adj.size() + this.adj.values().stream().mapToInt(e -> e.size()).sum();
    }

    boolean haCaminho(Integer vOrig, Integer vDest){
        return this.adj.containsKey(vOrig) && (this.adj.get(vOrig).stream().anyMatch(e -> haCaminho(e, vDest)));
    }

    List<Integer> getCaminho(Integer vOrig, Integer vDest){
        if(!this.adj.containsKey(vOrig)) return null;
        if(vOrig.equals(vDest)){
            List<Integer> l = new ArrayList<>();
            l.add(vOrig);
            return l;
        }
        for(Integer n : this.adj.get(vOrig)){
            if(haCaminho(n, vDest)){
                List<Integer> l = getCaminho(n, vDest);
                l.add(0, vOrig);
                return l;
            }
        }
        return null;
    }

}