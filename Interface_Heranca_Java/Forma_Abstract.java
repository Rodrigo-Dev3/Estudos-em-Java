package Interface_Heranca_Java;

public abstract class Forma_Abstract implements Forma{
    
    //Classe abstrata para definir uma estrutura reutilizável em novos objetos criados a partir dela
    private String corForma;

    public Forma_Abstract(String corForma) {
        this.corForma = corForma;
    }

    public String getCorForma() {
        return this.corForma;
    }

    public void setCorForma(String corForma) {
        this.corForma = corForma;
    }

}
