package fishingPond;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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

    public boolean removeFish(String species){

        for (Fish fish : this.fishes) {

            if (fish.getSpecies().equals(species)) {
                this.fishes.remove(fish);
                return true;
            }

        }

        return false;
    }

    public Fish getOldestFish(){
//        int oldestFish = Integer.MIN_VALUE;
//
//        for (Fish fish : this.fishes) {
//            if (fish.getAge() > oldestFish){
//                oldestFish = fish.getAge();
//            }
//        }
//        return oldestFish;

       return this.fishes.stream()
                .sorted((f1,f2) -> Integer.compare(f2.getAge(), f1.getAge()))
                .collect(Collectors.toList())
                .get(0);



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

        text.append("Fishes in the pond:\n");

        this.fishes.forEach(f -> text.append(f.toString()));

        return text.toString();
    }

}
