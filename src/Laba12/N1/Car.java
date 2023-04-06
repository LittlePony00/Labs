package Laba12.N1;

public class Car extends Venicle {

    private int horsepower;
    private String model;

    public Car(int passengers, int horsepower, String model) {
        super(passengers);

        if (horsepower < 0) throw new IllegalArgumentException("Argument should be more than 0");
        else
            this.horsepower = horsepower;

        if (model.length() < 2) throw new IllegalArgumentException("Name of model should be more than 1 symbol");
        else
            this.model = model;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public String getModel() {
        return model;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    public void setModel(String model) {
        this.model = model;
    }


    public String writeInformation() {
        return String.format("In a Laba12.N1.Car %d passengers %n" +
                "With %d horse power on %s", this.passengers, this.horsepower, this.model);
    }
}
