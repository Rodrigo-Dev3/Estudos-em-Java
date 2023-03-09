package Data_Hora;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class CalculosDataHora {
    public static void main(String[] args) {
        
        LocalDate data01 = LocalDate.parse("2022-07-20"); // Pega somente a data
        LocalDateTime data02 = LocalDateTime.parse("2022-07-20T01:30:26"); // Pega o horário local - data e hora
        Instant data03 = Instant.parse("2022-07-20T01:30:26Z"); // Pega o horário global

        //Para realizar calculos de adicção e subtração são utilizados os métodos PLUS e MINUS respectivamente
        LocalDate semanaAnterior = data01.minusDays(7);
        LocalDate proximaSemana = data01.plusDays(7);

        System.out.printf("Semana passada: " + semanaAnterior);
        System.out.printf("\nPróxima semana: " + proximaSemana);

        //O LocalDateTime possui métodos que o anterior não possui pois este contém as horas, minutos, segundos etc.
        LocalDateTime semanaAnteriorLocalDateTime = data02.minusDays(7);
        LocalDateTime proximaSemanaLocalDateTime = data02.plusDays(7);
        LocalDateTime minutosMenosLocalDateTime = data02.minusMinutes(10);

        System.out.printf("\nSemana passada: " + semanaAnteriorLocalDateTime);
        System.out.printf("\nPróxima semana: " + proximaSemanaLocalDateTime);
        System.out.printf("\n10 minutos a menos: " + minutosMenosLocalDateTime);

        //O Instant não possui alguns métodos e por isso pode-se utilizar outros comandos
        //Para realizar a diminuição é utilizado como segundo parâmetro o objeto ChronoUnit - 
        //A partir dele defini-se a fraçao do tempo desejada, se dias, anos, meses, etc.
        Instant semanaAnteriorInstant = data03.minus(7, ChronoUnit.DAYS);
        Instant proximaSemanaInstant = data03.plus(7, ChronoUnit.DAYS);

        System.out.printf("\nSemana passada: " + semanaAnteriorInstant);
        System.out.printf("\nPróxima semana: " + proximaSemanaInstant);
    }
}
