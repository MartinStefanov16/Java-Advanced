package sharkHaunt;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Basin {
    private String name;
    private int capacity;
    private List<Shark> sharks;

    public Basin(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.sharks = new ArrayList<>();
    }

    public void addShark(Shark shark){
        if (capacity > this.sharks.size()){
            this.sharks.add(shark);
        } else {
            // TODO - print Line?
            System.out.println("This basin is at full capacity!");
        }
    }

    public boolean removeShark(String kind){
        for (Shark shark : this.sharks) {
            if (shark.getKind().equals(kind)){
                this.sharks.remove(shark);
                return true;
            }
        }

        return false;
    }

    public Shark getLargestShark(){
//        Shark largestShark = new Shark();
//        int maxSize = Integer.MIN_VALUE;
//        for (Shark shark : this.sharks) {
//            if (shark.getLength() > maxSize){
//                largestShark = shark;
//                maxSize = shark.getLength();
//
//            }
//        }
//
//        return largestShark;

        return this.sharks.stream().sorted((c1,c2) -> Integer.compare(c2.getLength(), c1.getLength()))
                .collect(Collectors.toList())
                .get(0);
    }

    public Shark getShark(String kind){
        for (Shark shark : this.sharks) {
            if (shark.getKind().equals(kind)){
                return shark;
            }
        }
        return null;
    }

    public int getCount(){
        return this.sharks.size();
    }

    public int getAverageLength(){
        int totalLength = 0;

        for (Shark shark : this.sharks) {
            totalLength += shark.getLength();
        }


        // TODO round up/down?
        return totalLength / this.sharks.size();
    }

    public String report(){
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Sharks in %s:\n",name)).trimToSize();

        this.sharks.stream().forEach(s -> sb.append(s.toString() + "\n"));


        return sb.toString().trim();
    }
}
