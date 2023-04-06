package Laba11;

public class Boat extends Venicle{

    private int oarscount;

    public Boat(int passengers, int oarscount) {
        super(passengers);
        if (oarscount <= 0) throw new IllegalArgumentException("Argument should be more than 0");
        else
            this.oarscount = oarscount;
    }

    public void setOarscount(int oarscount) {
        this.oarscount = oarscount;
    }

    public int getOarscount() {
        return oarscount;
    }

    public String writeInformation (){
        return String.format("In a Laba11.Boat %d passengers %nWith %d oars", this.passengers, this.oarscount);
    }
}
