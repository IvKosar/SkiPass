package Skipasses;

public class Turnstile {

    CardSystem system;
    public Turnstile(){

    }

    public Turnstile(CardSystem cs){
        this.system = cs;
    }

    public void connect_to(CardSystem cs){
        this.system = cs;
    }

    public Boolean useCard(Card card){
        return true;
    }
}
