public class Telemovel {
    
    private String marca;
    private String modelo;
    private String display;
    private String[] mensagens_armaz;
    private int fotos_app_armaz;
    private int fotos_armaz;
    private int app_armaz;
    private int espaco_ocupado;
    private int numero_fotos;
    private int numero_apps;
    private String[] nome_apps;

    /**construtor por omissão de Telemovel
     * 
     */
    public Telemovel(){
        this.marca = "";
        this.modelo = "";
        this.display = "";
        this.mensagens_armaz = new String[10];
        this.fotos_app_armaz = 0;
        this.fotos_armaz = 0;
        this.app_armaz = 0;
        this.espaco_ocupado = 0;
        this.numero_fotos = 0;
        this.numero_apps = 0;
        this.nome_apps = new String[0];
    }
    /**construtor parametrizado de Telemovel
     * 
     */
    public Telemovel(String marca, String modelo, String display, String[] mensagens_armaz, int fotos_app_armaz, int fotos_armaz, int app_armaz, int espaco_ocupado, int numero_fotos, int numero_apps, String[] nome_apps){
        this.marca = marca;
        this.modelo = modelo;
        this.display = display;
        this.mensagens_armaz = mensagens_armaz;
        this.fotos_app_armaz = fotos_app_armaz;
        this.fotos_armaz = fotos_app_armaz;
        this.app_armaz = app_armaz;
        this.espaco_ocupado = espaco_ocupado;
        this.numero_fotos = numero_fotos;
        this.numero_apps = numero_apps;
        this.nome_apps = nome_apps;
    }
    /**construtor de cópia de Telemovel
     * 
     */
    public Telemovel(Telemovel tl){
        this.marca = tl.getMarca();
        this.modelo = tl.getModelo();
        this.display = tl.getDisplay();
        this.mensagens_armaz = tl.getMensagens_armaz();
        this.fotos_app_armaz = tl.getFotos_app_armaz();
        this.fotos_armaz = tl.getFotos_armaz();
        this.app_armaz = tl.getApp_armaz();
        this.espaco_ocupado = tl.getEspaco_ocupado();
        this.numero_fotos = tl.getNumero_fotos();
        this.numero_apps = tl.getNumero_apps();
        this.nome_apps = tl.getNome_apps();
    }

    public String getMarca(){
        return this.marca;
    }
    public String getModelo(){
        return this.modelo;
    }
    public String getDisplay(){
        return this.display;
    }
    public String[] getMensagens_armaz(){
        return this.mensagens_armaz;
    }
    public int getFotos_app_armaz(){
        return this.fotos_app_armaz;
    }
    public int getFotos_armaz(){
        return this.fotos_armaz;
    }
    public int getApp_armaz(){
        return this.app_armaz;
    }
    public int getEspaco_ocupado(){
        return this.espaco_ocupado;
    }
    public int getNumero_fotos(){
        return this.numero_fotos;
    }
    public int getNumero_apps(){
        return this.numero_apps;
    }
    public String[] getNome_apps(){
        return this.nome_apps;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public void setDisplay(String display){
        this.display = display;
    }
    public void setMensagens_armaz(String[] mensagens_armaz){
        this.mensagens_armaz = mensagens_armaz;
    }
    public void setFotos_app_armaz(int fotos_app_armaz){
        this.fotos_app_armaz = fotos_app_armaz;
    }
    public void setFotos_armaz(int fotos_armaz){
        this.fotos_armaz = fotos_armaz;
    }
    public void setApp_armaz(int app_armaz){
        this.app_armaz = app_armaz;
    }
    public void setEspaco_ocupado(int espaco_ocupado){
        this.espaco_ocupado = espaco_ocupado;
    }
    public void setNumero_fotos(int numero_fotos){
        this.numero_fotos = numero_fotos;
    }
    public void setNumero_apps(int numero_apps){
        this.numero_apps = numero_apps;
    }
    public void setNome_apps(String[] nome_apps){
        this.nome_apps = nome_apps;
    }

    public boolean existeEspaco(int numeroBytes){
        if(numeroBytes + this.getEspaco_ocupado() <= this.getFotos_app_armaz()) return true;
        return false;
    }

    public void instalaApp(String nome, int tamanho){
        if(this.getEspaco_ocupado() + tamanho <= this.getApp_armaz()){
            this.setEspaco_ocupado(tamanho + this.getEspaco_ocupado());
            this.setNumero_apps(1 + this.getNumero_apps());
            
            int inserido = 0;
            for(int i = 0; i<this.getNome_apps().length; i++){
                if(this.getNome_apps()[i] == null){
                    inserido = 1;
                    this.getNome_apps()[i] = nome;
                    break;
                }
            }
            if(inserido == 0){
                String[] new_array = new String[this.getNome_apps().length + 1];
                for(int i = 0; i<this.getNome_apps().length; i++){
                    new_array[i] = this.getNome_apps()[i];
                }
                new_array[this.getNome_apps().length] = nome;
                this.setNome_apps(new_array);
            }

        }
    }

    public void recebeMsg(String msg){
        int inserido = 0;
        for(int i = 0; i<this.getMensagens_armaz().length; i++){
            if(this.getMensagens_armaz()[i] == null){
                inserido = 1;
                this.getMensagens_armaz()[i] = msg;
                break;
            }
        }
        if(inserido == 0){
            String[] new_array = new String[this.getMensagens_armaz().length + 1];
            for(int i = 0; i<this.getMensagens_armaz().length; i++){
                new_array[i] = this.getMensagens_armaz()[i];
            }
            new_array[this.getMensagens_armaz().length] = msg;
            this.setMensagens_armaz(new_array);
        }
    }

    public double tamMedioApps(){
        return (this.getEspaco_ocupado() / this.getNumero_apps());
    }

    public String maiorMsg(){
        String maior = "";
        for(int i = 0; i<this.getMensagens_armaz().length; i++){
            if(this.getMensagens_armaz()[i].length() >= maior.length()) maior = this.getMensagens_armaz()[i];
        }
        return maior;
    }

    public void removeApp(String nome, int tamanho){
        int encontrado = 0;
        for(int i = 0; i<this.getNome_apps().length; i++){
            if(this.getNome_apps()[i].equals(nome)){
                encontrado = 1;
                break;
            }
        }
        if(encontrado == 1){
            this.setEspaco_ocupado(this.getEspaco_ocupado() - tamanho);
            String[] new_array = new String[this.getNome_apps().length -1];
            for(int i = 0, k = 0; i<this.getNome_apps().length; i++){
                if(this.getNome_apps()[i].equals(nome)) continue;
                else{
                    new_array[k] = this.getNome_apps()[i];
                    k++;
                }
            }
            this.setNome_apps(new_array);
        }
    }

}