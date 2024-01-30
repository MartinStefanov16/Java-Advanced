package DefiningClasses_Excercise.test;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {


        List<Trainer> trainers = new ArrayList<>();


            Trainer trainer = new Trainer("marty", 1);
            Trainer trainer2 = new Trainer("ivan", 3);
            Trainer trainer3 = new Trainer("mike", 2);
            trainers.add(trainer);
            trainers.add(trainer2);
            trainers.add(trainer3);

//            trainers.stream().sorted((t1,t2) -> Integer.compare(t1.getBadges(), t2.getBadges()))
//                    .forEach(System.out::println);

        trainers.stream().sorted((t1,t2) -> Integer.compare(t1.getBadges(), t2.getBadges()))
                .forEach(System.out::println);



    }
}
