package Classe_Abstrata;

abstract class Animal implements SerVivo{
    
    private Boolean vivo;
    private int massa;
    private int eixoX;
    private int eixoY;
    private int velocidade;
    private int forca;

    public Animal(int velocidade, int massa, int forca){
        this.vivo = true;
        this.massa = massa;
        this.eixoX = 0;
        this.eixoY = 0;
        this.forca = forca;
        this.velocidade = velocidade;
    }

    public void setVivo(Boolean vivo){this.vivo = vivo;}

    public Boolean getVivo(){return this.vivo;}

    public void setMassa(int massa){this.massa = massa;}

    public int getMassa(){return this.massa;}

    public void setEixoX(int eixoX){this.eixoX = eixoX;}

    public int getEixoX(){return this.eixoX;}

    public void setEixoY(int eixoY){this.eixoY = eixoY;}

    public void setForca(int forca){this.forca = forca;}

    public int getForca(){return this.forca;}

    //Aqui, é inserido como atributo de entrada um outro objeto do tipo 'Animal' - um animal irá atacar outro objeto do tipo 'Animal'
    public void atacar(Animal a){
        if(this.vivo){
            if(this.forca > a.forca){
                this.forca += a.getMassa();
                a.vivo = false; //o animal nesse caso que sofreu o ataque morre
            }else{
                this.vivo = false; //se não for maior o animal que atacar morre
            }
        }else{
            System.out.println("-------------------------------------------");
            System.out.println(this.getClass().toGenericString() + "está morto, não pode atacar");
            System.out.println("-------------------------------------------");
        }
    }

    public void mover(){
        if(this.vivo){
            this.eixoX += this.velocidade;
            this.eixoY += this.velocidade;
        }
    }; 
    
    public void comer(int massa){
        if(this.vivo){
            this.forca += massa;
        }else{
            System.out.println("-------------------------------------------");
            System.out.println(this.getClass().toGenericString() + "está morto, não pode comer");
            System.out.println("-------------------------------------------");
        }
    };
    
    public void informacoes(){
        System.out.println("-------------------------------------------");
        System.out.printf("Tipo: %s%n", getClass().toString());
        System.out.printf("Vivo: %s%n", getVivo() ? "sim" : "não");
        System.out.printf("Massa: %d%n", this.massa);
        System.out.printf("Velocidade: %d%n", this.velocidade);
        System.out.printf("Forca: %s%n", this.getForca());
        System.out.println("-------------------------------------------");
    };
}
