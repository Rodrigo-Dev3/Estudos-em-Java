package EstruturaDeDados;

public class Atribuicao {
    
    //Ainda falta conhecer o que é "Integer" e também o "Override toString()"
    //Mas para o exemplo estar correto, usei como foi passado na aula
    
    Integer numero3;

    public Atribuicao(int numero3){

        this.numero3 = numero3;

    }

    public void setNumero3(int numero3){

        this.numero3 = numero3;
    }

    @Override
    public String toString(){
        return this.numero3.toString();
    }
}
