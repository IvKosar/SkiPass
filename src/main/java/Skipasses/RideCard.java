package Skipasses;

public class RideCard extends Card {

    int rides;
    RideCard(RideCardOption opt){
        extend(opt);
    }

    public Boolean is_valid(){
        if(this.isBanned) return false;
        if(this.rides <= 0){
            this.isBanned = true;
            return false;
        }
        return true;
    }

    public void extend(CardOption rides){
        this.rides += Integer.parseInt(rides.toString());
        this.isBanned = false;
    }

    public Boolean useCard(){
        if(this.is_valid()){
            this.rides -= 1;
            return true;
        }
        return false;
    }
}
