package _Praticando;


public class Personagem{
    
    private String nome, tipo;
    private int vida;
    private Boolean ativo = false;

    static int numeroJogador;
    static Boolean alerta = false;

    
    public Personagem(){
        

        numeroJogador++;
    }

    public Personagem(String nome, String tipo){
        this.nome = nome;
        this.tipo = tipo;
        this.vida = 0;

        numeroJogador++;
        Personagem.alerta = true;
    }

    
    public String getNome(){

        return this.nome;
    }

    public void setNome(String nome){

        this.nome = nome;
    }

    public String getTipo(){

        return this.tipo;
    }

    public void setTipo(String tipo){

        this.tipo = tipo;
    }

    public int getVida(){

        return this.vida;
    }

    public void adicionaVida(int vida){
        this.vida = vida;

        if(this.vida == 0){
            this.ativo = false;
        }
        if(this.vida > 0){
            this.ativo = true;
        }
    }

    public String getAtivo(){
        String resultadoAtivo;

        if(this.ativo == false){
            resultadoAtivo = "Inativo";
        }
        else{
            resultadoAtivo = "Ativo";
        }

        return resultadoAtivo;
    }
    

    public void statusPersonagem(){
        System.out.printf("-----------------------------------------%n");
        System.out.printf("Nome: %s%n", this.getNome());
        System.out.printf("Tipo: %s%n", this.getTipo());
        System.out.printf("Vida: %d%n", this.getVida());
        System.out.printf("Ativo: %s%n", this.getAtivo());
        System.out.printf("Alerta: %s%n", alerta ? "Personagem criado com sucesso" : "Tente novamente!");
        System.out.printf("Nº do jogador: %s%n", numeroJogador);
        System.out.printf("-----------------------------------------%n");
    }

    public void recebeDanoLeve(int danoLevePersonagem){
        int danoLeve = 0;

        danoLeve = this.getVida() - danoLevePersonagem;

        System.out.printf("%nA personagem %s sofreu um dano leve de %d. Agora ela possui %d pontos de vida!%n", this.getNome(), danoLevePersonagem, danoLeve);

        this.adicionaVida(danoLeve);
    }

}
