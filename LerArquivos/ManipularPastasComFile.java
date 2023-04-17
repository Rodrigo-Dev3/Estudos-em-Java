package LerArquivos;

import java.io.File;
import java.util.Scanner;

public class ManipularPastasComFile {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Escreva um caminho: ");
        String strPath = scan.nextLine();

        File path = new File(strPath);

        //Verifica as pastas dentro do diretório escrito no Scanner quando o código é iniciado - pelo comando isDirectory
        File[] pastas = path.listFiles(File::isDirectory);
        System.out.println("Pastas:" );
        for(File pasta : pastas){
            System.out.println(pasta);
        }

        File[] arquivos = path.listFiles(File::isFile);
        System.out.println("Arquivos:" );
        for(File arquivo : arquivos){
            System.out.println(arquivo);
        }

        //Cria um novo diretório no caminho digitado no Scanner quando o código é iniciado - pelo método mkdir()
        boolean sucesso = new File(strPath + "\\subpasta").mkdir();

        System.out.println("Diretório criado com sucesso: " + sucesso);
    }
}
