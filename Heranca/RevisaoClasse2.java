package Heranca;

public class RevisaoClasse2<T> extends RevisaoClasse1 {
    
    private T vida;

    public RevisaoClasse2(){



    }

    public T getVida(){
        return this.vida;
    }

    public void setVida(T vida){
        this.vida = vida;
    }

    public void statusCompleto(){
        super.status();
        System.out.printf("A vida do seu personagem é de -> %s", this.getVida());
    }
}
