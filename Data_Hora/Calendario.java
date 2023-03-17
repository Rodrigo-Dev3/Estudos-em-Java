package Data_Hora;

import java.time.Month;
import java.util.Calendar;

public class Calendario {
    public static void main(String[] args) {
        
        //Não pode ser instanciada, por isso deve-se usar o getInstance
        Calendar novoCalendario = Calendar.getInstance();

        System.out.println("Data / Hora atual: " + novoCalendario.getTime());
        System.out.println("Ano: " + novoCalendario.get(Calendar.YEAR));
        System.out.println("Mês: " + novoCalendario.get(Calendar.MONTH));
        System.out.println("Dia: " + novoCalendario.get(Calendar.DAY_OF_MONTH));

        //Modificando a data
        novoCalendario.set(Calendar.YEAR, 2005);

        //Comparando as datas
        if(novoCalendario.get(Calendar.YEAR) == 2005){
            System.out.print("2005");
        }
        else{
            System.out.print("Não é 2005");
        }
    }
}
