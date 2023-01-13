package Passagem_Valor_Referencia_Arrays;

public class Teste_Passagem_Valor_Referencia {
    
    public static void main(String[] args){

        int porValor = 1;

        int[] porReferencia = {9};

        porValor(porValor);

        porReferencia(porReferencia);

        System.out.printf("%d %n", porValor);

        System.out.printf("%s", porReferencia[0]);
        
    }

    //NÃO irá modificar o valor original, pois não irá pegar o local da variável original - apenas irá substituir o valor em outro espaço de memória
    public static void porValor(int numero){
        numero = 5;
    }

    //IRÁ modificar o valor original, pois irá pegar o espaço da memória da variável original - assim, o valor será substituído
    public static void porReferencia(int[] numero){
        numero[0] = 5;
    }

}
