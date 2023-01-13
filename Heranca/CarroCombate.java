package Heranca;

public class CarroCombate extends Carro {
    
    private final int MAX_ARMAMENTO = 100;
    private final int MIN_ARMAMENTO = 0;
    private int quantidadeArmamento;

    public CarroCombate(String nome, int blindagem){
        super(nome); //Pega o atributo da classe pai para não apresentar mais erro nesta classe filha que está extendendo a classe pai
        super.SetArmamento(true); //Acessando o méotod SetArmamento da classe pai
        super.SetBlindagem(blindagem); //receberá o valor do parâmetro de entrada inserido nesse construtor
        this.quantidadeArmamento = 20;

    }

    public void SetQuantidadeArmamento(int quantidadeArmamento){

        this.quantidadeArmamento += quantidadeArmamento;

        if(this.quantidadeArmamento > MAX_ARMAMENTO){
            this.quantidadeArmamento = MAX_ARMAMENTO; //validação da quantidade máxima
        }
        if(this.quantidadeArmamento < MIN_ARMAMENTO){
            this.quantidadeArmamento = MIN_ARMAMENTO; //validação da quantidade mínima
        }
    }

    public int GetQuantidadeArmamento(){

        return this.quantidadeArmamento;
    }

    public void atirar(){

        //Só pode atirar se existir o mínimo de armamento
        if(this.quantidadeArmamento > MIN_ARMAMENTO){
            SetQuantidadeArmamento(-1);
        } else{
            System.out.println("Sem munição");
        }
    }

    public void info(){
        super.info(); //Para não repetir as informações da classe pai, apenas chama o método já criado com algumas das informações
        System.out.printf("Quantidade de Armamento......%d%n", this.quantidadeArmamento);

    }


    
}
