package cards;

public class DayCard extends Card {

    private int deadline = 0;

    protected DayCard(DayCardOption days){
        this.extend(days);
    }

    public Boolean is_valid(){
        if(this.isBanned) return false;
        if(this.deadline < System.currentTimeMillis()/1000l){
            this.isBanned = true;
            return false;
        }
        return true;
    }

    public void extend(CardOption days){
        if(this.isBanned){
            this.deadline = (int) (System.currentTimeMillis()/1000l) + Integer.parseInt(days.toString())*24*60*60;
            this.isBanned = false;
        }else{
            this.deadline += Integer.parseInt(days.toString())*24*60*60;
        }
    }

    public Boolean useCard(){
        return null;
    }
}
