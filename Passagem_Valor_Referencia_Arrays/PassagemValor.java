package Passagem_Valor_Referencia_Arrays;

public class PassagemValor {
    public static void main(String[] args){

        int[] notas = {10, 20, 30, 40, 50, 80, 90};
        int[] resultados = {0, 0};

        conferirNotas(notas, resultados);

        System.out.printf("Aprovados: %s %n", resultados[0]);
        System.out.printf("Reprovados: %s", resultados[1]);
        

    }

    public static void conferirNotas(int[] notas, int[] resultados){
        for(int n : notas){
            if(n >= 60){
                resultados[0]++;
            }else{
                resultados[1]++;
            }
        }
    }
}
