package LerArquivos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LerComFileReader {
    public static void main(String[] args) {
        
        //O código abaixo mostra o processo manual para abrir e fechar os arquivos utilizando FileReader e BufferReader
        //Há outras maneiras de deixar o código mais limpo  

        String path = "C:\\Users\\Fronz\\OneDrive\\Documentos\\Estudos - Java\\Estudos-em-Java\\LerArquivos\\Saudacao.txt";
        FileReader novoFile = null;
        BufferedReader novoBuffer = null;

        try {
            //Crio uma stream de leitura com a classe FileReader
            novoFile = new FileReader(path);
            //Na sequência instancio um novo BufferReader para otimizar a leitura desse FileReader
            novoBuffer = new BufferedReader(novoFile);

            String linha = novoBuffer.readLine();

            //Enquanto retornar algo diferente de null, quer dizer que a leitura foi bem sucedida - continuando com a leitura das linhas subsequentes
            while(linha != null){
                System.out.println(linha);
                linha = novoBuffer.readLine();
            }
        } catch (IOException e) {
            System.out.println("Erro " + e.getMessage());
        }
        finally{
            try {
                if(novoBuffer != null){
                    novoBuffer.close();
                }
                if(novoFile != null){
                    novoFile.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
