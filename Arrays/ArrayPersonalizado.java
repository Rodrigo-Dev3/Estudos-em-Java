public class ArrayPersonalizado {
    
    public static void main(String[] args){

        final int quantidadeCarros = 3;

        Carro[] carros = new Carro[quantidadeCarros];

        String[] modelosCarros = {"Ford", "Golf", "Camaro"};



        //Inicializar o array Carros
        for(int i = 0; i < quantidadeCarros; i++){
            carros[i] = new Carro(modelosCarros[i]);
        }

        //Imprimir Carros
        for(Carro carro : carros){
            carro.info();
        }


    }
}
