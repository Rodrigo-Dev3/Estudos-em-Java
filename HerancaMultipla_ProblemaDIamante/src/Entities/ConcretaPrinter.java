package Entities;

public class ConcretaPrinter extends Device implements Printer{

    public ConcretaPrinter(String numeroSerial) {
        super(numeroSerial);
    }

    //Sobrecarrega o método da classe pai ABSTRATA que foi EXTENDIDA - Device
    @Override
    public void processarDocumento(String documento) {
        System.out.println("Processando a exibição: " + documento);
    }

    //Sobrecarrega o método da INTERFACE - Printer
    @Override
    public void print(String documento) {
        System.out.println("Exibindo: " + documento);
    }
}
