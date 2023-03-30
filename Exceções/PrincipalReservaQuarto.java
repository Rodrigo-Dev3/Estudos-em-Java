import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class PrincipalReservaQuarto {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try {
            System.out.print("Número do quarto: ");
            int numero = scan.nextInt();
    
            System.out.print("Check-in: ");
            Date checkin = sdf.parse(scan.next());
    
            System.out.print("Check-out: ");
            Date checkout = sdf.parse(scan.next());
    
            ReservaQuarto novaReserva = new ReservaQuarto(numero, checkin, checkout);
            System.out.print("Reserva: " + novaReserva);
            System.out.println();
    
            System.out.println("Insira a atualização das datas e do quarto");
            System.out.print("Número do quarto: ");
            numero = scan.nextInt();
    
            System.out.print("Check-in: ");
            checkin = sdf.parse(scan.next());
    
            System.out.print("Check-out: ");
            checkout = sdf.parse(scan.next());
    
            // Utiliza o método criado para atualizar as datas anteriores
            novaReserva.AtualizaDatas(checkin, checkout);
            System.out.print("Reserva: " + novaReserva);

        } 
        catch (ParseException e) {
            System.out.println("Datá inválida");
        }
        catch (DomainException e) {
            System.out.print("Erro de reserva: " + e.getMessage());
        }

        scan.close();
    }
}
