package Matrizes;

import java.security.SecureRandom;

public class Matriz {
    public static void main(String[] args){

        final int linha = 1000;
        final int coluna = 2;
        int[][] numeros = new int[linha][coluna];
        
        //Funções para gerar e para imprimir dados em matrizes
        GerarDados(numeros, linha, coluna);

        ImprimeDados(numeros, linha, coluna);

    }

    public static void ImprimeDados(int[][] matriz, int quantidadeLinhas, int quantidadeColunas){
        
        //Realiza a impressão da matriz
        for(int l = 0; l < quantidadeLinhas; l++){
            for(int c = 0; c < quantidadeColunas; c++){
                System.out.printf("%d - ", matriz[l][c]);
            }
            //Imprime a matriz no formato dela
            System.out.printf("%n");
        }
    }
    
    public static void GerarDados(int[][] matriz, int quantidadeLinhas, int quantidadeColunas){
        
        //Percorre a matriz e gera os números
        for(int l = 0; l < quantidadeLinhas; l++){
            for(int c = 0; c < quantidadeColunas; c++){
                //O 'nextInt' significa gerar um valor aleatório entre 0 a 100
                matriz[l][c] = new SecureRandom().nextInt(100);
            }
        }
        System.out.printf("%n");
    }
}