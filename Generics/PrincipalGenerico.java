package Generics;

public class PrincipalGenerico {

    public static void main(String[] args){

        ClasseGenerico<String> novaClasseGenerica = new ClasseGenerico<>();

        novaClasseGenerica.setMensagem("Pedro");

        ClasseGenerico<Integer> novaClasseGenerica2 = new ClasseGenerico<>();

        novaClasseGenerica2.setMensagem("Pedro"); //Está dando erro pois o parâmetro que eu passei é Integer e estou tentando setar uma String


    }
    
}
