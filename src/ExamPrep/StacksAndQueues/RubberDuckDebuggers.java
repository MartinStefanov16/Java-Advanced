package ExamPrep.StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;

public class RubberDuckDebuggers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        // https://judge.softuni.org/Contests/Practice/Index/3908#0

        ArrayDeque<Integer> timeToCompleteTask = new ArrayDeque<>();
        Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .forEach(timeToCompleteTask::offer);

        ArrayDeque<Integer> numberOfTasksGiven = new ArrayDeque<>();
        Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .forEach(numberOfTasksGiven::push);

        int darthVaderDucky = 0;
        int thorDucky = 0;
        int bigBlueRubberDucky = 0;
        int smallYellowRubberDucky = 0;


        while (!timeToCompleteTask.isEmpty() && !numberOfTasksGiven.isEmpty()){
            int time = timeToCompleteTask.peek();
            int task = numberOfTasksGiven.peek();

            int result = time * task;


            // if result is above 240

            // decrese numberOfTasksGiven by 2
            // move the time value to the end

            if (result > 240) {
                //entered
                task -= 2;
                numberOfTasksGiven.pop();
                numberOfTasksGiven.push(task);

                timeToCompleteTask.poll();
                timeToCompleteTask.offer(time);


            } else {
                // entered

                // if result is within ranges 0-240
                // give ducky
                //remove time
                //remove task given
                timeToCompleteTask.poll();
                numberOfTasksGiven.pop();

                if (result >= 0 && result <= 60) {
                    darthVaderDucky++;
                } else if (result >= 61 && result <= 120){
                    thorDucky++;
                } else if (result >= 121 && result <= 180){
                    bigBlueRubberDucky++;
                } else if (result >= 181 && result <= 240){
                    smallYellowRubberDucky++;
                }

            }


        }
        System.out.println("Congratulations, all tasks have been completed! Rubber ducks rewarded:");

        System.out.println("Darth Vader Ducky: " + darthVaderDucky);
        System.out.println("Thor Ducky: " + thorDucky);
        System.out.println("Big Blue Rubber Ducky: " + bigBlueRubberDucky);
        System.out.println("Small Yellow Rubber Ducky: " + smallYellowRubberDucky);



    }
}
