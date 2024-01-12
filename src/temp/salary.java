package temp;

import java.util.Scanner;

import static java.lang.System.in;

public class salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int browserTabs = Integer.parseInt(scanner.nextLine());
        int salary = Integer.parseInt(scanner.nextLine());


        for (int i = 0; i < browserTabs; i++) {
            String website = scanner.nextLine();

            switch (website) {
                case "Facebook":
                    salary -= 150;
                    break;
                case "Instagram":
                    salary -= 100;
                    break;
                case "Reddit":
                    salary -= 50;
                    break;
                default:
                    continue;

            }

            if (salary <= 0) {
                System.out.println("Lost salary");
                return;
            }

        }
        System.out.println(salary);

    }
}
