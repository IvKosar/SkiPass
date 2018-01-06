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

    public Card getNewCard(RideCardOption opt, String weekday_type){
        RideCard c = new RideCard(this.cards.size(), opt);
        Card result = null;
        if(weekday_type.equals("weekday")){
            result = new WeekdayCardDecorator(c);
        }else if(weekday_type.equals("weekend")){
            result = new WeekendCardDecorator(c);
        }

        if(result != null) {
            this.add_card(result);
            return result;
        }
        return null;
    }

    public Card getNewCard(WeekdayDayCardOption opt){
        Card result = new WeekdayCardDecorator(new DayCard(this.cards.size(), opt));
        this.add_card(result);
        return result;
    }

    public Card getNewCard(WeekendDayCardOption opt){
        Card result = new WeekendCardDecorator(new DayCard(this.cards.size(), opt));
        this.add_card(result);
        return result;
    }

    public void extend(Card card, CardOption o){
        card.extend(o);
    }
}
