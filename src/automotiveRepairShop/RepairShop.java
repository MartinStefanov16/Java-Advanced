package automotiveRepairShop;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RepairShop {
    private int capacity;
    private List<Vehicle> vehicles;

    public RepairShop(int capacity) {
        this.capacity = capacity;
        this.vehicles = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle){
        if (capacity > vehicles.size()){
            this.vehicles.add(vehicle);
        }
    }

    public boolean removeVehicle(String vin){
        for (Vehicle vehicle : this.vehicles) {
            if (vehicle.getVIN().equals(vin)){
                return this.vehicles.remove(vehicle);
            }
        }

        return false;
    }

    public int  getCount(){
        return this.vehicles.size();
    }

    public Vehicle getLowestMileage(){

        return this.vehicles.stream()
                .sorted((v1,v2) -> Integer.compare(v1.getMileage(), v2.getMileage()))
                .collect(Collectors.toList())
                .get(0);

    }

    public String report(){
        StringBuilder text = new StringBuilder();
        text.append("Vehicles in the preparatory:\n");

        //this.vehicles.forEach(v -> text.append(v.toString()));
        for (Vehicle vehicle : this.vehicles) {
            text.append(vehicle.toString() + "\n");
        }


        return text.toString();
    }
}
