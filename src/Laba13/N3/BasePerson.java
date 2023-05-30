package Laba13.N3;

public abstract class BasePerson implements Person{
    private final String name;

    public BasePerson(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String sayHello() {
        return null;
    }
}
