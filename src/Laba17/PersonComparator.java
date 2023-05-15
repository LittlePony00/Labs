package Laba17;

import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        if (o1.getName().charAt(0) == o2.getName().charAt(0)){
            if (o1.getAge() > o2.getAge()) return 0;
            else return -1;

        }else return o1.getName().compareTo(o2.getName());
    }
}
