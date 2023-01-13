import java.lang.reflect.Array;
import java.security.Key;
import java.util.Arrays;

import javax.swing.JSpinner.NumberEditor;

public class MétodosArrays {
    public static void main(String[] args){

        //Métodos estudados
            //Sort() -> ordenar o array
            //Fill() -> preencher o array com valor específico
            //System.arraycopy() -> copiar um array para outro
            //Equals() -> comparar se dois arrays são iguais (tem os mesmos valores) (retorna valores booleanos)
            //Binary.Search() -> verificar se há um elemento em um array (retorna valores booleanos) - requer números ordenados

        //Laço for simplificado
            //for(tipo da variável nome da variável : variável do array){}
        
        
        int[] numeros = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        //#region Método sort()
        Arrays.sort(numeros);

        for(int contadorNumeros : numeros){
            System.out.printf("Número -> %d\n", contadorNumeros);
        }
        //#endregion
        System.out.println("");

        //#region Método fill()
        int tamanhoArray = 10;
        int[] numerosVazio = new int[tamanhoArray];

        Arrays.fill(numerosVazio, 25);

        for(int contadorNumeros : numerosVazio){
            System.out.printf("Números repetidos -> %d\n", contadorNumeros);
        }
        //#endregion
        System.out.println("");

        //#region Método System.arraycopy()
        System.arraycopy(numeros, 0, numerosVazio, 0, tamanhoArray);

        for(int contadorNumeros : numerosVazio){
            System.out.printf("Números vazios com cópia -> %d\n", contadorNumeros);
        }

        //#endregion
        System.out.println("");

        //#region Método equals()
        Arrays.equals(numeros, numerosVazio);
        System.out.printf("Os arrays são %s", Arrays.equals(numeros, numerosVazio) ? "Iguais" : "Diferentes");

        //#endregion
        System.out.println("");

        //#region Método binarySearch()
        int numeroPesquisa = 80;
        int posicaoArray = Arrays.binarySearch(numeros, numeroPesquisa);
        System.out.printf("O número %d está nesse array? %s\n", numeroPesquisa, posicaoArray > 0 ? "Sim" : "Não");
        if(posicaoArray > 0){
            System.out.printf("Em que posição ele está? Na posição %d", posicaoArray);
        } else{
            System.out.println("Não foi encontrado");
        }
        //#endregion
    }
}
