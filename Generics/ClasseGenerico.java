package Generics;

public class ClasseGenerico<T> {

    private T mensagem;

    public ClasseGenerico(){


    }

    public T getMensagem(){
        return this.mensagem;
    }

    public void setMensagem(T mensagem){
        this.mensagem = mensagem;
    }

    // public void mostrarMensagem(){

    //     System.out.printf("A mensagem escolhida foi -> %s", this.getMensagem());

    // }
    
}
