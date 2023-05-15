package Laba17;

import java.util.Comparator;

public class PersonComparatorLastNameFirstN2 implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        if (o1.getLastName().equalsIgnoreCase(o2.getLastName())) {
            if (o1.getName().charAt(0) == o2.getName().charAt(0))
                return 0;
            else if (o1.getAge() > o2.getAge()) return -1;
            else return 1;
        }

        return o1.getLastName().compareTo(o2.getLastName());
    }
}
