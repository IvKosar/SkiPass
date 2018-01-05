package Skipasses;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
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
        String data = LocalDateTime.now().toString();
        return data.substring(0,10);
    }
}
