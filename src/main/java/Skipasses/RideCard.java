package Skipasses;

public class RideCard extends Card {

    private int rides = 0;
    RideCard(int id, RideCardOption opt){
        this.id = id;
        extend(opt);
    }

    private Boolean is_valid(){
        if(this.checkBan()) return false;
        if(this.rides <= 0){
            this.ban();
            return false;
        }
        return true;
    }

    void extend(CardOption rides){
        this.rides += Integer.parseInt(rides.toString());
        this.unban();
    }

    public Boolean useCard(){
        if(this.is_valid()){
            this.rides -= 1;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        String info = this.getClass().getName();
        info += "|ID="+Integer.toString(this.id);
        info += "|rides left:"+Integer.toString(this.rides);
        return info;
    }
}
