package Heranca;

public class Carro {
    
    private String nome;
    private Boolean ligado;
    private Boolean destruido;
    private int blindagem;
    private Boolean armamento;

    //Construtor da classe Carro
    public Carro(String nome){

        this.nome = nome;
        this.ligado = false;
        this.destruido = false;
        this.blindagem = 0;
        this.armamento = false;

    }

    public String Getnome(){
        return this.nome;
    }

    //Como eu não quero definir o nome posteriormente, eu apenas deixo o GetNome - setar apenas no construtor
    // public void SetNome(String nome){
    //     this.nome = nome;
    // }

    public Boolean GetLigado(){
        return this.ligado;
    }

    public Boolean GetDestruido(){
        return this.destruido;
    }

    public void SetDestruido(Boolean destruido){
        this.destruido = destruido;
    }

    public int GetBlindagem(){
        return this.blindagem;
    }

    public void SetBlindagem(int blindagem){
        this.blindagem = blindagem;
    }

    public Boolean GetArmamento(){
        return this.armamento;
    }

    public void SetArmamento(Boolean armamento){
        this.armamento = armamento;
    }

    //Insere um valor para que o carro sofra dano, como parâmetro de entrada o valor desse DANO
    public void sofrerDano(int dano){

        this.blindagem -= dano; //A cada dano, o valor da blindagem é reduzido conforme o dano causado 
        if(this.blindagem <= 0){
            this.blindagem = 0;
            this.ligado = false;
            this.destruido = true;
        }
    }

    public void info(){
        System.out.println("-----------------------------------------------------------------------------------------------------------------\n");
        System.out.printf("Nome......%s%n", Getnome());
        System.out.printf("Ligado......%s%n", GetLigado() ? "Está ligado" : "Não está ligado");
        System.out.printf("Destruído......%s%n", GetDestruido() ? "O carro já está destruído" : "O carro está em condições de uso ainda");
        System.out.printf("Blindagem......%d%n", GetBlindagem());
        System.out.printf("Armamento......%s%n", GetArmamento());
        System.out.println("\n-----------------------------------------------------------------------------------------------------------------");
    }

}
