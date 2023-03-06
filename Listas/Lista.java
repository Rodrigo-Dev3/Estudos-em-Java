package Listas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Lista {
    public static void main(String[] args) {
        
        List<String> novaLista = new ArrayList<>();

        novaLista.add("João");
        novaLista.add("Pedro");
        novaLista.add("Ana");

        //Adiciona um elemento na posição desejada, nesse caso a 1- sem prejudir as demais posições da lista
        novaLista.add(1, "Fred");

        for(String nomes : novaLista){
            System.out.println(nomes);
         }


        //Operações possíveis em uma list

        //Para saber o tamanho da list
        novaLista.size();

        // Para obter o elemento de uma posição
        novaLista.get(0);

        // //Para inserir elementos
        novaLista.add("Carlos");

        //Para remover elementos
        novaLista.remove(novaLista); //remove objeto
        novaLista.remove(2); //por posição
        //novaLista.removeIf(null); //Utiliza predicado (função lambda) para exclusão
        novaLista.removeIf(x -> x.charAt(0) == 'J');

        // //Para encontrar posição do elemento
        novaLista.indexOf("João"); //primeira ocorrência
        novaLista.lastIndexOf("João"); // última ocorrência


        //Filtrar a lista com base em predicado (função lambda)
        //É preciso converter em tipo stream e filtrar utilizando lambada, porém, é preciso cconverter o resultado no tipo list novamente utilizando o collect
        List<String> resultado = novaLista.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
        for(String x : resultado){
            System.out.println(x);
        }
        
        //Encontrar a primeira ocorrência com base em predicado
        String resultado2 = novaLista.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
        System.out.println(resultado2);
    }
}
