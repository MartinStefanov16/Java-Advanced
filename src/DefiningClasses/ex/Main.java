package DefiningClasses.ex;

public class Main {
    public static void main(String[] args) {

        Dice myDice = new Dice();

        myDice.setColour("blue");
        myDice.setSides(6);

        System.out.println(myDice.getColour());
        System.out.println(myDice.getSides());
        System.out.println();
        System.out.println(myDice);
    }
}
