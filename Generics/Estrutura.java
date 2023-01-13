package Generics;

public class Estrutura {
    
    public static void main(String[] args){

        GenericClass<String> no1 = new GenericClass<>("Conteudo no1");


        GenericClass<String> no2 = new GenericClass<>("Conteudo no2");
        no1.setProximoNo(no2); //A referência do no1 está apontando para o no2

        GenericClass<String> no3 = new GenericClass<>("Conteudo no3");
        no2.setProximoNo(no3); //A referência do no2 está apontando para o no3

        GenericClass<String> no4 = new GenericClass<>("Conteudo no4");
        no3.setProximoNo(no4); //A referência do no3 está apontando para o no4

        System.out.println(no1);
        System.out.println(no1.getProximoNo());
        System.out.println(no2.getProximoNo());
        System.out.println(no3.getProximoNo());
        System.out.println(no4.getProximoNo());

        System.out.println("-------------------------------------");

        System.out.println(no1.getProximoNo().getProximoNo()); //Pula duas vezes o nó 1 e chega até o nó3
    }
}
