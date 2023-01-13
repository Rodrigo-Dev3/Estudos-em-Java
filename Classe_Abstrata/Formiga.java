package Classe_Abstrata;

public class Formiga extends Animal{
    
    private Boolean vivo;
    
    public Formiga(int velocidade, int massa, int forca){
        super(velocidade, massa, forca);
        this.vivo = true;
    }

    
}
