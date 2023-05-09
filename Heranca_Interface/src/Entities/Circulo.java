package Entities;

import Enum.Cor;

public class Circulo extends Forma_Abstract {

    private Double radio;

    public Circulo(Cor corForma, Double radio) {
        super(corForma);
        this.radio = radio;
    }

    public Double getRadio() {
        return radio;
    }

    public void setRadio(Double radio) {
        this.radio = radio;
    }

    @Override
    public Double area(){
        return Math.PI * radio * radio;
    };
}
