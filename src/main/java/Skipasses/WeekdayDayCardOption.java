package Skipasses;

public enum WeekdayDayCardOption {
    ONE("1"), TWO("2"), FIVE("5");

    String days;

    WeekdayDayCardOption(String days){
        this.days = days;
    }

    @Override
    public String toString() {
        return this.days;
    }
}