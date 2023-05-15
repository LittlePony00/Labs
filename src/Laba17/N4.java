package Laba17;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class N4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String[] persons = scn.nextLine().split(" ");
        List<Person> list = new ArrayList<>();

        while (!persons[0].equalsIgnoreCase("girls")
                && !persons[0].equalsIgnoreCase("boys")) {
            list.add(new Person(persons[0], persons[1]));
            persons = scn.nextLine().split(" ");
        }

        if (persons[0].equalsIgnoreCase("boys"))
            list.stream().filter(s -> s.getLastName().equalsIgnoreCase("М"))
                    .forEach(s -> System.out.println(s.getName()));
        else if (persons[0].equalsIgnoreCase("girls"))
            list.stream().filter(s -> s.getLastName().equalsIgnoreCase("Д")).forEach(s -> System.out.println(s.getName()));
    }
}

