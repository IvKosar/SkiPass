package Skipasses;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class Timer {

    public static String dayOfWeek(String date){
        SimpleDateFormat format1=new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date dt1 = format1.parse(date);
            return dt1.toString().substring(0, 3);
        }catch (Exception e){
            return "Error";
        }

    }

    public static String date(){
        return Timer.futureDate(0);

    }

    public static int daysBetween(String d2){
        String d1 = Timer.date();
        SimpleDateFormat f1 = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date da1 = f1.parse(d1);
            Date da2 = f1.parse(d2);
            long diff = da2.getTime() - da1.getTime();
            diff /= (1000*60*60*24);
            return (int)diff;
        }catch (Exception e){
            return 0;
        }
    }

    public static String futureDate(int days){
        LocalDate d = LocalDate.now().plusDays(days);
        return d.toString();
    }

    public static Boolean isWeekend(String date){
        String dayOfWeek = Timer.dayOfWeek(date);
        return dayOfWeek.equals("Sun") | dayOfWeek.equals("Sat");
    }

    public static Boolean isWeekday(String date){
        return !Timer.isWeekend(date);
    }
}
