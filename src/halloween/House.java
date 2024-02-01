package halloween;

import java.util.ArrayList;
import java.util.List;

public class House {
    private int capacity;
    private List<Kid> data;

    public House(int capacity) {
        this.capacity = capacity;
        this.data = new ArrayList<>();
    }

    public void addKid(Kid kid){
        if (capacity > data.size()){
            data.add(kid);
        }
    }

    public boolean removeKid(String name){
        for (Kid kid : this.data) {
            if (kid.getName().equals(name));
            this.data.remove(kid);
            return true;
        }
        return false;
    }

    public Kid getKid(String street){
        for (Kid kid : this.data) {
            if (kid.getName().equals(street));
            return kid;
        }
        return null;
    }

    public int getAllKids(){
        return data.size();
    }

    public void getStatistics(){
        StringBuilder text = new StringBuilder();
        text.append("Children who visited a house for candy:\n");

        this.data.stream().forEach(k -> text.append(k.toString()));

    }
}
