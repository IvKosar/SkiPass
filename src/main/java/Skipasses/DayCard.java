package Skipasses;

public class DayCard extends Card {

    private int days;
    private int last_check;
    DayCard(int id, CardOption opt){
        this.extend(opt);
    }

    @Override
    void extend(CardOption o) {
        this.days += Integer.parseInt(o.toString());
        this.unban();
    }

    Boolean useCard(){
        return null;
    }
}
