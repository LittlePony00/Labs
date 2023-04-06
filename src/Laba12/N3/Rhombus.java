package Laba12.N3;

public class Rhombus extends Quadrilateral{
    public Rhombus(int[] sides) {
        super(sides);
    }


    public String toString() {
        return String.format(
                "Rhombus contains 4 sides\n"
                        + "Its perimeter "
                        + Perimetr() + "\n"
        );
    }

}
