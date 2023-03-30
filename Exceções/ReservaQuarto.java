import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class ReservaQuarto {

    private Integer numeroQuarto;
    private Date checkIn;
    private Date checkOut;

    //É definido como stático para não ser instanciado um novo simpleDateFormat para cada novo objeto que aplicação tiver - é necessário apenas 1
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); 

    public ReservaQuarto(Integer numeroQuarto, Date checkIn, Date checkOut) throws DomainException {
        //Como BOA PRÁTICA é possível adicionar a verificação e lançamento de exceção no construtor da classe
        if(!checkOut.after(checkIn)){
            throw new DomainException("A data do check-out deve ser de depois do check-in");
        }
        this.numeroQuarto = numeroQuarto;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }


    public Integer getNumeroQuarto() {
        return this.numeroQuarto;
    }

    public void setNumeroQuarto(Integer numeroQuarto) {
        this.numeroQuarto = numeroQuarto;
    }

    public Date getCheckIn() {
        return this.checkIn;
    }

    public Date getCheckOut() {
        return this.checkOut;
    }


    public long Duracao(){
        //o método getTime() pega os milessegundos da data
        long diferencaDatas = checkOut.getTime() - checkIn.getTime();
        //A classe TimeUnit irá converter esses milessegundos em dias
        //O primeiro parâmetro é a diferença que se quer converter e o segundo é o tipo de dados dessa variável
        return TimeUnit.DAYS.convert(diferencaDatas, TimeUnit.MILLISECONDS);

    }

    //Irá propagar a exceção personalizada pelo método AtualizaDatas
    public void AtualizaDatas(Date checkIn, Date checkOut) throws DomainException{
        Date now = new Date();
        if(checkIn.before(now) || checkOut.before(now)){
            //Com o throw é possível instanciar uma nova exceção
            //É adicionada a classe personalizada DomainException 
            throw new DomainException("Reserva de datas devem ser futuras");
        }
        if(!checkOut.after(checkIn)){
            throw new DomainException("A data do check-out deve ser de depois do check-in");
        }
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    @Override
    public String toString(){
        return "Quarto " + numeroQuarto + ", check-in: " + sdf.format(checkIn) + ", check-out: " + sdf.format(checkOut) + ", " + Duracao() + " noites.";
    }
}
