package Laba12.N3;

public class Parallelogram extends Quadrilateral{
    protected Parallelogram(int[] sides) {
        super(sides);
    }


    public String toString() {
        return String.format(
                "Parallelogram contains 4 sides\n"
                        + "Its perimeter "
                        + Perimetr() + "\n"
        );
    }
}
