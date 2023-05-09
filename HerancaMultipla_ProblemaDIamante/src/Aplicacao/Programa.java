package Aplicacao;

import Entities.ComboDevice;
import Entities.ConcretaPrinter;
import Entities.ConcretaScanner;

public class Programa {
    public static void main(String[] args) {

        ConcretaPrinter novoPrinter = new ConcretaPrinter("1080");
        novoPrinter.processarDocumento("Minha carta");
        novoPrinter.print("Minha Carta");

        System.out.println();

        ConcretaScanner novoScanner = new ConcretaScanner("2003");
        novoScanner.processarDocumento("Meu e-mail");
        System.out.println("Resultado do scanner: " + novoScanner.scan());

        System.out.println();

        ComboDevice novoCombo = new ComboDevice("2081");
        novoCombo.processarDocumento("Minha dissertação");
        novoCombo.print("Minha dissertação");
        System.out.println("Resultado do scanner: " + novoScanner.scan());
    }
}
