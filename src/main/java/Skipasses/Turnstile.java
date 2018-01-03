package Skipasses;

public class Turnstile {

    CardSystem system;
    public Turnstile(){

    }

    public Turnstile(CardSystem cs){
        this.system = cs;
    }

    public void connect(CardSystem cs){
        this.system = cs;
    }
}
