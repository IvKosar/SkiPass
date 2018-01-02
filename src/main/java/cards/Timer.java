package cards;

import java.time.LocalDateTime;

public class Timer {

    static int daysInMonth(int month, int year){
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12){
            return 31;
        }else if(month == 4 || month == 6 || month == 9 || month == 11){
            return 30;
        }else if( (year%400==0) || (year%4==0 && year%100!=0)){
            return 29;
        }else{
            return 28;
        }
    }

    static int timeToSeconds(LocalDateTime time){
        //Seconds from 2015 year
        String str = time.toString();
        int seconds = Integer.parseInt(str.substring(17, 19));
        seconds += 60*Integer.parseInt(str.substring(14, 16));
        seconds += 3600*Integer.parseInt(str.substring(11, 13));
        //System.out.println(seconds);
        int year = Integer.parseInt(str.substring(0,4));
        int month = Integer.parseInt(str.substring(5,7));


        return seconds;
    }
}
