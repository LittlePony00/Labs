package Laba12.N1;

public class Airplane extends Venicle{
    private int wingsCount;
    private int engineNumber;
    private boolean isHydroPlane;

    public Airplane(int passengers, int wingsCount, int engineNumber, boolean isHydroPlane) {
        super(passengers);
        if (wingsCount < 0) throw new IllegalArgumentException("Argument should be more than 0");
        else
            this.wingsCount = wingsCount;

        if (engineNumber < 0) throw new IllegalArgumentException("Argument should be more than 0");
        else
            this.engineNumber = engineNumber;

        this.isHydroPlane = isHydroPlane;
    }

    public int getWingsCount() {
        return wingsCount;
    }

    public int getEngineNumber() {
        return engineNumber;
    }

    public boolean isHydroPlane() {
        return isHydroPlane;
    }

    public void setWingsCount(int wingsCount) {
        this.wingsCount = wingsCount;
    }

    public void setEngineNumber(int engineNumber) {
        this.engineNumber = engineNumber;
    }

    public void setHydroPlane(boolean hydroPlane) {
        isHydroPlane = hydroPlane;
    }

    public String writeInformation(){
        if (isHydroPlane)
            return String.format("""
                    In a Hydroplane %d passengers
                    With %d wings and\s
                    %d engines""", this.passengers, this.wingsCount, this.engineNumber);
        else
            return String.format("In an Laba12.N1.Airplane %d passengers\n" +
                    "With %d wings and %d engines", this.passengers, this.wingsCount, this.engineNumber);
    }
}
