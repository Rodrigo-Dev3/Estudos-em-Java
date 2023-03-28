package UpcastingDowncasting;

public abstract class Conta {

    //Classe pai - possui os métodos e atributos principais da CONTA

    private Integer numero;
    private String titular;
    //Para que o atributo saldoConta seja acessado pela subCLasse ContaNegocios 
    //é preciso adicionar o modificador de acesso PROTECTED 
    protected Double saldoConta;


    public Conta(){

    }

    public Conta(Integer numero, String titular, Double saldoConta) {
        this.numero = numero;
        this.titular = titular;
        this.saldoConta = saldoConta;
    }

    
    public Integer getNumero() {
        return this.numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return this.titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public Double getSaldoConta() {
        return this.saldoConta;
    }

    
    public void SaqueConta(double montante){
        saldoConta -= montante;
    }

    public void DepositoConta(double montante){
        saldoConta += montante;
    }

}
