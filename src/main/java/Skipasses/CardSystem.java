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

    void getNewRideCard(RideCardOption opt, String weekday_type){
        RideCard c = new RideCard(opt);
    }
}
