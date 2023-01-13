package Funcoes_Numero_Indeterminado_Argumentos;

public class Funcoes{

    public static void main(String[] args){

        int numero1 = 10;
        int numero2 = 10;
        int numero3 = 10;

        int resultado = soma(numero1, numero2, numero3);

        System.out.println(resultado);

    }

    public static int soma(int...numeros){
        int somarNumeros = 0;

        for(int valores:numeros){
            somarNumeros+= valores;
        }

        return somarNumeros;
    }
}