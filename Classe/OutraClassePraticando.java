package Classe;

public class OutraClassePraticando {
    
    //Modificadores de acesso
    //Publico, Private, Protected, Default

    //Método construtor sem a adição de parâmetros de entrada - não será preciso incluir tipos de dados para executar um novo objeto desta classe
    public OutraClassePraticando(){
        System.out.printf("%nVocê acabou de executar o objeto e o método construtor dele. Parabéns!%n");
    }

    //Método construtor COM a adição de parâmetros de entrada - SERÁ preciso incluir tipos de dados para executar um novo objeto desta classe
    public OutraClassePraticando(int numero1, int numero2){
        System.out.printf("%nVocê acabou de executar o objeto e o método construtor dele. Parabéns!%n");
        
        System.out.printf("%nOs números inseridos são -> %s e %s %n", numero1, numero2);
    }
}
