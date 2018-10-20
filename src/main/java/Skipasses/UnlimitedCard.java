package Skipasses;

public class UnlimitedCard extends Card {

    UnlimitedCard(int id, CardOption opt){
        this.id = id;
        }

    private Boolean is_valid(){
        // This card is always valid
        return true;        
        }
        
    @Override
    void extend(CardOption o) {
        return
    }

    Boolean useCard(){
        return this.is_valid();
    }

    @Override
    public String toString() {
        String info = this.getClass().getName();
        info += "|ID="+Integer.toString(this.id);
        info += "|days left: infinite";
        return info;
    }

}
