package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PersonMain {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Darek", 25));
        personList.add(new Person("Esther", 29));
        personList.add(new Person("Isam", 27));
        personList.sort(new NameComparator());
        System.out.println(personList);

        personList.sort((x, y) -> Integer.valueOf(x.getAge()).compareTo(Integer.valueOf(y.getAge())));
        System.out.println(personList);

//        for (Person p : personList) {
//            System.out.println(p);
//        } //or
        personList.forEach(p -> System.out.println(p));

    }
}
