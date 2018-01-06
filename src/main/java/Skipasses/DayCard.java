package Skipasses;

public class DayCard extends Card {

    private int days;
    private String last_check;
//    private String deadline;

    DayCard(int id, CardOption opt){
        this.id = id;
        this.days = 0;
        this.last_check = null;
        this.extend(opt);
    }

    private Boolean is_valid(){
        if(this.checkBan()) return false;

        String dat = Timer.date();
        if(dat.equals(this.last_check)){
            return true;
        }else{
            this.last_check = dat;
            this.days -= 1;
        }

        if(this.days < 0){
            this.ban();
            return false;
        }
        /*
        if(Integer.parseInt(dat.substring(0,4)) > Integer.parseInt(this.deadline.substring(0,4))){
            this.ban();
            return false;
        }
        if(Integer.parseInt(dat.substring(5,7)) > Integer.parseInt(this.deadline.substring(5,7))){
            this.ban();
            return false;
        }
        if(Integer.parseInt(dat.substring(8,10)) > Integer.parseInt(this.deadline.substring(8,10))){
            this.ban();
            return false;
        }
        */
        return true;
    }

    @Override
    void extend(CardOption o) {
        int plusDays = Integer.parseInt(o.toString());
        this.days += plusDays;
//        this.deadline = Timer.futureDate(plusDays-1);
        this.unban();
    }

    Boolean useCard(){
        return this.is_valid();
    }

    @Override
    public String toString() {
        String info = this.getClass().getName();
        info += "|ID="+Integer.toString(this.id);
//        info += "|rides left:"+Integer.toString(this.);
        info += "|days left:"+Integer.toString(this.days);
        return info;
    }

}
