package UpcastingDowncasting;

public final class ContaPoupanca extends Conta{

    private Double taxaJuros;

    public ContaPoupanca(){
        super();
    }

    public ContaPoupanca(Integer numero, String titular, Double saldoConta,  Double taxaJuros) {
        super(numero, titular, saldoConta);
        this.taxaJuros = taxaJuros;
    }


    public Double getTaxaJuros() {
        return this.taxaJuros;
    }

    public void setTaxaJuros(Double taxaJuros) {
        this.taxaJuros = taxaJuros;
    }

    public void AtualizarSaldo(){
        saldoConta += saldoConta * taxaJuros;
    }

    @Override
    public void SaqueConta(double montante){
        saldoConta -=  montante - taxaJuros;
        //super.SaqueConta(montante); //É possível reutilizar os métodos da classe pai utilizando o super()
    }
}
