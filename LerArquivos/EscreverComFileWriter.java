package LerArquivos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class EscreverComFileWriter {
    public static void main(String[] args) {
        
        String[] linhas = new String[]{"Bom dia!", "Boa tarde", "Boa noite"};

        //Crio o caminho em que o arquivo estará
        String path = "C:\\Users\\Fronz\\OneDrive\\Área de Trabalho\\boasvindas.txt";

        //Para não escrever sempre um novo arquivo, quando inserido o parâmetro "true" no FileWriter, é escrito no mesmo arquivo
        try (BufferedWriter bufferWriter = new BufferedWriter(new FileWriter(path, true))) {
            //Como eu quero escrever uma sucessão de linhas, eu insiro um comando for para que sejam escritas todas as linhas no arquivo
            for(String linha : linhas){
                bufferWriter.write(linha); //Escreve a linha
                bufferWriter.newLine(); //Insere uma quebra de linha a cada nova linha escrita
            }
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
