package Laba13.N2;

public class Chinese implements Person{
    String name;

    public Chinese(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String sayHello() {
        return "Ni Hao!";
    }
}
