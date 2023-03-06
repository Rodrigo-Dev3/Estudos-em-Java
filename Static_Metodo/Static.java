package Static_Metodo;

public class Static {

    public static void main(String[] args){

    

    Jogador novoJogador01 = new Jogador();
    
    novoJogador01.GetNome();

    novoJogador01.SetNome("Juninho Pernanbucano");
    novoJogador01.SetNumeroVidas(5);

    novoJogador01.informacaoJogadores();


    System.out.println(ClasseStatic.mostrarMensagemBoasVindas(novoJogador01.GetNome()));



    Jogador novoJogador02 = new Jogador();
    
    novoJogador02.SetNome("João");
    novoJogador02.SetNumeroVidas(10);

    novoJogador02.informacaoJogadores();

    }
    
}
