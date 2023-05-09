package Application;


import Entities.Funcionario;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        List<Funcionario> list = new ArrayList<>(); //Crio uma lista

        String path = "C:\\Users\\Fronz\\OneDrive\\Área de Trabalho\\nomes.txt"; //Leio o arquivo com os nomes

        //Abro um try-catch-resources para ler as linhas do arquivo e mostrá-las
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String funcionarioCsv = br.readLine();

            while (funcionarioCsv != null) { //Como a linha vai retornar um valor, o loop continua percorrendo a lista

                //Cria um vetor para cortar cada elemento conforme o padrão REGEX inserido nos parênteses
                //Nesse caso, corta-se quando existir uma vírgula
                String[] camposFuncionario = funcionarioCsv.split(",");

                //Adiciona um novo 'funcionário' na lista, armazenando o primeiro elemento do split na pos 0
                //Adiciona um novo 'funcionário' na lista, armazenando o segundo elemento do split na pos 1
                list.add(new Funcionario(camposFuncionario[0], Double.parseDouble(camposFuncionario[1])));
                funcionarioCsv = br.readLine();
            }
            Collections.sort(list); //Ordena a lista por ordem alfabética
            for (Funcionario funcionario : list) {
                System.out.println(funcionario.getNome() + ", " + funcionario.getSalario());
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
