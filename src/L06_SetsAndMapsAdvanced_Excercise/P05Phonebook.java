package L06_SetsAndMapsAdvanced_Excercise;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static java.lang.System.in;

public class P05Phonebook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        Map<String, String> phoneBook = new HashMap<>();

        String input = scanner.nextLine();

        while (!input.equals("search")){
            String name = input.split("-")[0];
            String phoneNumber = input.split("-")[1];

            phoneBook.put(name,phoneNumber);

            input = scanner.nextLine();
        }

        input = scanner.nextLine();

        while (!input.equals("stop")){

            if (phoneBook.containsKey(input)) {
                System.out.printf("%s -> %s\n",input, phoneBook.get(input));
            } else {
                System.out.printf("Contact %s does not exist.\n", input);
            }
            input = scanner.nextLine();
        }
    }
}
