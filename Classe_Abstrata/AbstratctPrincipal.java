package Classe_Abstrata;

public class AbstratctPrincipal {
    public static void main(String[] args){

        Formiga novaFormiga = new Formiga(10, 50, 100);
        Aranha novaAranha = new Aranha(5, 10, 20, 50);
        Vegetal novoVegetal = new Vegetal(50);



        novaFormiga.atacar(novaAranha);
        novaFormiga.informacoes();
        novaAranha.informacoes();


    }
}
