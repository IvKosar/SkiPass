package Skipasses;

import java.util.ArrayList;
import java.util.List;

public class CardSystem {

    List<Card> cards;
    public CardSystem(){
        this.cards = new ArrayList<Card>();
    }

    void add_card(Card card){
        this.cards.add(card);
    }

    public Card getNewRideCard(RideCardOption opt, String weekday_type){
        RideCard c = new RideCard(opt);
        if(weekday_type == "weekday"){
            return new WeekdayCardDecorator(c);
        }else if(weekday_type == "weekend"){
            return new WeekendCardDecorator(c);
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
