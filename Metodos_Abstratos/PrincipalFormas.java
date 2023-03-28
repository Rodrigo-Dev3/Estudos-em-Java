package Metodos_Abstratos;

import java.util.Locale;

public class PrincipalFormas {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Retangulo novoRetangulo = new Retangulo(CorEnum.azul, 10.0, 10.0);

        Circulo novoCirculo = new Circulo(CorEnum.verde, 3.0);

        System.out.println(String.format("%.2f", novoCirculo.Area()));

        System.out.println(novoRetangulo.Area());
    }
}
