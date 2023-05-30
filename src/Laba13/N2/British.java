package Laba13.N2;

public class British implements Person{

    String name;

    public British(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String sayHello() {
        return "Hello!";
    }
}
