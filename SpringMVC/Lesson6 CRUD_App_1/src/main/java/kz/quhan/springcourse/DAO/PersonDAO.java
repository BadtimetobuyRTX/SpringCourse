package kz.quhan.springcourse.DAO;

import kz.quhan.springcourse.models.Person;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PersonDAO {
    private List<Person> people;

    {
        people = new ArrayList<>();

        people.add(new Person(1, "Tom"));
        people.add(new Person(2, "Larry"));
        people.add(new Person(3, "Katty"));
        people.add(new Person(4, "Jerry"));
    }

    public List<Person> index() {
        return people;
    }

    public Person show(int id) {
        return people.stream().filter(person -> person.getId() == id).findAny().orElse(null);
    }
}
