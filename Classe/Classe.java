package Classe;

import java.util.Scanner;

public class Classe {
    
    public static void main(String[] args){
        
        Jogador novoJogador = new Jogador("João", "Internacional", 20);

        
        // System.out.printf("O nome do jogador é -> %s\n", novoJogador.nome);

        // System.out.printf("\nO clube do jogador é -> %s\n", novoJogador.clube);

        // System.out.printf("\nA idade do jogador é -> %d\n", novoJogador.idade);

        Scanner perguntaGol = new Scanner(System.in);
        int perguntaScannerGol;
        int quantidadeGols = 0;

        do{
            System.out.printf("O jogador %s fez gol nesta partida? [1] para SIM e [2] para NÃO =>  ", novoJogador.nome);
            perguntaScannerGol = perguntaGol.nextInt();
    
            if(perguntaScannerGol == 1){
                novoJogador.fezGol();
                System.out.println("   ");
                quantidadeGols += 1;
            }
            else if(perguntaScannerGol == 2){
                novoJogador.naoFezGol();
            }
           
            System.out.print("\nDeseja continuar? [1] para SIM e [0] para NÃO => ");
            perguntaScannerGol = perguntaGol.nextInt();

        }while(perguntaScannerGol != 0);

        System.out.printf("%s fez %d gols nessa partida!", novoJogador.nome, quantidadeGols);
    }

  
}
