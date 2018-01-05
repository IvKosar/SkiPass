package Skipasses;

public class WeekdayCardDecorator extends Card {

    private Card card;
    WeekdayCardDecorator(Card card){
        this.card = card;
    }

    public void extend(CardOption o){
        card.extend(o);
    }

    private Boolean is_valid(){
        String day = Timer.dayOfWeek(Timer.date());
        return !(day.equals("Sat") | day.equals("Sun"));
    }

    Boolean useCard(){
        if(this.is_valid()) {
            return this.card.useCard();
        }
        return false;
    }
}
