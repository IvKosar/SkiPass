package Skipasses;

public class WeekdayCardDecorator extends Card {

    private Card card;
    WeekdayCardDecorator(Card card){
        this.card = card;
    }

    public void extend(CardOption o){
        card.extend(o);
    }

    Boolean useCard(){
        return this.card.useCard();
    }
}
