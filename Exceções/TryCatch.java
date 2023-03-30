import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
       
        Metodo1();

        //Com o bloco try-catch mesmo que tenha um erro de exceção acima, esta mensagem será visualizada
        System.out.println("Fim do programa");

    }

    public static void Metodo1(){
        System.out.println("*** MÉTODO1 INICIADO ***");

        Metodo2();

        System.out.println("*** MÉTODO1 FINALIZADO ***");
    }

    public static void Metodo2(){
        System.out.println("*** MÉTODO2 INICIADO ***");
        Scanner scan = new Scanner(System.in);
        try {
            //Cria um pequeno vetor e ao mesmo tempo "corta" ele em pedaços onde tiver um espaço
            String[] vetor = scan.nextLine().split(" ");
            int posicao = scan.nextInt();
    
            System.out.println(vetor[posicao]);
            //Caso seja inserido um VALOR PARA UMA POSIÇÃO DO VETOR QUE NÃO EXISTE
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Posição inválida");
                e.printStackTrace();
            } //Caso seja inserida UM TIPO DE VALOR que não seja o reconhecido pelo input - nesse caso int
            catch (InputMismatchException e){
                System.out.println("Valor digitado inválido");
            }
        System.out.println("*** MÉTODO2 FINALIZADO ***");
    }
}
