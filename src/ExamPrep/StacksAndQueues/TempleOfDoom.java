package ExamPrep.StacksAndQueues;

import java.util.*;
import java.util.stream.Collectors;

import static java.lang.System.in;

public class TempleOfDoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        // https://judge.softuni.org/Contests/Practice/Index/4082#0

        ArrayDeque<Integer> tools = new ArrayDeque<>();

        Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .forEach(tools::offer);

        ArrayDeque<Integer> substances = new ArrayDeque<>();

        Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .forEach(substances::push);

        List<Integer> challenges = new ArrayList<>(Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList()));

        boolean endReached = false;

        while (!tools.isEmpty() && !substances.isEmpty()) {
            int strength =  tools.peek() * substances.peek();

            if (challengeSolved(strength, challenges)){
                challenges.remove(Integer.valueOf(strength));
                tools.poll();
                substances.pop();
            } else {
                int newTool = tools.poll() + 1 ;
                tools.offer(newTool);

                int newSubstance = substances.pop() - 1;
                if (newSubstance != 0) {
                    substances.push(newSubstance);
                }
            }

            if (challenges.isEmpty()) {
                endReached = true;
                break;
            }
        }

        if (endReached) {
            System.out.println("Harry found an ostracon, which is dated to the 6th century BCE.");
        } else {
            System.out.println("Harry is lost in the temple. Oblivion awaits him.");
        }

        if (!tools.isEmpty()) {
            System.out.print("Tools: ");
            System.out.println(tools.toString().replaceAll("[\\[\\]]", ""));
        }

        if (!substances.isEmpty()){
            System.out.print("Substances: ");
            System.out.println(substances.toString().replaceAll("[\\[\\]]", ""));
        }

        if (!challenges.isEmpty()){
            System.out.print("Challenges: ");
            System.out.println(challenges.toString()
                    .replace("[", "")
                    .replace("]", "")
                    .trim()
                    .replaceAll("\\s+"," "));
        }

    }

    private static boolean challengeSolved(int strength, List<Integer> challenges) {
        return challenges.stream().anyMatch(e -> e == strength);

    }
}
