package Data_Hora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class InstanciandoDataHora {
    public static void main(String[] args) {
        

        //Instanciando o AGORA

        //Somente a data
        LocalDate data01 = LocalDate.now();
        //Data + horário exato
        LocalDateTime data02 = LocalDateTime.now();
        //Instancia com a data GLOBAL - com horário de Londres (final letra Z)
        Instant data03 = Instant.now();

        System.out.println(data01);
        System.out.println(data02);
        System.out.println(data03);

        //Pegar um texto no formato ISO 8601 e criar uma DATA a apartir dele
        LocalDate data04 = LocalDate.parse("2022-07-20");
        //Pegar um Texto no formato ISO 8601 e criar uma DATA-HORA a partir dele
        LocalDateTime data05 = LocalDateTime.parse("2022-07-20T01:30:26");
        //Pegar um texto no formato ISO 8601 e criar uma DATA-HORA GLOBAL a partir dele
        Instant data06 = Instant.parse("2022-07-20T01:30:26Z");
        //Pegar um texto no formato ISO 8601 e criar uma DATA-HORA GLOBAL a partir dele - especificando uma timezone diferente - inserindo -3 de fuso horário ao final
        Instant data07 = Instant.parse("2022-07-20T01:30:26-03:00");

        System.out.println(data04);
        System.out.println(data05);
        System.out.println(data06);
        System.out.println(data07);

        //Customizar o texto de uma data-hora - FORMATANDO

        //Customizar a data
        //Primeiro é preciso criar o formato desejado
        DateTimeFormatter formatoData08 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        //Na sequência utilizar o método .parse sobrecarregado, com o segundo parâmetro sendo o formato customizado
        LocalDate data08 = LocalDate.parse("20/07/2022", formatoData08);     
        
        //É possível usar o argumento diretamente na chamada do método .parse
        LocalDateTime dataHora = LocalDateTime.of(2023, 3, 7, 14, 30);
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        String dataHoraFormatada = dataHora.format(formato);
        System.out.println(dataHoraFormatada);

        
        LocalDate data09 = LocalDate.parse("20/07/2022 01:30", DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));

        System.out.println(data08);
        System.out.println(data09);

        //Instanciando dia, mês e ano SEPARADAMENTE
        LocalDate data10 = LocalDate.of(2022, 7, 20);
        //Instanciando dia, mês e ano e horário SEPARADAMENTE
        LocalDateTime data11 = LocalDateTime.of(2022, 7, 20, 1, 30);

        System.out.println(data10);
        System.out.println(data11);

        

    }
}
