package lab11.task1;
import java.time.LocalDate;
import java.util.Date;

public class MyDates {
    public static void main(String[] args) {
        System.out.println("name of creator:Chernenko Valeri");
        LocalDate localDate = LocalDate.of(2022, 12, 11);
        System.out.println("date of create programm:"+localDate);
        System.out.println("date of pass programm:");
        Date date = new Date(2022, 12, 11, 14, 4);
        System.out.println(date);
    }
}
