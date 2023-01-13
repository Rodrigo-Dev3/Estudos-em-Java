package _Praticando;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Principal {
    
    public static void main(String[] args){

        //System.out.printf("Há personagens criados? %s%n", Personagem.alerta ? "Há personagens criados na tela!" : "Não há personagens criados ainda. Crie-os!");

        Pattern pattern = Pattern.compile("Rodrigo", Pattern.CASE_INSENSITIVE);

        Matcher matcher = pattern.matcher("Você é muito bem-vindo Rodrigo!");

        boolean matchFound = matcher.find();

        if(matchFound == true){
            System.out.println("O padrão de pesquisa foi encontrado!");
        }
        else{
            System.out.println("O padrão de pesquisa não foi encontrado!");
        }

        String matcherAlterado = matcher.replaceAll("João");
        System.out.printf(matcherAlterado);


        
    }

}
