package DefiningClasses_Excercise.P03SpeedRacing;

public class Car {
    private String model;
    private double fuelAmount;
    private int kilometersTraveled;
    private double fuelCostPerKM;

    public void drive(int kilometersToDrive){
        // is the fuel enough?
        double fuelNeeded = kilometersToDrive * this.fuelCostPerKM;

        if (fuelNeeded <= this.fuelAmount) {
            this.fuelAmount -= fuelNeeded;
            this.kilometersTraveled += kilometersToDrive;
            //TODO DEBUG text
            //System.out.printf("Car milege is %d KM and it now has %.2f fuel remaining\n", this.kilometersTraveled, this.fuelAmount);
        } else {
            System.out.println("Insufficient fuel for the drive");
        }

    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setFuelAmount(double fuelAmount) {
        this.fuelAmount = fuelAmount;
    }

    public void setKilometersTraveled(int kilometersTraveled) {
        this.kilometersTraveled = kilometersTraveled;
    }

    public void setFuelCostPerKM(double fuelCostPerKM) {
        this.fuelCostPerKM = fuelCostPerKM;
    }

    public String getModel() {
        return model;
    }

    public double getFuelAmount() {
        return fuelAmount;
    }

    public int getKilometersTraveled() {
        return kilometersTraveled;
    }

    public double getFuelCostPerKM() {
        return fuelCostPerKM;
    }

    public Car(String model, double fuelAmount, double fuelCostPerKM) {
        this.model = model;
        this.fuelAmount = fuelAmount;
        this.fuelCostPerKM = fuelCostPerKM;
        this.kilometersTraveled = 0;
    }

    @Override
    public String toString() {
        return String.format("%s %.2f %d", model, fuelAmount, kilometersTraveled);
    }
}
