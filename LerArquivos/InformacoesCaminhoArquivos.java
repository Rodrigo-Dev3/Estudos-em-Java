package LerArquivos;

import java.io.File;
import java.util.Scanner;

public class InformacoesCaminhoArquivos {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.print("Entre com o caminho do arquivo: ");
        String strPath = scan.nextLine();

        File path = new File(strPath);

        System.out.println("Pegar o nome do arquivo (getName): " + path.getName());
        System.out.println("Pegar o caminho do arquivo SEM o nome do arquivo (getParent): " + path.getParent());
        System.out.println("Pegar o caminho do arquivo COM o nome do arquivo (getPath): " + path.getPath());


        scan.close();
    }
}
