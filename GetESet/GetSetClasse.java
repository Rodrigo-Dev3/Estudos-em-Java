package GetESet;

public class GetSetClasse {
    
    private final int maxNumero = 5;
    private String nome;
    private int numero;

    public GetSetClasse(String nome){
        this.nome = nome;
    }


    public String GetNome(){

        return this.nome;
    }

    public void SetNome(String nome){

        this.nome = nome;
    }

    public int GetNumero(){

        return this.numero;
    }

    public void SetNome(int numero){

        if(numero > maxNumero){
            this.numero = maxNumero;
        }else{
            this.numero = numero;
        }
    }
}
