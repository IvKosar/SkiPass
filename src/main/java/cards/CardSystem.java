package cards;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class CardSystem {

    private List<Card> cards = new ArrayList<Card>();

    public Card getNewCard(DayCardOption days){

        Calendar c1 = Calendar.getInstance();
        c1.set(2017,Calendar.JANUARY,1);

        int day = c1.get(Calendar.DAY_OF_WEEK);

        if(day > 5 && (days != DayCardOption.ONE  && days != DayCardOption.TWO)){
            System.out.println("You are not allowed to buy this type of card now!1");
            return null;
        }

        if(day > 1 && days == DayCardOption.FIVE){
            System.out.println("You are not allowed to buy this type of card now!2");
            return null;
        }
        if(day == 5 && days == DayCardOption.TWO){
            System.out.println("You are not allowed to buy this type of card now!3");
            return null;
        }

        DayCard card = new DayCard(days);
        this.cards.add(card);
        return card;
    }

    public Card getNewCard(RideCardOption rides){
        RideCard card = new RideCard(rides);
        this.cards.add(card);
        return card;
    }


}
