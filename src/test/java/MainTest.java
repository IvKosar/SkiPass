import Skipasses.*;
import org.junit.Test;

import static org.junit.Assert.*;


public class MainTest {
    @Test
    public void main() {
        CardSystem cs = new CardSystem();
        Turnstile turnstile1 = new Turnstile(cs);
        Turnstile turnstile2 = new Turnstile();
        turnstile2.connect_to(cs);

        Card card0 = cs.getNewCard(RideCardOption.HUNDRED, "fail");
        Card card1 = cs.getNewCard(RideCardOption.FIFTY, "weekday");
        Card card2 = cs.getNewCard(RideCardOption.TEN, "weekend");
        Card card3 = cs.getNewCard(WeekendDayCardOption.ONE);
        Card card4 = cs.getNewCard(WeekdayDayCardOption.ONE);

        assertEquals(card1.toString(), "Weekday Skipasses.RideCard|ID=0|rides left:50");
        assertEquals(card3.toString(), "Weekend Skipasses.DayCard|ID=2|days left:1");

        assertEquals(turnstile1.useCard(card1),false);
        assertEquals(turnstile2.useCard(card2),true);
        assertEquals(turnstile1.useCard(card3),true);
        assertEquals(turnstile2.useCard(card3),true);
        assertEquals(turnstile2.useCard(card4),false);



        for(int i=0;i<10;i++){
            turnstile1.useCard(card2);
        }

        cs.extend(card1, RideCardOption.TEN);
        cs.extend(card3, WeekendDayCardOption.ONE);

        Timer not_used_timer = new Timer();
        assertEquals(Timer.date(),"2018-01-06");
        assertEquals(Timer.dayOfWeek("2018/01/06"),"Error");

    }

}
