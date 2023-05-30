package Laba13.N1;

public class Main {

    public static void main(String[] args) {
        Audi audi = new Audi("R8", "gray", 510, "Spain");
        System.out.printf("%s is %s color and have %s horse power%n", audi.getModel(), audi.getColor(),
                audi.getHorsePower());

        System.out.println(audi);
    }
}
