package Laba17;

import java.util.Comparator;

public class PersonComparatorN2 implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        if (o1.getAge() > o2.getAge()) return -1;
        else if (o1.getAge() < o2.getAge()) return 1;
        else if (o1.getAge() == o1.getAge()) {
            if (o1.getName().charAt(0) == o2.getName().charAt(0))
                return Character.compare(o1.getThirdName().charAt(0), o2.getThirdName().charAt(0));
        }

        return Character.compare(o1.getName().charAt(0), o2.getName().charAt(0));
    }
}
