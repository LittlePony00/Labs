package Laba12.N1;

public class Venicle {
    protected int passengers;

    public Venicle(int passengers) {
        if (passengers <= 0) throw new IllegalArgumentException("Argument should be more than 0");
        else
            this.passengers = passengers;
    }

    protected void setPassengers(int passengers) {
        this.passengers = passengers;
    }
}