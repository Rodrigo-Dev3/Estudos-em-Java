package Metodos_Abstratos;

public class Circulo extends Forma{

    private Double radio;


    public Circulo(CorEnum cor, Double radio) {
        super(cor);
        this.radio = radio;
    }

    public Circulo() {
    }


    public Double getRadio() {
        return this.radio;
    }

    public void setRadio(Double radio) {
        this.radio = radio;
    }

    //Sobrecarrega novamente o método abstrato da classe genérica Forma e adiciona o cálculo correto para calcular a área do círculo
    @Override
    public double Area() {
        return Math.PI * radio * radio; 
    }
    

}