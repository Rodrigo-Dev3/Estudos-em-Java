public class Metodos {

    public static void main(String[] arg){

       //Chamando o método criado
       citarNome("João", 3);


       //Chamando um método com retorno
       int resultadoSoma;
       resultadoSoma = soma(15, 20);
       System.out.println(resultadoSoma);

        //Chamando um método sem parâmetros de entradas definidos - utilizando um array
        int resultadoSomaSemParametro;
        resultadoSomaSemParametro = somaSemParametroDefinido(10, 20, 30, 50);
        System.out.println(resultadoSomaSemParametro);

        //Chamando um método com sobrecarga
        //Chamando um método sem parâmetros de entradas definidos - utilizando um array
        Double resultadoSomaSemParametroComSobrecarga;
        resultadoSomaSemParametroComSobrecarga = somaSemParametroDefinido(10.1, 20.5);
        System.out.println(resultadoSomaSemParametroComSobrecarga);
    }
    
    //Modificado de acesso (public) + tipo de retorno (void) + nome do método (CitarNome) + parâmetro de entrada (String nome, int repetirVezesNome)
    public static void citarNome(String nome, int repetirVezesNome){
        for(int i = 0; i < repetirVezesNome; i++){
            System.out.println(nome);
        }
    }

    //Um método que contém retorno exibe o tipo de retorno no início do método, como nesse caso, o tipo "int" e não mais "void"
    public static int soma(int numero1, int numero2){
        int resultado = numero1 + numero2;

        return resultado; 
    }


    //Um método que não possui número de parâmetros de entrada definidos - tratado como um array
    public static int somaSemParametroDefinido(int... numeros){
        int resultado = 0;

        //Como se trata de um array, utiliza-se um laço for para ir somando (nesse caso) a quantidade de itens infinitas vezes
        for(int n : numeros){
            resultado += n;
        }

        return resultado;
    }

    //Método com sobrecarga
    //Um método que não possui número de parâmetros de entrada definidos - tratado como um array
    public static Double somaSemParametroDefinido(double... numeros){
        Double resultado = 0.0;

        //Como se trata de um array, utiliza-se um laço for para ir somando (nesse caso) a quantidade de itens infinitas vezes
        for(Double n : numeros){
            resultado += n;
        }

        return resultado;
    }
}