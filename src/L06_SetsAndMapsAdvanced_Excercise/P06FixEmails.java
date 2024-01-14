package L06_SetsAndMapsAdvanced_Excercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

import static java.lang.System.in;

public class P06FixEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        Map<String, String> emails = new LinkedHashMap<>();

        String input = scanner.nextLine();

        while (!input.equals("stop")){
            String email = scanner.nextLine();
            if (!email.contains(".us") && !email.contains(".uk") && !email.contains(".com")){
                emails.put(input, email);
            }


            input = scanner.nextLine();
        }
        emails.entrySet()
                .forEach(entry -> System.out.printf("%s -> %s\n", entry.getKey(), entry.getValue()));
    }
}
