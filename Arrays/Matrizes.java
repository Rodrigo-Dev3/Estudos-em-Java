public class Matrizes {
    
    public static void main(String[] args){

        final int quantidadeLinhas = 3;
        final int quantidadeColunas = 5;

        int[][] valoresMatriz = {{1, 2, 3, 4, 5},
                                 {6, 7, 8, 9, 10},
                                 {11, 12, 13, 14, 15}};


        for(int linha = 0; linha < quantidadeLinhas; linha++){
            for(int coluna = 0; coluna < quantidadeColunas; coluna++){
                System.out.printf("A linha %d da coluna %d possui o valor -> %d\n", linha, coluna, valoresMatriz[linha][coluna] );
            }
        }

        //int[][] numeros = new int[linhas][colunas];

        // for(int linha = 0; linha < linhas; linha++){
        //     for(int coluna = 0; coluna < colunas; coluna++){
        //         System.out.printf("Linha %d e Número %d\n", linha, coluna );
        //     }
        // }

        // for(int[] n:numeros){
        //     for(int v:n){
        //         System.out.printf("%d | ", v);
        //     }
        //     System.out.printf("%n");
        // }

    }
}
