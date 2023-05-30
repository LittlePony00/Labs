package Laba13.N3;

public class Russian extends BasePerson {
    public Russian(String name) {
        super(name);
    }


    @Override
    public String sayHello() {
        return "Привет!";
    }

}
