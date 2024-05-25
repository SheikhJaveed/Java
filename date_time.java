import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;  //to format date and time

public class date_time {
    public static void main(String[] args) {
        String day = findDay(7, 5, 2022);
        System.out.println(day);

        //date
        LocalDateTime myDateobj = LocalDateTime.now();
        System.out.println("Before formatting: "+myDateobj);
        DateTimeFormatter myFormatobj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        String formattedDate = myDateobj.format(myFormatobj);
        System.out.println("After formatting: " + formattedDate);

    }
    private static String findDay(int i,int j,int k){
        LocalDate myDate = LocalDate.of(2022, 5, 7);
        DayOfWeek day_of_week = myDate.getDayOfWeek(); //finds the day of the week

        return day_of_week.toString();
    }
}
