package halloween;

public class Kid {
    private String name;
    private int age;
    private String street;

    @Override
    public String toString() {
        return String.format("%s, %d years old, from %s\n", name, age , street);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Kid(String name, int age, String street) {
        this.name = name;
        this.age = age;
        this.street = street;
    }
}
