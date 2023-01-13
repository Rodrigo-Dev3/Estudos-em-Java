package GetESet;

public class Jogador {
    
    private final int numeroVidasMax = 5;

    private String nome;
    private int numeroVidas;
    private int ganhaVida;

    static boolean alerta = false;
    static int quantidadeJogadores = 0;
    static int pontosJogadores = 0; //cria um sistemas de pontos que será válido para todos os jogadores (ambito global)
    

    public Jogador(){

        quantidadeJogadores++; //Como estão acessando o esmo lugar na memória, quando eu incrementar em um, todos os objetos que estão utilizando esse atributo tbm terão valor acrescentado
    }

    public String GetNome(){

        return this.nome;
    }

    public void SetNome(String nome){

        this.nome = nome;
    }

    public int GetNumeroVidas(){

        return this.numeroVidas;
    }

    public void SetNumeroVidas(int numeroVidas){

        if(numeroVidas > numeroVidasMax){
            this.numeroVidas = numeroVidasMax;
            System.out.printf("O limite de vidas foi ultrapassado. Suas vidas totais são -> ");
        }
        else{
            this.numeroVidas = numeroVidas;    
        }
    }

    public int GetGanhaVida(){

        return this.ganhaVida;
    }

    public void SetGanhaVida(){
        if(numeroVidas < numeroVidasMax ){
            numeroVidas++;
        }

    }

    public void SetPerdeVida(){
        if(numeroVidas > 0){
            numeroVidas--;
        }
    }

    public void informacaoJogador(){

        System.out.printf("\nNome => %s %n", this.nome);
        System.out.printf("Vidas => %d %n", this.numeroVidas);
        System.out.printf("Alerta => %s %n", alerta ? "Jogador criado com sucesso" : "Não foi possível criar o jogador"); //Não uso o this pois é STATIC
        System.out.printf("Quantidade de jogadores => %s %n", quantidadeJogadores);
        System.out.printf("Total de pontos dos jogadores => %d", pontosJogadores);
    }

    static void pontosJogadores(){

        pontosJogadores += 5;
    }


}
