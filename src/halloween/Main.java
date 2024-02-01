package halloween;

public class Main {
    public static void main(String[] args) {

// Initialize the repository
        House house = new House(3);

// Initialize entity
        Kid firstKid = new Kid("Yoana", 10, "Osogovska");
        Kid secondKid = new Kid("marty", 20, "ligma");
        Kid thirdKid = new Kid("ivan", 20, "ligma");
        Kid forthKid = new Kid("lol", 20, "ligma");

        house.addKid(firstKid);
        house.addKid(secondKid);
        house.addKid(thirdKid);
        house.addKid(forthKid);

        System.out.println(house.getStatistics());


    }
}
