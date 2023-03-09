package Data_Hora;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class DuracaoDuasDatasHora {
    
public static void main(String[] args) {

    LocalDate data01 = LocalDate.parse("2022-07-20"); // Pega somente a data
    LocalDate data02 = LocalDate.parse("2022-07-27");

    Instant data03 = Instant.parse("2022-07-20T01:30:26Z"); // Pega o horário global
    Instant data04 = Instant.parse("2022-07-27T01:30:26Z"); // 

    //Aqui foi preciso utilizar o método .atStarOfDay() para pegar apenas os dias de cada data e realizar a comparação
    Duration duracao1 = Duration.between(data01.atStartOfDay(), data02.atStartOfDay());
    //Uma alternativa é transformar esse LocalDate em LocalDateTime - assim o código pegará o tempo necessário para realizar a comparação
    Duration duracao2 = Duration.between(data01.atTime(0, 0), data02.atTime(0, 0));

    System.out.printf("Duração entre data 01 e data 02: " + duracao1.toDays());
    System.out.println(" ");
    System.out.printf("Duração entre data 01 e data 02: " + duracao2.toDays());

    //Com o Instant é basicamente a mesma operação
    System.out.println(" ");
    Duration duracao3 = Duration.between(data03, data04);
    System.out.println("A duração entre a data 03 e a data 04 é de:  " + duracao3.toDays());
}

    
}
