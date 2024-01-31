package tempObjects.OpinionPoll;

public class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return String.format("%s - %d",name,age);
    }

    public int getAge() {
        return age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
