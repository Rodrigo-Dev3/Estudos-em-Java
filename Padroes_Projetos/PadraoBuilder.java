package Padroes_Projetos;

public class PadraoBuilder {

    private String modelo;
    private String cor;
    private int ano;
    private int potencia;

    private PadraoBuilder(String modelo, String cor, int ano, int potencia){
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
        this.potencia = potencia;
    }

    //Métodos Get e Set para poder acessar os atributos
    public String getModelo(){
        return this.modelo;
    }

    public String getCor(){
        return this.cor;
    }

    public int setAno(){
        return this.ano;
    }

    public int getPotencia(){
        return this.potencia;
    }

    //Classe interna - em que a classe externa possuirá acesso ao que estiver dentro da classe interna
    public static class CarroBuilder{

        private String modelo;
        private String cor;
        private int ano;
        private int potencia;

        public CarroBuilder(){}

        public CarroBuilder comModelo(String modelo){
            this.modelo = modelo;
            return this;
        }

        public CarroBuilder comCor(String cor){
            this.cor = cor;
            return this;
        }

        public CarroBuilder comAno(int ano){
            this.ano = ano;
            return this;
        }

        public CarroBuilder comPotencia(int potencia) {
            this.potencia = potencia;
            return this;
         }
      
        //Necessário para retornar os atributos e adicionálo no construtor da classe principal
        public PadraoBuilder build() {
            return new PadraoBuilder(modelo, cor, ano, potencia);
        }
    }
}
