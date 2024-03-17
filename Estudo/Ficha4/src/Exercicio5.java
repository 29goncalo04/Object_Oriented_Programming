import java.time.LocalDateTime;
import java.util.ArrayList;

public class Exercicio5 {
    public static void main(String[] args){
        LocalDateTime data1 = LocalDateTime.of(2024, 3, 1, 18, 0); // 1/3/2024 às 18:00
        LocalDateTime data2 = LocalDateTime.of(2024, 3, 4, 18, 0); // 4/3/2024 às 18:00
        PedidodeSuporte pedido1 = new PedidodeSuporte("Gonçalo", data1, "Roubo", "Assalto", "PJ", LocalDateTime.now(), "Resolvido");
        PedidodeSuporte pedido2 = new PedidodeSuporte("António", data2, "Desaparecimento", "Desaparecido", "GNR", LocalDateTime.now(), "Resolvido");
        PedidodeSuporte pedido3 = new PedidodeSuporte("José", data1, "Furto", "Assalto", "PJ", data2, "Resolvido");
        ArrayList <PedidodeSuporte> pedidos = new ArrayList<PedidodeSuporte>();
        pedidos.add(pedido1);
        pedidos.add(pedido2);
        pedidos.add(pedido3);
        SistemadeSuporte sistema = new SistemadeSuporte(pedidos);

        //System.out.printf(sistema.toString());

        PedidodeSuporte pedido4 = new PedidodeSuporte("Gonçalo", data2, "Suicídio", "Familiar envolvente", "PJ", LocalDateTime.now(), "Resolvido");
        sistema.inserePedido(pedido4);
        //System.out.printf(sistema.toString());

        System.out.printf("O pedido criado por 'Gonçalo' no instante '4/3/2024T18:00' foi: " + sistema.procuraPedido("Gonçalo", data2).toString() + "\n\n");

        PedidodeSuporte pedido5 = new PedidodeSuporte("José", data1, "Avaria", "Avaria de carro", null, null, null);
        sistema.inserePedido(pedido5);
        sistema.resolvePedido(pedido5, "Mecânico", "Resolvido");
        System.out.printf("Pedido 5 atualizado após ser resolvido: " + sistema.getPedidos().get(4).toString() + "\n\n");

        System.out.printf("Casos resolvidos -> " + sistema.resolvidos().toString() + "\n\n");

        System.out.printf("O colaborador que resolveu mais casos foi: %s\n\n", sistema.colaboradorTop());

        System.out.printf("Os pedidos solucionados entre 4/3/2024 e o momento atual são: " + sistema.resolvidos(data2, LocalDateTime.now()).toString() + "\n\n");
    
        System.out.printf("O tempo médio de resolução dos pedidos em minutos é: %f\n\n", sistema.tempoMedioResolucao());

        System.out.printf("O tempo médio de resolução dos pedidos terminados entre 4/3/2024 e o momento atual em minutos é: %f\n\n", sistema.tempoMedioResolucao(data2, LocalDateTime.now()));

        System.out.printf("O pedido que demorou mais tempo a ser resolvido foi: %s\n\n", sistema.pedidoMaisLongo().toString());

        //System.out.printf(sistema.toString());

        System.out.printf("O pedido que demorou mais tempo a ser resolvido entre 4/3/2024 e o momento atual foi: %s\n\n", sistema.pedidoMaisLongo(data2, LocalDateTime.now()).toString());
    }
}