package Aplicacao;

import Entities.Circulo;
import Enum.Cor;

public class Principal {
    public static void main(String[] args) {

        Circulo novoCirculo = new Circulo(Cor.branco, 20.3);

        System.out.println(String.format("%.2f", novoCirculo.area()));
    }
}
