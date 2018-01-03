package Skipasses;

public class WeekdayCardDecorator extends Card {

    Card card;
    WeekdayCardDecorator(Card card){
        this.card = card;
    }

    public void extend(CardOption o){
        card.extend(o);
    }
}
