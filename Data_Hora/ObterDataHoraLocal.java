package Data_Hora;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class ObterDataHoraLocal {
    public static void main(String[] args) {
        
        LocalDate data01 = LocalDate.parse("2022-07-20"); // Pega somente a data
        LocalDateTime data02 = LocalDateTime.parse("2022-07-20T01:30:26"); // Pega o horário local - data e hora

        //Para obter as datas basta utilizar na variável o método get - que aparecerá uma lista de opções além das listadas abaixo
        System.out.println(data01.getDayOfMonth()); //dia
        System.out.println(data01.getMonthValue()); //mês
        System.out.println(data01.getYear()); //ano

        //Para obter as horas e os minutos e os segundos basta inserir o mesmo método get, porém em um LocalDateTime
        System.out.println(data02.getHour());
        System.out.println(data02.getMinute());
        System.out.println(data02.getSecond());
    }
}
