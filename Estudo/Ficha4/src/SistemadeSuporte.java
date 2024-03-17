import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.time.temporal.ChronoUnit;

public class SistemadeSuporte {
 
    private ArrayList <PedidodeSuporte> pedidos;

    public SistemadeSuporte(){
        this.pedidos = new ArrayList<PedidodeSuporte>();
    }
    public SistemadeSuporte(ArrayList <PedidodeSuporte> pedidos){
        this.setPedidos(pedidos);
    }
    public SistemadeSuporte(SistemadeSuporte mySistemadeSuporte){
        this.setPedidos(mySistemadeSuporte.getPedidos());
    }
    public ArrayList <PedidodeSuporte> getPedidos(){
        return this.pedidos;
    }
    public void setPedidos(ArrayList <PedidodeSuporte> pedidos){
        this.pedidos = new ArrayList<PedidodeSuporte>();
        for(PedidodeSuporte l : pedidos){
            this.pedidos.add(l.clone());
        }
    }
    public SistemadeSuporte clone(){
        return new SistemadeSuporte(this);
    }
    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null || this.getClass() != o.getClass()) return false;
        SistemadeSuporte that = (SistemadeSuporte) o;
        return this.pedidos.equals(that.pedidos);
    }
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Sistema de suporte::{\n");
        sb.append(this.getPedidos().toString());
        sb.append("}\n");
        return sb.toString();
    }

    public void inserePedido(PedidodeSuporte pedido){
        this.getPedidos().add(pedido);
    }

    public PedidodeSuporte procuraPedido(String user, LocalDateTime data){
        PedidodeSuporte res = new PedidodeSuporte();
        for(PedidodeSuporte l : this.getPedidos()){
            if(user.equals(l.getAutor()) && data.equals(l.getSubmetido())) return l.clone();
        }
        return res;
    }

    public void resolvePedido(PedidodeSuporte pedido, String tecnico, String info){
        int id = 0;
        for(PedidodeSuporte l: this.getPedidos()){
            if(pedido.equals(l)){
                PedidodeSuporte novo = new PedidodeSuporte(l);
                novo.setSolucionador(tecnico);
                novo.setConcluido(LocalDateTime.now());
                novo.setInformacao(info);
                this.getPedidos().set(id, novo);
                break;
            }
            id++;
        }
    }

    public List<PedidodeSuporte> resolvidos(){   //com iterador externo
        List <PedidodeSuporte> res = new ArrayList <PedidodeSuporte>();
        Iterator<PedidodeSuporte> iterator = this.getPedidos().iterator();
        while(iterator.hasNext()){
            PedidodeSuporte pedido = iterator.next();
            if(pedido.getInformacao().equals("Resolvido")) res.add(pedido.clone());
        }
        return res;
    }

    public String colaboradorTop(){    //com iterador externo
        int max = 0;
        String res = this.getPedidos().get(0).getSolucionador();
        for(int i = 0; i<this.getPedidos().size(); i++){
            int contador = 0;
            Iterator<PedidodeSuporte> iterator = this.getPedidos().iterator();
            while(iterator.hasNext()){
                PedidodeSuporte pedido = iterator.next();
                if(pedido.getSolucionador().equals(this.getPedidos().get(i).getSolucionador())) contador++;
            }
            if(contador > max){
                max = contador;
                res = this.getPedidos().get(i).getSolucionador();
            }
        }
        return res;
    }

    public List<PedidodeSuporte> resolvidos(LocalDateTime inicio, LocalDateTime fim){  //com iterador externo
        List <PedidodeSuporte> res = new ArrayList<PedidodeSuporte>();
        Iterator<PedidodeSuporte> iterator = this.getPedidos().iterator();
        while(iterator.hasNext()){
            PedidodeSuporte pedido = iterator.next();
            if(pedido.getConcluido().isAfter(inicio) && pedido.getConcluido().isBefore(fim)) res.add(pedido.clone());
        }
        return res;
    }

    public double tempoMedioResolucao(){
        double res = 0;
        Iterator<PedidodeSuporte> iterator = this.getPedidos().iterator();
        while(iterator.hasNext()){
            PedidodeSuporte pedido = iterator.next();
            res += ChronoUnit.MINUTES.between(pedido.getSubmetido(), pedido.getConcluido());
        }
        return res / this.getPedidos().size();
    }

    public double tempoMedioResolucao(LocalDateTime inicio, LocalDateTime fim){
        double res = 0;
        for(PedidodeSuporte l : this.getPedidos()){
            if(l.getConcluido().isAfter(inicio) && l.getConcluido().isBefore(fim)) res += ChronoUnit.MINUTES.between(l.getSubmetido(), l.getConcluido());
        }
        return res / this.getPedidos().size();
    }

    public PedidodeSuporte pedidoMaisLongo(){
        long tempo = 0;
        PedidodeSuporte res = new PedidodeSuporte();
        for(PedidodeSuporte l : this.getPedidos()){
            if(ChronoUnit.NANOS.between(l.getSubmetido(), l.getConcluido()) > tempo){
                tempo = ChronoUnit.NANOS.between(l.getSubmetido(), l.getConcluido());
                res = l.clone();
            }
        }
        return res;
    }

    public PedidodeSuporte pedidoMaisLongo(LocalDateTime inicio, LocalDateTime fim){
        long tempo = 0;
        PedidodeSuporte res = new PedidodeSuporte();
        for(PedidodeSuporte l : this.getPedidos()){
            if(l.getConcluido().isAfter(inicio) && l.getConcluido().isBefore(fim)){
                if(ChronoUnit.NANOS.between(l.getSubmetido(), l.getConcluido()) > tempo){
                    tempo = ChronoUnit.NANOS.between(l.getSubmetido(), l.getConcluido());
                    res = l.clone();
                }
            }
        }
        return res;
    }

}