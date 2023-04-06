package Laba12.N3;

public class Circle extends Polygon{
    protected Circle(int[] sides) {
        super(sides);
    }

    protected double getArea() {
        return Math.PI * sides[0];
    }

    public String toString() {
        return String.format(
                "Circle radius is "
                + sides[0] + "\n"
                + "Its perimeter "
                + Perimetr() + "\n"
                + "Its area is "
                + getArea()
        );
    }

}
