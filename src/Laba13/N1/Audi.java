package Laba13.N1;

public class Audi implements Car {

    String model;
    String color;
    int horsePower;
    String countryProducer;

    public Audi(String model, String color, int horsePower, String countryProducer) {
        this.model = model;
        this.color = color;
        this.horsePower = horsePower;
        this.countryProducer = countryProducer;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public int getHorsePower() {
        return horsePower;
    }

    @Override
    public String toString() {
        return "This is " + model
                + " produced in "
                + countryProducer
                + " and have "
                + TIRES + " tires";
    }
}