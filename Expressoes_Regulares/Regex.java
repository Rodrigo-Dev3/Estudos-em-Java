package Expressoes_Regulares;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    
    public static void main(String[] args){


        Pattern pattern = Pattern.compile("Rodrigo", Pattern.CASE_INSENSITIVE);

        Matcher matcher = pattern.matcher("Você é muito bem-vindo Rodrigo!");

        boolean matchFound = matcher.find();

        if(matchFound == true){
            System.out.println("O padrão de pesquisa foi encontrado!");
        }
        else{
            System.out.println("O padrão de pesquisa não foi encontrado!");
        }

        //Substituindo a string 'Rodrigo' pela string 'João'
        String matcherAlterado = matcher.replaceAll("João");
        System.out.printf(matcherAlterado);


        
    }

}
