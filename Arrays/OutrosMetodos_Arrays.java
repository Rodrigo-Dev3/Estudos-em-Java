import java.util.Arrays;

public class OutrosMetodos_Arrays {
    
    public static void main(String[] args){

        int[] numeros = {90, 50, 10, 44, 5, 60, 7};
        int[] numeros2 = new int[7];

        //Ordernar elementos - SORT
        Arrays.sort(numeros);

        //Preenche todo o array com um valor predeterminado - FILL
        //Arrays.fill(numeros, 2);

        //Arraycopy copia um determinado array para outro - ARRAYCOPY
        System.arraycopy(numeros, 0, numeros2, 0, numeros.length);

        //Compara dois arrays - retorna true ou false - EQUALS
        Boolean valor = Arrays.equals(numeros, numeros2);
        System.out.println(valor);

        //Verifica se determinado elemento está no array e retorna true ou false - ele retorna a POSIÇÃO em que o elemento está, o índice - BINARYSEARCH
        //Caso não encontre, o valor retornado é negativo
        //O array precisa estar ORDENADO antes de fazer a verificação
        System.out.println(Arrays.binarySearch(numeros, 44));



        for(int numero : numeros2){
            System.out.printf("%d - ", numero);
        }
    }
}
