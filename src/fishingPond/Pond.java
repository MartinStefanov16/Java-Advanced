package fishingPond;

import java.util.ArrayList;
import java.util.List;

public class Pond {
    private List<Fish> fishes;
    private int capacity;

    public Pond(int capacity) {
        this.capacity = capacity;
        this.fishes = new ArrayList<>();
    }

    public void addFish(Fish fish){
        if (capacity > fishes.size()){
            this.fishes.add(fish);
        }
    }

    public boolean  removeFish(String species){

        if (this.fishes.contains(species)) {
            this.fishes.remove(species);
            return true;
        }

        return false;
    }

    public int getOldestFish(){
        int oldestFish = Integer.MIN_VALUE;

        for (Fish fish : this.fishes) {
            if (fish.getAge() > oldestFish){
                oldestFish = fish.getAge();
            }
        }
        return oldestFish;
    }

    public Fish getFish(String species){
        for (Fish fish : this.fishes){
            if (fish.getSpecies().equals(species)){
                return fish;
            }
        }

        return null;
    }

    public int getCount(){
        return this.fishes.size();
    }

    public int getVacancies(){
        return this.capacity - this.fishes.size();
    }

    public String report(){
        StringBuilder text = new StringBuilder();

        text.append("Fishes in the pond:/n");

        this.fishes.forEach(f -> text.append(f.toString()));

        return text.toString();
    }

}
