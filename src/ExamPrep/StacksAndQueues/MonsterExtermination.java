package ExamPrep.StacksAndQueues;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;

public class MonsterExtermination {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        // https://judge.softuni.org/Contests/Practice/Index/4231#0

        ArrayDeque<Integer> monsters = new ArrayDeque<>();

        Arrays.stream(scanner.nextLine().split(","))
                .mapToInt(Integer::parseInt)
                .forEach(monsters::offer);

        ArrayDeque<Integer> hero = new ArrayDeque<>();

        Arrays.stream(scanner.nextLine().split(","))
                .mapToInt(Integer::parseInt)
                .forEach(hero::push);

        int monstersKilled = 0;

        while (!monsters.isEmpty() && !hero.isEmpty()){
            int monsterArmor = monsters.peek();
            int heroAttack = hero.peek();

            if (heroAttack ==  monsterArmor) {
                monstersKilled++;
                hero.poll();
                monsters.pop();
                continue;
            }

            if (heroAttack >= monsterArmor){
                monstersKilled++;

                monsters.poll();
                heroAttack -= monsterArmor;

                if (hero.size() > 1){
                    // remove used element
                    hero.pop();

                    // return
                    int nextAttack = hero.pop();
                    hero.push(nextAttack + heroAttack);
                } else if (hero.size() == 1) {
                    hero.pop();
                    hero.push(heroAttack);
                }

            } else {
                // monster better
                hero.pop();

                monsterArmor -= heroAttack;
                monsters.poll();
                monsters.offer(monsterArmor);

            }


        }

        if (monsters.isEmpty()) {
            System.out.println("All monsters have been killed!");
        }

        if (hero.isEmpty()) {
            System.out.println("The soldier has been defeated.");
        }

        System.out.printf("Total monsters killed: %d", monstersKilled);

    }
}
