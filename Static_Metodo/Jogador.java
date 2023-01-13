package Static_Metodo;

public class Jogador {
    
    private String nome;
    private int numeroVidas;

    static int quantidadeJogadores = 0;

    public Jogador(){

        quantidadeJogadores++;
    }

    public String GetNome(){
        if(this.nome == null){
            System.out.printf("\nVocê ainda não definiu nenhum nome para esse jogador.\n");
        }
        return this.nome;
    }

    public void SetNome(String nome){

        this.nome = nome;
    }

    public int GetNumeroVidas(){

        return this.numeroVidas;
    }

    public void SetNumeroVidas(int numeroVidas){
        
        this.numeroVidas = numeroVidas;
    }

    public void informacaoJogadores(){
        System.out.printf("\n------------------------------------------\n");
        System.out.printf("\nNome => %s", this.nome);
        System.out.printf("\nVidas => %d", this.numeroVidas);
        System.out.printf("\nQuantidade de jogadores => %d", quantidadeJogadores);
        System.out.printf("\n------------------------------------------\n");

    }



}
