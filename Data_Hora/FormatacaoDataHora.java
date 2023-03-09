package Data_Hora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class FormatacaoDataHora {
    public static void main(String[] args) {

        LocalDate data01 = LocalDate.parse("2022-07-20"); // Pega somente a data
        LocalDateTime data02 = LocalDateTime.parse("2022-07-20T01:30:26"); // Pega o horário local - data e hora
        Instant data03 = Instant.parse("2022-07-20T01:30:26Z"); // Pega o horário global

        // Formatar de forma CUSTOMIZADA
        DateTimeFormatter data01Formatada = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        // É possível passar como argumento de entrada a data e acionar o .format para formatar com base no formato criado
        System.out.println(data01.format(data01Formatada));
        System.out.println(data01Formatada.format(data01)); // É possível chamar a data que se quer formatar diretamente como parâmetro
        // É possível passar como parâmetro o DateTImeFormater diretamente - sem precisar armazenar em uma variável
        System.out.println(data01.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));


        DateTimeFormatter data02Formatada = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println(data02.format(data02Formatada));

        //QUando customizar um INSTANT será preciso considerar o fuso horário do computador do usuário (local) - por isso a utilização do withZone(ZoneId.systemDefaul())
        //Como se trata de uma data-hora ambígua pois mescla o fuso horário local e global, é preciso definir o fuso horário na hora de definir a formatação
        //Nesse caso escolheu-se o Z (padrão)
        DateTimeFormatter data03Formatada = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());

        //Como o INSTANT não possui o método .format é preciso utilizar diretamente o método a partir do DateTimeFormatter criado e passar como parâmetro a data 
        System.out.println(data03Formatada.format(data03));


        //Formatando com base em modelos prontos
        //É possível formatar utilizando nomenclaturas prontas contidas no java, basta chamá-las pelo nome correspondente
        DateTimeFormatter dataFormatadaNomePredefinido = DateTimeFormatter.ISO_DATE_TIME;
        DateTimeFormatter dataFormatadaNomePredefinido2 = DateTimeFormatter.ISO_INSTANT; //Usando o Instant

        System.out.println(data02.format(dataFormatadaNomePredefinido));
        System.out.println(dataFormatadaNomePredefinido2.format(data03));
    }
}
