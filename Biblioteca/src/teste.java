import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class teste {
    public static void main(String[] args) {
//monthValue retorna o mes em numero 1=janeiro 2= fevereiro etc;
        LocalDateTime datatime = LocalDateTime.now();

        System.out.print("DATA: " + datatime.getYear() + " - " + datatime.getMonth() + " - " + datatime.getDayOfMonth());
        System.out.println("\nHoras: " + datatime.getHour() + ":" + datatime.getMinute() + ":" + datatime.getSecond());

        //System.out.println(datatime.getNano());
        System.out.println(datatime.getDayOfMonth());
        System.out.println(datatime.getDayOfYear());
        System.out.println(datatime.getDayOfWeek());


        LocalDateTime inicio = LocalDateTime.now();
        LocalDateTime fim = LocalDateTime.of(2022, 7, 7, 18, 25, 35);


        System.out.println();
        System.out.println(datatime);

        // Duration bet= Duration.between(inicio,fi
        //period

    }

    public static void Tratamento1() {

    }



}