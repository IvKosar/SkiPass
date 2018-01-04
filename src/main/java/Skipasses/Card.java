package Skipasses;

public abstract class Card {
    int id;
    private Boolean isBanned = true;
    public abstract void extend(CardOption o);
//    Boolean useCard(){return null;}
    void ban(){
        this.isBanned = true;
    }

    void unban(){
        this.isBanned = false;
    }

    Boolean checkBan(){
        return this.isBanned;
    }

    abstract Boolean useCard();
}
