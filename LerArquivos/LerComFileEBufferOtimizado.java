package LerArquivos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;

public class LerComFileEBufferOtimizado {
    public static void main(String[] args) {
        
        //Este código mostra a forma padrão e otimizada de utilizar o File e BufferedReader - com menos linhas de código
        String path = "C:\\Users\\Fronz\\OneDrive\\Documentos\\Estudos - Java\\Estudos-em-Java\\LerArquivos\\Saudacao.txt";

        //Já passo o BufferedReader e o FileReader no momento de abertura do bloco Try-catch-resources
        //O resources é o () logo após o comando try
        try (BufferedReader novoBuffer = new BufferedReader(new FileReader(path))) {
            String linha = novoBuffer.readLine();

            //Enquanto retornar algo diferente de null, quer dizer que a leitura foi bem sucedida - continuando com a leitura das linhas subsequentes
            while(linha != null){
                System.out.println(linha);
                linha = novoBuffer.readLine();
            }
        } 
        catch (IOException e) {
            System.out.println("Erro " + e.getMessage());
        }
    }
}
