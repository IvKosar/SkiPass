package Skipasses;

public class DayCard extends Card {

    int days;
    int last_check;
    DayCard(CardOption opt){
        this.extend(opt);
    }

    @Override
    public void extend(CardOption o) {
        this.days += Integer.parseInt(o.toString());
        this.isBanned = false;
    }
}
