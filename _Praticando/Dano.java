package _Praticando;

public class Dano extends Personagem {
    
    private int danoLevePersonagem;
    private int danoPesadoPersonagem;
    public int resultadoDanoLeve;

    public Dano(){
        super.getNome();
        super.getVida();
    }

    public void setDanoLeve(int danoLevePersonagem){

        this.danoLevePersonagem = danoLevePersonagem;
    }

    public void setDanoPesado(int danoPesadoPersonagem){

        this.danoPesadoPersonagem = danoPesadoPersonagem;
    }


    public void acertaDanoLeve(){
        System.out.printf("Nome: %s %n", super.getNome());
        System.out.printf("Vida: %d %n", resultadoDanoLeve = super.getVida() - this.danoLevePersonagem);
    }
}
