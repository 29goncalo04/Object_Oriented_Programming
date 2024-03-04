public class Sensor {
    
    private double valor;

    /**construtor por omissão de Sensor
     * 
     */
    public Sensor(){
        this.valor = 0;
    }
    /**construtor parametrizado de Sensor
     * 
     */
    public Sensor(double valor){
        this.valor = valor;
    }

    public boolean setPressao(double valor){
        if(valor < 0) return false;
        this.valor = valor;
        return true;
    }

    public double getPressao(){
        return this.valor;
    }

}