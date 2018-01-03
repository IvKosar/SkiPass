import Skipasses.*;

public class Main {
    public static void main(String[] args) {
        CardSystem cs = new CardSystem();
        Turnstile t1 = new Turnstile(cs);
        Turnstile t2 = new Turnstile();
        t2.connect_to(cs);

//        Card test1 = new DayCard(WeekdayDayCardOption.ONE);

        Card c1 = cs.getNewDayCard(WeekdayDayCardOption.FIVE);
        Card c2 = cs.getNewRideCard(RideCardOption.TEN,"weekday");

//        Card c3 = new RideCard(RideCardOption.TEN);

        System.out.println(t1.useCard(c2));
        System.out.println(t1.useCard(c2));
        System.out.println(t1.useCard(c2));
        System.out.println(t1.useCard(c2));

        c2.extend(RideCardOption.TEN);
        System.out.println("Extended");

        System.out.println(t1.useCard(c2));
        System.out.println(t1.useCard(c2));

    }
}
