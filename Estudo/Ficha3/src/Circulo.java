public class Circulo {

    private double x;
    private double y;
    private double raio;

    public double getX(){
        return this.x;
    }
    public double getY(){
        return this.y;
    }
    public double getRaio(){
        return this.raio;
    }

    /**construtor por omissão de Circulo
     * 
     */
    public Circulo(){
        this.x = 0;
        this.y = 0;
        this.raio = 0;
    }

    /**construtor parametrizado de Circulo
     * 
     */
    public Circulo(double cx, double cy, double craio){
        this.x = cx;
        this.y = cy;
        this.raio = craio;
    }

    /**construtor de cópia de Circulo
     * 
     */
    public Circulo(Circulo c){
        this.x = c.getX();
        this.y = c.getY();
        this.raio = c.getRaio();
    }

    public void setX(double x){
        this.x = x;
    }
    public void setY(double y){
        this.y = y;
    }
    public void setRaio(double raio){
        this.raio = raio;
    }

    public void alteraCentro(double x, double y){
        this.setX(x);
        this.setY(y);
    }

    public double calculaArea(){
        return Math.pow(this.getRaio(), 2) * Math.PI;
    }

    public double calculaPerimetro(){
        return 2 * Math.PI * this.getRaio();
    }

}