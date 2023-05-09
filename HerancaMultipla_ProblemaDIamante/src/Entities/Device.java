package Entities;

public abstract class Device {

    public String numeroSerial;

    public Device(String numeroSerial){
        this.numeroSerial = numeroSerial;
    }

    public String getNumeroSerial() {
        return numeroSerial;
    }

    public void setNumeroSerial(String numeroSerial) {
        this.numeroSerial = numeroSerial;
    }

    //Define um método abstrato para ser implementado nas subclasses criadas que extenderão essa classe abstrata
    //Uma classe abstrata NÃO pode ser instanciada diretamente, mas pode definir o que suas subclasses terão
    //Para isso as classes concretas devem extender essa classe abstrata
    public abstract void processarDocumento(String documento);
}
