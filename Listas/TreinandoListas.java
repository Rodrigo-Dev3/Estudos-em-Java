package Listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class TreinandoListas {
    public static void main(String[] args) {
        
        
        List<String> nomes = new ArrayList<>();

        int sair = 1;
        Scanner scan = new Scanner(System.in);
        String resposta;
        
        do{
            System.out.print("Adicione um nome: ");
            resposta = scan.nextLine();
            nomes.add(resposta);

            System.out.print("0 - Sair ou 1 - Continuar? ");
            sair = scan.nextInt();
            scan.nextLine();

        }while(sair != 0);


        System.out.print("Sua lista de nomes: \n");
        for(String nome : nomes){
            System.out.println(nome);
        }

        System.out.print("Digite a letra desejada para pesquisa: ");
        char respostaChar = scan.nextLine().charAt(0);
    
        List<String> resultadoPesquisa = nomes.stream().filter(x -> x.charAt(0) == respostaChar).collect(Collectors.toList());
        System.out.print("Sua lista de nomes: \n");
        for(String nome : resultadoPesquisa){
            System.out.println(nome);
        }
    }
}
