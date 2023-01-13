import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args){

    //Inicializa as variáveis
    int numero1;
    int numero2; 
    int resultado;
    int alternativa;
    int sair;

    //Instancia a classe scanner para poder usá-la
    Scanner insiraValores = new Scanner(System.in);

    //Loop para que o programa não seja encerrado, somente ao digitar um valor
    do{

    System.out.println("Digite 1 - Soma\nDigite 2 - Subtração\nDigite 3 - Multiplicação\nDigite 4 - Divisão");
    System.out.print("Qual operação você deseja realizar? ");
    alternativa = insiraValores.nextInt();

    if(alternativa == 1){
        System.out.print("Insira o primeiro valor -> ");
        numero1 = insiraValores.nextInt();
    
        System.out.print("Insira o segundo valor -> ");
        numero2 = insiraValores.nextInt();

        resultado = Soma(numero1, numero2);

        System.out.printf("O resultado da soma entre %d e %d é igual a %d", numero1, numero2, resultado);
    }
    if(alternativa == 2){
        System.out.print("Insira o primeiro valor -> ");
        numero1 = insiraValores.nextInt();
    
        System.out.print("Insira o segundo valor -> ");
        numero2 = insiraValores.nextInt();

        resultado = Subtrai(numero1, numero2);

        System.out.printf("O resultado da subtração entre %d e %d é igual a %d", numero1, numero2, resultado);
    }
    if(alternativa == 3){
        System.out.print("Insira o primeiro valor -> ");
        numero1 = insiraValores.nextInt();
    
        System.out.print("Insira o segundo valor -> ");
        numero2 = insiraValores.nextInt();

        resultado = Multiplica(numero1, numero2);

        System.out.printf("O resultado da multiplicação entre %d e %d é igual a %d", numero1, numero2, resultado);
    }
    if(alternativa == 4){
        System.out.print("Insira o primeiro valor -> ");
        numero1 = insiraValores.nextInt();
    
        System.out.print("Insira o segundo valor -> ");
        numero2 = insiraValores.nextInt();

        resultado = Divisao(numero1, numero2);

        System.out.printf("O resultado da divisão entre %d e %d é igual a %d", numero1, numero2, resultado);
    }

    System.out.print("\nAperte 0 se deseja sair ou outro valor para continuar -> ");
    sair = insiraValores.nextInt();

    }while(sair != 0);

    System.out.println("Calculadora encerrada com sucesso");

    }
    //Métodos ficam do lado de fora da "página principal"
    public static int Soma(int numero1, int numero2){

        return numero1 + numero2;
    }

    public static int Subtrai(int numero1, int numero2){
        
        return numero1 - numero2;
    }

    public static int Multiplica(int numero1, int numero2){

        return numero1 * numero2;
    }

    public static int Divisao(int numero1, int numero2){
        return numero1 / numero2;
    }

}