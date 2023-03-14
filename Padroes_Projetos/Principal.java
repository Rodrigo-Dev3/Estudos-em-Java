package Padroes_Projetos;

public class Principal {
    public static void main(String[] args) {
        
        PadraoBuilder carro1 = new PadraoBuilder.CarroBuilder()
        .comModelo("Chevrolet")
        .comCor("Vermelho")
        .comAno(2012)
        .comPotencia(200)
        .build();

        System.out.println(carro1.getModelo());
    }
}
