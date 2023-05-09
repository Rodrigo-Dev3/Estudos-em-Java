package Entities;

public class ConcretaScanner extends Device implements Scanner{

    //Como extende Device, deve possuir o construtor da classe pai
    public ConcretaScanner(String numeroSerial){
        super(numeroSerial);
    }

    //Sobrecarrega o método da classe pai ABSTRATA que foi EXTENDIDA - Device
    @Override
    public void processarDocumento(String documento){
        System.out.println("Processando Scanner: " + documento);
    }

    //Sobrecarrega o método da INTERFACE - Scanner
    @Override
    public String scan(){
        return "Conteúdo scanneado";
    }
}
