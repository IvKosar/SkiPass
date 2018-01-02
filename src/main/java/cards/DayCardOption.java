package cards;

public enum DayCardOption implements CardOption{
    ONE("1"), TWO("2"), FIVE("5");

    String days;
    DayCardOption(String days){
        this.days = days;
    }

    @Override
    public String toString() {
        return this.days;
    }
}
