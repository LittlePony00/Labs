package Laba17;

public class Person {
    private  int age;
    private final String name;
    private  String lastName;

    private  String thirdName;

    protected Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    protected Person(int age, String name, String lastName, String thirdName) {
        this.age = age;
        this.name = name;
        this.lastName = lastName;
        this.thirdName = thirdName;
    }

    protected Person(String lastName, String name) {
        this.lastName = lastName;
        this.name = name;
    }
    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getThirdName() {
        return thirdName;
    }
}
