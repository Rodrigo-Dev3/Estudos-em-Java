package Data_Hora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class ConverterLocalGlobal {

    public static void main(String[] args) {
        
        LocalDate data01 = LocalDate.parse("2022-07-20"); // Pega somente a data
        LocalDateTime data02 = LocalDateTime.parse("2022-07-20T01:30:26"); // Pega o horário local - data e hora
        Instant data03 = Instant.parse("2022-07-20T01:30:26Z"); // Pega o horário global

        //Para converter uma data global para local PRIMEIRO é preciso identificar o timezone 
        //Essa timezone pode ser o sistema local que está rodando o sistema, mas pode ser outro também

        //Aqui o resultado será a data instant convertida para horário local utilizando como base o fuso horário do meu computador
        LocalDate resultado1 = LocalDate.ofInstant(data03, ZoneId.systemDefault());

        System.out.println(resultado1);

        //O nome encontrado na coleção ZoneId pode ser inserida dentro do método .of para modificar o fuso horário global
        LocalDate resultado2 = LocalDate.ofInstant(data03, ZoneId.of("Portugal"));

        System.out.println(resultado2);

        //Utilizando as horas também
        LocalDateTime resultado3 = LocalDateTime.ofInstant(data03, ZoneId.systemDefault());
        System.out.println(resultado3);

        LocalDateTime resultado4 = LocalDateTime.ofInstant(data03, ZoneId.of("Portugal"));
        System.out.println(resultado4);




        //Para descobrir os timezones possíveis de serem utilizados basta verificar na coleção ZoneId
        //Com o laço for, será retornada uma lista com 600 timezones disponíveis
        // for(String zones : ZoneId.getAvailableZoneIds()){
        //     System.out.println(zones);
        // }

    }
}