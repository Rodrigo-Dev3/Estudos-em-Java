package UpcastingDowncasting;

public class ContaNegocios extends Conta {

    //Uma das classes FILHO que extende os atributos e os métodos da classe PAI

    private Double limiteDeEmprestimo;

    //Mesmo que vazio, caso seja incluída alguma lógica no construtor PAI, 
    //essa lógica será adicionada ao construtor da classe filho
    public ContaNegocios(){
        super();
    }

    //Utiliza-se o método SUPER() seguido dos atributos que a classe pai utiliza no construtor - nesse caso Integer numero, String Titular e Double saldoConta
    public ContaNegocios(Integer numero, String titular, Double saldoConta, Double limiteEmprestimo) {
        super(numero, titular, saldoConta);
        this.limiteDeEmprestimo = limiteEmprestimo;
    }
    

    public Double getLimiteDeEmprestimo() {
        return this.limiteDeEmprestimo;
    }

    public void setLimiteDeEmprestimo(Double limiteDeEmprestimo) {
        this.limiteDeEmprestimo = limiteDeEmprestimo;
    }


    //Como a classe está estendendo a classe PAI, eu consigo ter acesso aos métodos da Classe PAI
    public void Emprestimo(double montante){
        if(montante <= limiteDeEmprestimo){
            //O atributo da classe pai saldoConta pode ser acessado 
            //pois o modificador de acesso é PROTECTED
            saldoConta += montante - 10.0;
        }
    }
}
