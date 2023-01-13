import java.util.Scanner;

import javax.print.event.PrintEvent;

public class Arrays{
    public static void main(String[] args){
        
        //Um programa que lê a resposta do aluno, percorre o array com o gabarito e diz se acertou ou não e a nota

        char[] gabaritoProva = {'a', 'c', 'd', 'a', 'b'}; //Criei um array com o gabarito
        char[] respostasAluno = new char[5]; //Inicializei um novo array para incluir as respostas do aluno
        Scanner respostaAlunoScan = new Scanner(System.in); //Criei um scanner para pegar as respostas do aluno

        int nota = 0;

        //Declara o contador "questão" dentro do laço for para garantir que ela seja usada somente nesse escopo
        for(int questao = 0; questao < 5; questao++){
            System.out.printf("Digite a sua resposta para a questão %d: ", questao);
            respostasAluno[questao] = respostaAlunoScan.nextLine().charAt(0);
            if(respostasAluno[questao] == gabaritoProva[questao]){
                System.out.print("Você acertou! +1 ponto\n");
                nota++;
            }
            else {
                System.out.println("Você errou!");
                nota--;
            }
        }
        

        if(nota > 1){
            System.out.printf("Você ganhou %d pontos", nota);
        }
        else if(nota == 1){
            System.out.println("Você ganhou apenas 1 ponto.");
        } 
        else{
            System.out.printf("Você errou e ficou com nota negativa. Sua nota foi -> %d", nota);
        }
    }
}