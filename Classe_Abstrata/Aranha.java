package Classe_Abstrata;

public class Aranha extends Animal{

    private Boolean vivo;
    private int veneno;

    public Aranha(int velocidade, int massa, int forca, int veneno){
        super(velocidade, massa, forca);
        this.vivo = true;
        this.veneno = veneno;
    }

    //Como a aranha possui veneno, pode-se sobrescrever o método atacar da classe pai e definir ele com o acréscimo do 'veneno'
    @Override
    public void atacar(Animal a){
        if(this.getVivo()){
            if(this.getForca() <= a.getForca()){
                this.setForca(this.getForca() + a.getMassa());
            }
            if((this.getForca() + this.veneno) > a.getForca()){
                this.setForca(this.getForca() + a.getMassa());
            }else{
                this.setVivo(false);
            }
        }else{
            System.out.println("-------------------------------------------");
            System.out.println(this.getClass().toGenericString() + "está morto, não pode atacar");
            System.out.println("-------------------------------------------");
        }
    }


    
}
