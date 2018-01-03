package Skipasses;

import java.util.ArrayList;
import java.util.List;

public class CardSystem {

    private List<Card> cards;
    public CardSystem(){
        this.cards = new ArrayList<Card>();
    }

    void add_card(Card card){
        this.cards.add(card);
    }

    public Card getNewRideCard(RideCardOption opt, String weekday_type){
        RideCard c = new RideCard(opt);
        Card result = null;
        if(weekday_type.equals("weekday")){
            result = new WeekdayCardDecorator(c);
        }else if(weekday_type.equals("weekend")){
            result = new WeekendCardDecorator(c);
        }

        if(result != null) {
            this.cards.add(result);
            return result;
        }
        return null;
    }

    public Card getNewDayCard(WeekdayDayCardOption opt){
        return new WeekdayCardDecorator(new DayCard(opt));
    }

    public Card getNewDayCard(WeekendDayCardOption opt){
        return new WeekendCardDecorator(new DayCard(opt));
    }
}
