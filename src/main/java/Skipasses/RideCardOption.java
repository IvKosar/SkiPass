package Skipasses;

public enum RideCardOption {
    TEN("10"), TWENTY("20"), FIFTY("50"), HUNDRED("100");

    String rides;

    RideCardOption(String rides){
        this.rides = rides;
    }

    @Override
    public String toString() {
        return this.rides;
    }

}
