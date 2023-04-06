package N3;

import java.util.Arrays;
import java.util.Scanner;

public class Main extends Polygon{
    public Main(int[] sides) {
        super(sides);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] sides = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        System.out.println(new Polygon(sides).createPolygon(Arrays.toString(sides)));

    }
}
