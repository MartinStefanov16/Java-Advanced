package DefiningClasses_Excercise.P01OpinionPoll;

import java.util.*;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        Set<Person> peopleList = new TreeSet<>(Comparator.comparing(Person::getName));

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");
            String name = input[0];
            int age = Integer.parseInt(input[1]);

            Person person = new Person(name, age);
            peopleList.add(person);

        }

        peopleList.stream().filter(p -> p.getAge() > 30).forEach(System.out::println);


    }
}
