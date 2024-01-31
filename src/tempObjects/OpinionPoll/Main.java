package tempObjects.OpinionPoll;

import java.util.*;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int n = Integer.parseInt(scanner.nextLine());

        Set<Person> people = new TreeSet<>(Comparator.comparing(Person::getName));

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            String name = input[0];
            int age = Integer.parseInt(input[1]);
            Person person = new Person(name, age);
            people.add(person);

        }
        people.stream().filter(p -> p.getAge() > 30).forEach(System.out::println);

    }
}
