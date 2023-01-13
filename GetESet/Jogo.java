package GetESet;

public class Jogo {
    
    public static void main(String[] args){


        System.out.printf("\nAlerta => %s", Jogador.alerta ? "Há jogadores cadastrados\n" : "Não há jogadores cadastrados\n");

        //#region Jogador01
        Jogador jogador01 = new Jogador();

        System.out.printf("\n----------------------------\n");

        
        jogador01.SetNome("Pedro");

        if(jogador01.GetNome() != null){
            jogador01.alerta = true;
        }


        jogador01.informacaoJogador();

        System.out.printf("\n----------------------------\n");
        //#endregion

        //#region Jogador02
        Jogador jogador02 = new Jogador();

        System.out.printf("\n----------------------------\n");

        jogador02.SetNome("Marcos");
        jogador02.SetNumeroVidas(5);

        if(jogador02.GetNome() != null){
            jogador02.alerta = true;
        }

        jogador02.pontosJogadores();
        jogador02.informacaoJogador();

        System.out.printf("\n----------------------------\n");
        //#endregion

      
    }
}
