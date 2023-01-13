package Heranca;

public class RevisaoClasse1<T> {
    
    private T nome, estado;

    public RevisaoClasse1(){

    }

    public T getNome(){
        return this.nome;
    }

    public void setNome(T nome){
        this.nome = nome;
    }

    public T getEstado(){
        return this.estado;
    }

    public void setEstado(T estado){
        this.estado = estado;
    }

    public void status(){
        System.out.printf("O nome é -> %s %n", this.getNome());
        System.out.printf("O personagem se encontra -> %s %n", this.getEstado());
    }
}
