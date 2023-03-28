package Metodos_Abstratos;

public abstract class Forma {
    
    private CorEnum cor;


    public Forma() {
    }

    public Forma(CorEnum cor) {
        this.cor = cor;
    }


    public CorEnum getCor() {
        return this.cor;
    }

    public void setCor(CorEnum cor) {
        this.cor = cor;
    }


    public abstract double Area(); //Método abstrato para que possa ser implementado nas subclasses
}
