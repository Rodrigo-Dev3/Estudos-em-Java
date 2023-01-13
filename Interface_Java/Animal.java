package Interface_Java;

public class Animal implements SerVivo {


    public Animal(){


    }


    //Métodos que a classe 'Animal' é obrigada a implementar por causa da interface 'SerVivo'
    public void mover(){}; 

    public void comer(int massa){};
    
    public void informacoes(){
        //System.out.printf("Vivo: %s", this.vivo ? "Sim" : "Não");
    };
    
}
