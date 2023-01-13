package Classe_Abstrata;

public class Vegetal {

    private Boolean vivo;
    private int massa;

    public Vegetal(int massa){
        this.vivo = true;
        this.massa = massa;
    }


    public int getMassa(){return this.massa;}

    public void setVivo(Boolean vivo){this.vivo = vivo;}


    // public void informacoes(){
    //     System.out.println("-------------------------------------------");
    //     System.out.printf("Tipo: %s%n", getClass().toString());
    //     System.out.printf("Vivo: %s%n", getVivo() ? "sim" : "não");
    //     System.out.printf("Massa: %d%n", this.massa);
    //     System.out.printf("Velocidade: %d%n", this.velocidade);
    //     System.out.printf("Forca: %d%n", getClass().toString());
    //     System.out.println("-------------------------------------------");
    // };
}
