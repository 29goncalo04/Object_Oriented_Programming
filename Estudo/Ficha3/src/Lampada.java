public class Lampada {
    
    private boolean ligada;
    private boolean desligada;
    private boolean modo_eco;
    private int consumo;

    /**construtor por omissão de Lampada
     * 
     */
    public Lampada(){
        this.ligada = false;
        this.desligada = true;
        this.modo_eco = false;
        this.consumo = 0;
    }
    /**construtor parametrizado de Lampada
     * 
     */
    public Lampada(boolean ligada, boolean desligada, boolean modo_eco, int consumo){
        this.ligada = ligada;
        this.desligada = desligada;
        this.modo_eco = modo_eco;
        this.consumo = consumo;
    }
    /**construtor de cópia de Lampada
     * 
     */
    public Lampada(Lampada umaLampada){
        this.ligada = umaLampada.getLigada();
        this.desligada = umaLampada.getDesligada();
        this.modo_eco = umaLampada.getModo_eco();
        this.consumo = umaLampada.getConsumo();
    }

    public boolean getLigada(){
        return this.ligada;
    }
    public boolean getDesligada(){
        return this.desligada;
    }
    public boolean getModo_eco(){
        return this.modo_eco;
    }
    public int getConsumo(){
        return this.consumo;
    }
    public void setLigada(boolean ligada){
        this.ligada = ligada;
    }
    public void setDesligada(boolean desligada){
        this.desligada = desligada;
    }
    public void setModo_eco(boolean modo_eco){
        this.modo_eco = modo_eco;
    }
    public void setConsumo(int consumo){
        this.consumo = consumo;
    }

    public void lampON(){
        this.setLigada(true);
        this.setDesligada(false);
        this.setModo_eco(false);
    }

    public void lampOFF(){
        this.setLigada(false);
        this.setDesligada(true);
        this.setModo_eco(false);
    }

    public void lampECO(){
        this.setLigada(true);
        this.setDesligada(false);
        this.setModo_eco(true);
    }

    //public double totalConsumo()
    //public double periodoConsumo()

}