import cards.*;

public class Main {
    public static void main(String[] args) {
        CardSystem cs = new CardSystem();
        Turnstile t1 = new Turnstile(cs);
        Turnstile t2 = new Turnstile();
        t2.connect_to(cs);

//        Card test1 = new DayCard(DayCardOption.ONE);

        Card c1 = cs.getNewCard(DayCardOption.FIVE);
        Card c2 = cs.getNewCard(RideCardOption.TEN);

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
