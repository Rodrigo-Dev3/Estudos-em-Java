package Funções_Em_Arrays;

public class Funcao_Arrays {
    
    public static void main(String[] args){

        int[] numeros = {10, 2, 3, 50, 25, 44, 32, 16};

        parImpar(numeros);
    }

    public static void parImpar(int[] numero){
        for(int n : numero){
            if(n % 2 == 0){
                System.out.printf("%d : %s %n", n, "Par");
            }else{
                System.out.printf("%d : %s %n", n, "Ímpar");
            }
        }
    }
}
