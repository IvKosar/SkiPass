package Skipasses;

import java.util.Calendar;

public class Timer {

    static int dayOfWeek(int year, int month, int day){
        Calendar c1 = Calendar.getInstance();
        c1.set(year, month-1,day);

        int weekday = c1.get(Calendar.DAY_OF_WEEK);
        return weekday;
    }

    static String date(){
        return null;
    }
}
