package Laba17;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class N1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String[] persons = scn.nextLine().split(" ");
        List<Person> list = new ArrayList<>();

        while (!persons[0].equalsIgnoreCase("stop")) {
            list.add(new Person(Integer.parseInt(persons[0]), persons[1]));
            persons = scn.nextLine().split(" ");
        }

        list.stream().sorted(new PersonComparator()).forEach(i -> System.out.println(i.getName().substring(0, 1).toUpperCase()
                + i.getName().substring(1)
                + ", " + i.getAge()));
    }
}
