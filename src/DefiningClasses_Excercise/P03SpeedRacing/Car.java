package DefiningClasses_Excercise.P03SpeedRacing;

public class Car {
    private String model;
    private double fuelAmount;
    private int kilometersTraveled;

    @Override
    public String toString() {
        return String.format("%s %.2f %d", model, fuelAmount, kilometersTraveled);
    }
}
