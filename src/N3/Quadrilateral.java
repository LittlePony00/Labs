package N3;

public class Quadrilateral extends Polygon{
    public Quadrilateral(int[] sides) {
        super(sides);
    }

    public String toString() {
        return String.format(
                "Quadrilateral contains 4 sides\n"
                + "Its perimeter "
                + Perimetr() + "\n"
        );
    }


}
