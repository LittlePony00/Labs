package Laba17;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class N2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String[] persons = scn.nextLine().split(" ");
        List<Person> list = new ArrayList<>();

        while (!persons[0].equalsIgnoreCase("stop")){
            list.add(new Person(Integer.parseInt(persons[3]), persons[1], persons[0], persons[2]));
            persons = scn.nextLine().split(" ");
        }

        list.stream().sorted(new PersonComparatorN2()).forEach(s -> System.out.println(
                s.getAge() + " " + s.getLastName().charAt(0) + "." + s.getName().charAt(0) + ". " + s.getThirdName() + "\n"
        ));


        list.stream().sorted(new PersonComparatorLastNameFirstN2()).forEach(s -> System.out.println(
                s.getLastName() + " " + s.getName().charAt(0) + "." + s.getThirdName().charAt(0) + ". " + s.getAge()
        ));
    }
}
