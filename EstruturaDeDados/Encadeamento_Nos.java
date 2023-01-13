package EstruturaDeDados;

public class Encadeamento_Nos {
    
    private String conteudo;
    private Encadeamento_Nos proximoNo;

    public Encadeamento_Nos(String conteudo){
        this.proximoNo = null; //Caso não seja setado, o valor do 'proximoNo' ficará como null
        this.conteudo = conteudo;

    }

    public String getConteudo(){

        return this.conteudo;
    }

    public void setConteudo(String conteudo){

        this.conteudo = conteudo;
    }

    public Encadeamento_Nos getProximoNo(){

        return this.proximoNo;
    }

    public void setProximoNo(Encadeamento_Nos proximoNo){

        this.proximoNo = proximoNo;
    }

    @Override
    public String toString(){
        return "Nó {" + "conteudo = " + conteudo + '\'' + "}";
    }



}
