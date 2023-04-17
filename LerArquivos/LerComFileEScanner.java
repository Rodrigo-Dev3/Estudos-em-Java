package LerArquivos;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class LerComFileEScanner {
    public static void main(String[] args) {
        
        File file = new File("C:\\Users\\Fronz\\OneDrive\\Documentos\\Estudos - Java\\Estudos-em-Java\\LerArquivos\\Saudacao.txt");
        Scanner sc = null;

        try {
            sc = new Scanner(file);
            //Caso o arquivo tenha outras linhas, ele continuará lendo o arquivo até a última linha
            while(sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }
        finally{
            //É uma boa prática adicionar o fechamento do recurso - nesse caso o scanner - dentro do bloco finally
            //Assim, independentemente do bloco try dar erro ou não, ele executará o encerramento do recurso
            if(sc != null){
                sc.close();
            }
        }
    }
}
