package Laba13.N3;

public class Main {
    public static void main(String[] args) {
        Person[] persons = new Person[3];
        persons[0] = new Russian("Никита");
        persons[1] = new British("Pasha");
        persons[2] = new Chinese("Jordi");

        for (Person person : persons)
            System.out.println(person.getName() + ": " + person.sayHello());
    }
}
