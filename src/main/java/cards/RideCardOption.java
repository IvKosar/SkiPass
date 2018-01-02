package cards;

public enum RideCardOption implements CardOption{
    TEN("10"), TWENTY("20"), FIFTY("50"), HUNDRED("100");

    String ride;
    RideCardOption(String rides){
        this.ride = rides;
    }

    @Override
    public String toString() {
        return this.ride;
    }
}
