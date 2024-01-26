package DefiningClasses_Excercise.test;

public class Trainer {
    private String name;
    private int badges;

    public int getBadges() {
        return badges;
    }

    @Override
    public String toString() {
        return String.format("%s %d", name, badges);
    }

    public Trainer(String name, int badges) {
        this.name = name;
        this.badges = badges;
    }
}
