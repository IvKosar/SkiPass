package Skipasses;

public class WeekendCardDecorator extends Card {

    private Card card;
    WeekendCardDecorator(Card card){
        this.card = card;
    }

    void extend(CardOption o){
        this.card.extend(o);
    }

    private Boolean is_valid(){
        String day = Timer.dayOfWeek(Timer.date());
        return day.equals("Sat") | day.equals("Sun");
    }

    Boolean useCard(){
//        if(this.is_valid()) {
//            return this.card.useCard();
//        }
//        return false;
        return this.is_valid() && this.card.useCard();
    }

    @Override
    public String toString() {
        return "Weekend "+this.card.toString();
    }

}
