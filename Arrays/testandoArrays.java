public class testandoArrays{

    public static void main(String[] args){


        String[] nomeProprio = {"Maria", "José", "Pedro","Manoel", "João", "Arnaldo"};
        
        //mostrarNomeComM("João", "Maria", "Moises", "Camargo", "Forlan", "Oliveira", "Mathias");
        
        for(String listarNomesProprios:nomeProprio){
            if(listarNomesProprios.startsWith("M")){
                System.out.printf("\n", mostrarNomeComM(listarNomesProprios)); //Eu chamo o método e passo como parâmetro o contador desse loop do array
            }
        }

        // for(String mostrarNomeComA:nomeProprio){
        //     if(mostrarNomeComA.startsWith("A")){
        //         System.out.printf("A palavra que inicia com A é -> %s\n", mostrarNomeComA);
        //     }
        // }

        // for(String mostrarNome:nomeProprio){
        //         if(!mostrarNome.startsWith("M") && !mostrarNome.startsWith("A")){
        //             System.out.printf("As outras palavras são -> %s\n", mostrarNome);
        //         }
        // }

    }

    //Cria um array no parâmetro do método
    //Quando for utilizar o método, eu consigo passar um array para ele executar uma ação
    public static String[] mostrarNomeComM(String...nomes){
        System.out.print("As palavras que iniciam com M são -> ");
        for(String mostrarNomeComM:nomes){
            if(mostrarNomeComM.startsWith("M")){
                System.out.printf(" %s ", mostrarNomeComM);
            }
        }
        return nomes;
    }

}