package automotiveRepairShop;

public class Main {
    public static void main(String[] args) {

        //Initialize the repository (RepairShop)
        RepairShop shop = new RepairShop(5);
        shop.getCount();

        shop.addVehicle(new Vehicle("ass", 100, "ded"));



    }
}
