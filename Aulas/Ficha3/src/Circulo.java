public class Circulo {

    private double x;
    private double y;
    private double raio;

    public Circulo(){
        this.x = 0.0;
        this.y = 0.0;
        this.raio = 0.0;
    }

    public Circulo(double x, double y, double raio){
        this.x = x;
        this.y = y;
        this.raio = raio;
    }

    public Circulo(Circulo umCirculo){
        this.x = umCirculo.getX();
        this.y = umCirculo.getY();
        this.raio = umCirculo.getRaio();
    }

    public double getX(){
        return this.x;
    }
    public double getY(){
        return this.y;
    }
    public double getRaio(){
        return this.raio;
    }
    public void setX(double x){
        this.x = x;
    }
    public void setY(double y){
        this.y = y;
    }
    public void setRaio(double Raio){
        this.raio = Raio;
    }

    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null || this.getClass() != o.getClass()) return false; 
        Circulo c1 = (Circulo) o;
        return (this.x == c1.getX() && this.y == c1.getY() && this.raio == c1.getRaio());
    }

    public String toString(){
        return "Circulo.x: " + this.getX() + "Circulo.y: " + this.getY() + "Circulo.raio: " + this.getRaio(); 
    }

    public Circulo clone(){
        return new Circulo(this);
    }

    public void posicao(double x, double y){
        this.setX(x);
        this.setY(y);
    }

    public double calculaArea(){
        return Math.pow(this.raio, 2)*Math.PI;
    }

    public double perimetro(){
        return this.raio*2*Math.PI;
    }
}
