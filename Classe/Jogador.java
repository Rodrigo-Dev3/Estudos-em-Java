package Classe;

public class Jogador {

    public String nome;
    public String clube;
    public int idade;


    public Jogador(String nome, String clube, int idade){
        this.nome = nome;
        this.clube = clube;
        this.idade = idade;

    }
    
    public void fezGol(){
        System.out.printf("O jogador %s fez um gol!", this.nome);
    }

    public void naoFezGol(){
        System.out.println("O jogador não fez gol nesta partida!");
    }
}
