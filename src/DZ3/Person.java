package DZ3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Person implements Comparable<Person>, Iterable<Person> {
    private String name;
    private List<Person> people = new ArrayList<>();
    private int index = 0;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Person otherPerson) {
        return this.name.compareTo(otherPerson.getName());
    }

    @Override
    public String toString() {
        return name;
    }

    public void addPerson(Person person) {
        people.add(person);
    }

    @Override
    public Iterator<Person> iterator() {
        return new PersonIterator();
    }

    private class PersonIterator implements Iterator<Person> {
        @Override
        public boolean hasNext() {
            return index < people.size();
        }

        @Override
        public Person next() {
            if (hasNext()) {
                return people.get(index++);
            }
            return null;
        }
    }

    public static void main(String[] args) {
        Person person1 = new Person("Alice");
        Person person2 = new Person("Bob");
        Person person3 = new Person("Charlie");
        Person person4 = new Person("David");

        person1.addPerson(person1);
        person1.addPerson(person2);
        person1.addPerson(person3);
        person1.addPerson(person4);

        System.out.println("initial list: " + person1);

        Collections.sort(person1.people);
        System.out.println("sort by name: " + person1.people);

        Collections.sort(person1.people, new NameLengthComparator());
        System.out.println("sort by name length: " + person1.people);

        System.out.println("Iterating:");
        Iterator<Person> iterator = person1.iterator();
        while (iterator.hasNext()) {
            Person person = iterator.next();
            System.out.println("name: " + person.getName());
        }
    }
}

class NameLengthComparator implements Comparator<Person> {
    @Override
    public int compare(Person person1, Person person2) {
        return person1.getName().length() - person2.getName().length();
    }
}
