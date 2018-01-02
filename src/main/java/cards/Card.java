package cards;

public abstract class Card {
    Boolean isBanned = true;
    abstract Boolean is_valid();
    public abstract void extend(CardOption o);
    abstract Boolean useCard();
}
