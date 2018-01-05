import Skipasses.*;

public class Main {
    public static void main(String[] args){
        CardSystem cs = new CardSystem();
        Turnstile t1 = new Turnstile(cs);
        Turnstile t2 = new Turnstile();
        t2.connect_to(cs);

//        Card test1 = new DayCard(WeekdayDayCardOption.ONE);
//        Card test2 = new RideCard(RideCardOption.TEN);

        Card c1 = cs.getNewCard(WeekdayDayCardOption.FIVE);

        /* RideCard test
        Card c2 = cs.getNewCard(RideCardOption.TEN,"weekday");


        for(int i=0;i<11;i++) {
            System.out.println(t1.useCard(c2));
        }


        c2.extend(RideCardOption.TEN);
        System.out.println("Extended");

        for(int i=0;i<11;i++) {
            System.out.println(t1.useCard(c2));
        }
        */

        Card weekTest1 = cs.getNewCard(WeekendDayCardOption.ONE);
        System.out.println(t1.useCard(weekTest1));
        System.out.println(Timer.futureDate(5));

    }
}
