package Entities;

import Enum.Cor;

public abstract class Forma_Abstract implements Forma{

    private Cor corForma;

    public Forma_Abstract(Cor corForma) {
        this.corForma = corForma;
    }

    public Cor getCorForma() {
        return corForma;
    }

    public void setCorForma(Cor corForma) {
        this.corForma = corForma;
    }


}

