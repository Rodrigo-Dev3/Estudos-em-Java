package Entities;

public class ComboDevice extends Device implements Scanner, Printer{

    public ComboDevice(String numeroSerial) {
        super(numeroSerial);
    }


    //Como a classe Combo possui as funcionalidades de ambas as Interfaces, é possível IMPLEMENTÁ-LAS simultaneamente
    //Com isso, é possível implementar duas Interfaces, estabelecendo o contrato dessa classe com os métodos de ambas

    //Além disso, esse combo É-UM Device, sendo uma EXTENSÃO da classe pai

    //Sobrecarrega o método da classe pai ABSTRATA que foi EXTENDIDA - Device
    @Override
    public void processarDocumento(String documento) {
        System.out.println("Processando combo: " + documento);
    }


    //Sobrecarrega o método da INTERFACE - Printer
    @Override
    public void print(String documento) {
        System.out.println("Exibindo combo: " + documento);
    }


    //Sobrecarrega o método da INTERFACE - Scanner
    @Override
    public String scan() {
        return "Resultado do combo do scanner";
    }
}
