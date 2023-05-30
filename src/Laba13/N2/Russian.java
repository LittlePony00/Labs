package Laba13.N2;

public class Russian implements Person{

    String name;

    public Russian(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String sayHello() {
        return "Привет!";
    }
}
