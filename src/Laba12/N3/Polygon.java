package N3;

import java.util.Arrays;

public class Polygon {
    int[] sides;

    protected Polygon(int[] sides) {
        this.getSidesCount(sides);
    }

    protected void getSidesCount(int[] sides) {
        if (sides.length == 0 || sides.length == 2) {
            throw new IllegalArgumentException("Sides should be equal 1 or be more than 2");
        } else {
            for (int i = 0; i < sides.length; i++) {
                int sum = 0;
                for (int j = 0; j < sides.length; j++) {
                    if (sides[j] < 1) throw new IllegalArgumentException("Side should be more than 0");
                    sum += (i != j) ? sides[j] : 0;
                }

                if (sides[i] >= sum && sum != 0) throw new IllegalArgumentException("Wrong value");
            }
        }

        this.sides = sides;
    }

    public double Perimetr() {
        return Arrays.stream(this.sides).sum();

}
    public String toString() {
        return String.format(
                "Polygon contains " + sides.length + " sides\n"
                + "Its perimeter " + Perimetr()
        );
    }

    public Polygon createPolygon(String numbers) {

        switch (numbers.split(" ").length) {
            case 1 -> {
                return new Circle(sides);
            }
            case 3 -> {
                return new Triangle(sides);
            }

            case 4 -> {
                if (sides[0] == sides[1] && sides[1] == sides[2] && sides[2] == sides[3])
                    return new Rhombus(sides);
                else if (
                        (sides[0] == sides[1] && sides[2] == sides[3])
                        || (sides[1] == sides[3] && sides[0] == sides[2])
                        || (sides[0] == sides[3] && sides[1] == sides[2])
                ) return new Parallelogram(sides);
                else
                    return new Quadrilateral(sides);
            }
        }
        return new Polygon(sides);
    }
}


