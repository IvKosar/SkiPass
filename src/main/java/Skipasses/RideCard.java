package Skipasses;

public class RideCard extends Card {

    private int rides = 0;
    RideCard(int id, RideCardOption opt){
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

    public void extend(CardOption rides){
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
}
