package Argumentos_Entrada_Programa;

public class Soma{

    public static void main (String[] args){

        int soma = 0;

        if(args.length <= 0){
            System.out.printf("%s %n", "Sem valores para somar");
            return;
        }

        for(String n : args){
            //Convertendo o valor de entrada para um tipo inteiro
            int valor = Integer.valueOf(n);
            soma += valor;
        }

        System.out.printf("A soma dos valores: %d %n", soma);
    }
}