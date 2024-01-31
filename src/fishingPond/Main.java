package fishingPond;

public class Main {
    public static void main(String[] args) {

        //TODO

        Pond pond = new Pond(5);

        Fish trout = new Fish("Trout", 5, "winter");
        Fish perch = new Fish("Perch", 2, "summer");
        Fish pike = new Fish("Pike", 4, "spring");
        Fish catfish = new Fish("Catfish", 8, "summer");

        pond.report();
    }
}