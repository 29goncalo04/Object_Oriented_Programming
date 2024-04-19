public class App {
    public static void main(String[] args) {
        Circulo c1 = new Circulo();
        System.out.println(c1.toString());
        c1.setRaio(5);
        System.out.println(c1.toString());
        System.out.println("Área: " + c1.calculaArea());
    }
}
