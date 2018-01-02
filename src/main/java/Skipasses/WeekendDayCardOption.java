package Skipasses;

public enum WeekendDayCardOption {
    ONE("1"), TWO("2");

    String days;

    WeekendDayCardOption(String days){
        this.days = days;
    }

    @Override
    public String toString() {
        return this.days;
    }
}
