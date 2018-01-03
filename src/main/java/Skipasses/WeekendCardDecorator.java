package Skipasses;

public class WeekendCardDecorator extends Card {

    Card card;
    WeekendCardDecorator(Card card){
        this.card = card;
    }

    public void extend(CardOption o){
        this.card.extend(o);
    }
}
