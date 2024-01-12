package L01_StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

import static java.lang.System.in;

public class p01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        ArrayDeque<String> stack = new ArrayDeque<>();

        String command = scanner.nextLine();

        while (!command.equals("Home")){

            if (command.equals("back")) {
                if (stack.size() < 2){
                    System.out.println("no previous URLs");
                    command = scanner.nextLine();
                    continue;
                }
                stack.pop();
                System.out.println(stack.peek());
                command = scanner.nextLine();
                continue;


            }

            stack.push(command);
            System.out.println(stack.peek());



            command = scanner.nextLine();
        }
    }
}
