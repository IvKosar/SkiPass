package Skipasses;

public class WeekendCardDecorator extends Card {

    private Card card;
    WeekendCardDecorator(Card card){
        this.card = card;
    }

    public void extend(CardOption o){
        this.card.extend(o);
    }

    private Boolean is_valid(){
        String day = Timer.dayOfWeek(Timer.date());
        return day.equals("Sat") | day.equals("Sun");
    }

    Boolean useCard(){
        if(this.is_valid()) {
            return this.card.useCard();
        }
        return false;
    }
}
