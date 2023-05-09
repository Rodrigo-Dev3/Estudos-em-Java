package Interface_Heranca_Java;

public class Circulo extends Forma_Abstract{
    
    private Double radioCirculo;


    public Circulo(Double radioCirculo, String corForma) {
        super(corForma);
        this.radioCirculo = radioCirculo;
    }


    public Double getRadioCirculo() {
        return this.radioCirculo;
    }

    public void setRadioCirculo(Double radioCirculo) {
        this.radioCirculo = radioCirculo;
    }

    @Override
	public double area() {
		return Math.PI * radioCirculo * radioCirculo;
	}

}
