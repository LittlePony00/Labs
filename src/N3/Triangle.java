package N3;

public class Triangle extends Polygon{
    public Triangle(int[] sides) {
        super(sides);
    }

    public double getInRadius(){
        double p = Perimetr() / 2;
        return Math.sqrt(p * (p - sides[0]) * (p - sides[1]) * (p-sides[2])) / p;
    }

    public String toString() {
        return "Triangle contains 3 sides\n"
                + "Its perimetr: " + Perimetr() + "\n"
                + "Its radius of incircle: " + getInRadius();
    }
}
