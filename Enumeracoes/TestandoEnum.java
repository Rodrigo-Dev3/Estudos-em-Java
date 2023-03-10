package Enumeracoes;

import Enumeracoes.Enum.DiaDaSemana;
import Enumeracoes.Enum.Feriados;

public class TestandoEnum {
    public static void main(String[] args) {
        
        String nome = DiaDaSemana.terça.toString();

        //Verifica se a variável nome possui o mesmo valor que o DiaDaSemana.terça.toString()
        if(nome.equals(DiaDaSemana.terça.toString())){
           DiaDaSemana.terça.exibirMensagem();
        }


        //Apenas exibe a mensagem contida no enum por meio do método criado nele
        DiaDaSemana.terça.exibirMensagem();


    }
}
