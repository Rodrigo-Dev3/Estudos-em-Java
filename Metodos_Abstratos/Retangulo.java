package Metodos_Abstratos;

public class Retangulo extends Forma {
    
    private Double largura;
    private Double altura;



    public Retangulo(CorEnum cor, Double largura, Double altura) {
        super(cor);
        this.largura = largura;
        this.altura = altura;
    }

    public Retangulo() {
        
    }


    public Double getLargura() {
        return this.largura;
    }

    public void setLargura(Double largura) {
        this.largura = largura;
    }

    public Double getAltura() {
        return this.altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    //Modifico o método abstrato da classe genérica Forma e sobrecarrego com o cálculo correto
    @Override
    public double Area(){
        return largura * altura;
    }
    
}
