package Generics;


public class GenericClass<T>{

    private T conteudo;
    private GenericClass<T> proximoNo;

    public GenericClass(T conteudo){
        this.proximoNo = null; //Caso não seja setado, o valor do 'proximoNo' ficará como null
        this.conteudo = conteudo;

    }


    public T getConteudo(){

        return this.conteudo;
    }

    public void setConteudo(T conteudo){

        this.conteudo = conteudo;
    }

    public GenericClass<T> getProximoNo(){

        return this.proximoNo;
    }

    public void setProximoNo(GenericClass<T> proximoNo){

        this.proximoNo = proximoNo;
    }





    @Override
    public String toString(){
        return "Nó {" + "conteudo = " + conteudo + '\'' + "}";
    }


}